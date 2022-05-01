grammar SimpleLOOP;

@header{
     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.classDec.*;
     import main.ast.nodes.declaration.variableDec.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.nodes.statement.set.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import main.ast.types.set.*;
     import main.ast.types.functionPointer.*;
     import main.ast.types.array.*;
     import java.util.*;
 }

simpleLOOP returns [Program simpleLOOPProgram]
    :
    NEWLINE* p = program {$simpleLOOPProgram = $p.programRet;} NEWLINE* EOF
    ;

program returns [Program programRet]
    :
    {
        $programRet = new Program();
        int line = 1;
        $programRet.setLine(line);
    }
    (v = varDecStatement NEWLINE+
        {
            for (VariableDeclaration varDec: $v.varDecStmtRet)
                $programRet.addGlobalVariable(varDec);
        }
    )*
    (c = classDeclaration NEWLINE+ {$programRet.addClass($c.classDeclarationRet);})*
    ;

constructor returns [ConstructorDeclaration constructorDecRet]
    :
    PUBLIC init = INITIALIZE
    {
        $constructorDecRet = new ConstructorDeclaration();
        $constructorDecRet.setMethodName(new Identifier($init.text));
        $constructorDecRet.setPrivate(false);
        $constructorDecRet.setLine($init.getLine());
    }
    args=methodArgsDec { $constructorDecRet.setArgs($args.methodArgsDecRet); } NEWLINE*
    b=methodBody
    {
        $constructorDecRet.setLocalVars($b.localVars);
        $constructorDecRet.setBody($b.statements);
    }
    ;

classDeclaration returns [ClassDeclaration classDeclarationRet]
    :
    c=CLASS cid1=class_identifier
    {
        $classDeclarationRet  = new ClassDeclaration($cid1.classIdentifierRet.getClassName());
        $classDeclarationRet.setLine($c.getLine());
    }
    (LESS_THAN cid2=class_identifier
    { $classDeclarationRet.setParentClassName($cid2.classIdentifierRet.getClassName()); }
    )?
    NEWLINE*
    (
    (LBRACE NEWLINE+
    (d1=decleration
    {
        if ($d1.declarationRet instanceof ConstructorDeclaration)
            $classDeclarationRet.setConstructor($d1.declarationRet);
        if ($d1.declarationRet instanceof  FieldDeclaration)
            $classDeclarationRet.addField($d1.declarationRet);
        if ($d1.declarationRet instanceof MethodDeclaration)
            $classDeclarationRet.addMethod($d1.declarationRet);
    }
    NEWLINE+)+
    RBRACE
    )
    |
    (d2=decleration)
    {
        for (Declaration dec : $d2.declarationRet) {
            if (dec instanceof ConstructorDeclaration)
                $classDeclarationRet.setConstructor(dec);
            if (dec instanceof  FieldDeclaration)
                $classDeclarationRet.addField(dec);
            if (dec instanceof MethodDeclaration)
                $classDeclarationRet.addMethod(dec);
        }
    }
    )
    ;

decleration returns [ArrayList<Declaration> declarationRet] locals [boolean isPrivate]
    :
    ((( (PUBLIC {$isPrivate = false} | PRIVATE {$isPrivate = true} )
    (v=varDecStatement
    {
        for (VariableDeclaration varDec: $v.varDecStmtRet)
            $declarationRet.add( new FieldDeclaration(varDec, $isPrivate) );
    }
    |
    m=method
    {
        $m.methodRet.setPrivate($isPrivate);
        $declarationRet.add($m.methodRet);
    }
    ))
    |
    c=constructor { $declarationRet.add($c.constructorDecRet); })
    )
    ;

method returns [MethodDeclaration methodRet] locals [Type returnType]
    :
    ( t=type {$returnType = $t.typeRet} | VOID {$returnType = new NullType();} )
    id=identifier
    {
        $methodRet = new MethodDeclaration();
        $methodRet.setMethodName($id.identifierRet);
        $methodRet.setReturnType($returnType);
        $methodRet.setLine($id.identifierRet.getLine());
    }
     args=methodArgsDec {$methodRet.setArgs($args.methodArgsDecRet)} NEWLINE*
     b=methodBody
     {
        $methodRet.setLocalVars($b.localVars);
        $methodRet.setBody($b.statements);
     }
    ;

methodBody returns [ArrayList<VariableDeclaration> localVars, ArrayList<Statement> statements]
    :
    {
        $localVars = new ArrayList<>();
        $statements = new ArrayList<>();
    }
    (LBRACE NEWLINE+ (v1=varDecStatement
    {
        for (VariableDeclaration varDec: $v1.varDecStmtRet)
            $localVars.add(varDec);
    }
    NEWLINE+)*
    (s1=singleStatement { $statements.add($s1.singleStmtRet); }
    NEWLINE+)* RBRACE)
    |
    ((v2=varDecStatement)
    {
        for (VariableDeclaration varDec: $v2.varDecStmtRet)
            $localVars.add(varDec);
    }
    |
    (s2=singleStatement) { $statements.add($s2.singleStmtRet); }
    )
    ;

methodArgsDec returns [ArrayList<VariableDeclaration> methodArgsDecRet]
    :
    { $methodArgsDecRet = new ArrayList<>(); }
    LPAR (arg1=argDec { $methodArgsDecRet.add($arg1.argDecRet); } ((ASSIGN orExpression)
    | (COMMA arg2=argDec  { $methodArgsDecRet.add($arg2.argDecRet); })*)
    (COMMA arg3=argDec { $methodArgsDecRet.add($arg3.argDecRet); }
    ASSIGN orExpression)*)? RPAR
    ;

argDec returns [VariableDeclaration argDecRet]
    :
    t=type i=identifier
    {
        $argDecRet = new VariableDeclaration($t.typeRet, $i.identifierRet);
        $argDecRet.setLine($i.identifierRet.getLine());
    }
    ;

methodArgs returns [ArrayList<Expression> methodArgsRet]
    :
    { $methodArgsRet = new ArrayList<>(); }
    (e1=expression { $methodArgsRet.add($e1.expressionRet); }
    (COMMA e2=expression { $methodArgsRet.add($e2.expressionRet); } )*
    )?
    ;

body returns [Statement bodyRet]
    :
     (b=blockStatement { $bodyRet = $b.blockStmtRet; }
     |
     (NEWLINE+ s=singleStatement { $bodyRet = $s.singleStmtRet; })
     )
     ;

blockStatement returns [BlockStmt blockStmtRet]
    :
    { $blockStmtRet = new BlockStmt(); }
    lb=LBRACE NEWLINE+ (s=singleStatement
    {
        $blockStmtRet.setLine($lb.getLine());
        $blockStmtRet.addStatement($s.singleStmtRet);
    }
    NEWLINE+)* RBRACE
    ;

singleStatement returns [Statement singleStmtRet]
    :
    if=ifStatement {$singleStmtRet = $if.ifStmtRet;}
    | print=printStatement {$singleStmtRet = $print.printStmtRet;}
    | mcs=methodCallStmt {$singleStmtRet = $mcs.methodCallStmtRet;}
    | ret=returnStatement {$singleStmtRet = $ret.returnStmtRet;}
    | assign=assignmentStatement {$singleStmtRet = $assign.assignmentStmtRet;}
    | loop=loopStatement {$singleStmtRet = $loop.loopStmtRet;}
    | add=addStatement {$singleStmtRet = $add.addStmtRet;}
    | merge=mergeStatement {$singleStmtRet = $merge.mergeStmtRet;}
    | delete=deleteStatement {$singleStmtRet = $delete.deleteStmtRet;}
    ;

addStatement returns [SetAdd addStmtRet]
    :
    setarg=expression DOT a=ADD LPAR elmarg=orExpression RPAR
    {
        $addStmtRet = new SetAdd($setarg.expressionRet, $elmarg.orExprRet);
        $addStmtRet.setLine($a.getLine());
    }
    ;

mergeStatement returns [SetMerge mergeStmtRet]
    :
    {ArrayList<Expression> elemArgs = new ArrayList<>();}
    setarg=expression DOT m=MERGE LPAR e1=orExpression {elemArgs.add($e1.orExprRet);}
    (COMMA e2=orExpression {elemArgs.add($e2.orExprRet);} )* RPAR
    {
        $mergeStmtRet = new SetMerge($setarg.expressionRet, elemArgs);
        $mergeStmtRet.setLine($m.getLine());
    }
    ;

deleteStatement returns [SetDelete deleteStmtRet]
    :
    setarg=expression DOT d=DELETE LPAR elem=orExpression RPAR
    {
        $deleteStmtRet = new SetDelete($setarg.expressionRet, $elem.orExprRet);
        $deleteStmtRet.setLine($d.getLine());
    }
    ;

varDecStatement returns [ArrayList<VariableDeclaration> varDecStmtRet]
    :
    { $varDecStmtRet = new ArrayList<>(); }
    t=type id1=identifier
    {
        ٰVariableDeclaration newVarDec = new ٰVariableDeclaration($id1.identifierRet, $t.typeRet);
        newVarDec.setLine($id1.identifierRet.getLine());
        $varDecStmtRet.add(newVarDec);
    }
    (COMMA id2=identifier
    {
        VariableDeclaration newVarDec = new ٰVariableDeclaration($id2.identifierRet, $t.typeRet);
        newVarDec.setLine($id2.identifierRet.getLine());
        $varDecStmtRet.add(newVarDec);
    }
    )*
    ;

ifStatement returns [ConditionalStmt ifStmtRet]
    :
    i=IF c=condition b=body
    {
        $ifStmtRet = new ConditionalStmt($c.conditionRet, $b.bodyRet);
        $ifStmtRet.setLine($i.getLine());
    }
    (elif=elsifStatement { $ifStmtRet.addElsif($elif.elsifStmtRet); } )*
    (else=elseStatement { $ifStmtRet.setElseBody($else.elseStmtRet); } )?
    ;

elsifStatement returns [ElsifStmt elsifStmtRet]
    :
     NEWLINE* ei=ELSIF c=condition b=body
     {
        $elsifStmtRet = new ElsifStmt($c.conditionRet, $b.bodyRet);
        $elsifStmtRet.setLine($ei.getLine());
     }
    ;

condition returns [Expression conditionRet]
    :
    (LPAR e1=expression { $conditionRet =  $e1.expressionRet} RPAR)
    | (e2=expression { $conditionRet = $e2.expressionRet } )
    ;

elseStatement returns [Statement elseStmtRet]
    :
    NEWLINE* ELSE b=body { $elseStmtRet = $b.bodyRet; }
    ;

printStatement returns [PrintStmt printStmtRet]
    :
    p=PRINT LPAR e=expression
    {
        $printStmtRet = new PrintStmt($e.expressionRet);
        $printStmtRet.setLine($p.getLine());
    }
    RPAR
    ;

//todo
methodCallStmt returns [MethodCallStmt methodCallStmtRet] locals [Expression inst, MethodCall mc]
    :
    a=accessExpression {$inst = $.accessExprRet;}
    (DOT (init=INITIALIZE {$inst = new Identifier($init.text);}
    | i=identifier {$inst = $i.identifierRet;} )
    )*
    ((lp=LPAR args=methodArgs RPAR)
    {
        $mc = new MethodCall($inst, $args.methodArgsRet);
        $mc.setLine($lp.getLine());
    }
    |
    ((INC | DEC))
    )
    {
        $methodCallStmtRet = new MethodCallStmt($mc);
        $methodCallStmtRet.setLine($mc.getLine());
    }
    ;

returnStatement returns [ReturnStmt returnStmtRet]
    :
    { $returnStmtRet = new ReturnStmt(); }
    r=RETURN { $returnStmtRet.setLine($r.getLine()); }
    (e=expression { $returnStmtRet.setReturnedExpr($e.expressionRet); } )?
    ;

assignmentStatement returns [AssignmentStmt assignmentStmtRet]
    :
    e1=orExpression a=ASSIGN e2=expression
    {
        $assignmentStmtRet = new AssignmentStmt($e1.orExprRet, $e2.expressionRet);
        $assignmentStmtRet.setLine($a.getLine());
    }
    ;

loopStatement returns [EachStmt loopStmtRet] locals [Expression list]
    :
    ((a=accessExpression {$list = $a.accessExprRet;})
    |
    (lp=LPAR e1=expression DOT DOT e2=expression RPAR
    {
        $list = new RangeExpression($e1.expressionRet, $e2.expressionRet);
        $list.setLine($lp.getLine());
    }
    ))
    DOT each=EACH DO BAR i=identifier BAR
    {
        $loopStmtRet = new EachStmt($i.identifierRet, $list.expressionRet);
        $loopStmtRet.setLine($each.getLine());
    }
    b=body { $loopStmtRet.setBody($b.bodyRet); }
    ;

expression returns [Expression expressionRet]
    :
    te=ternaryExpression { $expressionRet = $te.ternaryExprRet; }
    (a=ASSIGN e=expression
    {
        BinaryOperator op = BinaryOperator.assign;
        $expressionRet = new BinaryExpression($expressionRet, $e.expressionRet, op);
        $expressionRet.setLine(op.getLine());
    }
    )?
    (DOT inc=INCLUDE LPAR oe=orExpression RPAR
    {
        $expressionRet = new SetInclude($expressionRet, $oe.orExprRet);
    }
    )?
    ;

ternaryExpression returns [Expression ternaryExprRet]
    :
    e1=orExpression { $ternaryExprRet = $e1.orExprRet; }
    (q=TIF te=ternaryExpression TELSE fe=ternaryExpression
    {
        $ternaryExprRet = new TernaryExpression($ternaryExprRet ,$te.ternaryExprRet, $fe.ternaryExprRet);
        $ternaryExprRet.setLine($q.getLine());
    }
    )?
    ;

orExpression returns [Expression orExprRet]
    :
    e1=andExpression { $orExprRet = $e1.andExprRet }
    (o=OR e2=andExpression
    {
        BinaryOperator op = BinaryOperator.or;
        $orExprRet = new BinaryExpression($orExprRet, $e2.andExprRet, op);
        $orExprRet.setLine($o.getLine());
    } )*
    ;

andExpression returns [Expression andExprRet]
    :
    e1=equalityExpression { $andExprRet = $e1.equalityExprRet; }
    (o=AND e2=equalityExpression
    {
        BinaryOperator op = BinaryOperator.and;
        $andExprRet = new BinaryExpression($andExprRet, $e2.equalityExprRet, op);
        $andExprRet.setLine($o.getLine());
    })*
    ;

equalityExpression returns [Expression equalityExprRet]
    :
    e1=relationalExpression { $equalityExprRet = $e1.relationalExprRet; }
    (o=EQUAL e2=relationalExpression
    {
        BinaryOperator op = BinaryOperator.eq;
        $equalityExprRet = new BinaryExpression($equalityExprRet, $e2.relationalExprRet, op);
        $equalityExprRet.setLine($o.getLine());
    }
    )*
    ;

relationalExpression returns [Expression relationalExprRet] locals [BinaryOperator op, int line]
    :
    e1=additiveExpression { $relationalExprRet = $e1.additiveExprRet; }
    (
    (o1=GREATER_THAN { $op = BinaryOperator.gt; $line = $o1.getLine();}
    |
    o2=LESS_THAN { $op = BinaryOperator.lt; $line = $o2.getLine(); }
    )
    e2=additiveExpression
    {
        $relationalExprRet = new BinaryExpression($relationalExprRet, $e2.additiveExprRet, $op);
        $relationalExprRet.setLine($line);
    }
    )*
    ;

additiveExpression returns [Expression additiveExprRet] locals [BinaryOperator op, int line]
    :
    e1=multiplicativeExpression { $additiveExprRet = $e1.multExprRet; }
    (
    (o1=PLUS { $op = BinaryOperator.add; $line = $o1.getLine(); }
    |
    o2=MINUS { $op = BinaryOperator.sub; $line = $o2.getLine(); }
    )
    e2=multiplicativeExpression
    {
        $additiveExprRet = new BinaryExpression($additiveExprRet, $e2.multExprRet, $op);
        $additiveExprRet.setLine($line);
    }
    )*
    ;

multiplicativeExpression returns [Expression multExprRet] locals [BinaryOperator op, int line]
    :
    e1=preUnaryExpression { $multExprRet = $e1.preUnaryExprRet; }
    (
    (o1=MULT {$op = BinaryOperator.mult; $line = $o1.getLine(); }
    |
    o2=DIVIDE { $op = BinaryOperator.div; $line = $o2.getLine(); }
    )
    e2=preUnaryExpression
    {
        $multExprRet = new BinaryExpression($multExprRet, $e2.preUnaryExprRet, $op);
        $multExprRet.setLine($line);
    }
    )*
    ;

preUnaryExpression returns [Expression preUnaryExprRet] locals[UnaryOperator op, int line]
    :
    (
    (o1=NOT { $op = UnaryOperator.not; $line = $o1.getLine(); }
    |
    o2=MINUS { $op = UnaryOperator.minus; $line = $o2.getLine(); }
    )
    e1=preUnaryExpression
    {
        $preUnaryExprRet = new UnaryExpression($e1.preUnaryExprRet, $op);
        $preUnaryExprRet.setLine($line);
    }
    )
    |
    e2=postUnaryExpression { $preUnaryExprRet = $e2.postUnaryExprRet; }
    ;

postUnaryExpression returns [Expression postUnaryExprRet]
    :
    e1=accessExpression { $postUnaryExprRet = $e1.accessExprRet; }
    (
    (o1=INC
    {
        UnaryOperator op1 = UnaryOperator.postinc;
        $postUnaryExprRet = new UnaryExpression($postUnaryExprRet, op1);
        $postUnaryExprRet.setLine($o1.getLine());
    }
    |
    o2=DEC
    {
        UnaryOperator op2 = UnaryOperator.postdec;
        $postUnaryExprRet = new UnaryExpression($postUnaryExprRet, op2);
        $postUnaryExprRet.setLine($o2.getLine());
    }
    )
    )?
    ;

accessExpression returns [Expression accessExprRet]
    :
    e1=otherExpression { $accessExprRet = $e1.otherExprRet; }
    (
    (lp=LPAR
    m=methodArgs
    {
        $accessExprRet = new MethodCall($accessExprRet, $m.methodArgsRet);
        $accessExprRet.setLine($lp.getLine());
    }
    RPAR
    )
    |
    (DOT
    (identifier | NEW | INITIALIZE)
    )
    )*
    (
    (DOT (id2=identifier))
    |
    (lb=LBRACK idx=expression RBRACK)
    {
        $accessExprRet = new ArrayAccessByIndex($accessExprRet, $idx.expressionRet);
        $accessExprRet.setLine($lb.getLine());
    }
    )*
    ;

otherExpression returns [Expression otherExprRet]
    :
    s=SELF {$otherExprRet = new SelfClass(); $otherExprRet.setLine($s.getLine());}
    | c=class_identifier { $otherExprRet = $c.classIdentifierRet; }
    | v=value { $otherExprRet = $v.valueRet;}
    | id=identifier { $otherExprRet = $id.identifierRet; }
    | sn=setNew { $otherExprRet = $sn.setNewRet; }
    | LPAR ex=expression RPAR { $otherExprRet = $ex.expressionRet; }
    ;


setNew returns [SetNew setNewRet]
    :
    {
        $setNewRet = new SetNew();
        ArrayList<Expression> args = new ArrayList<>();
    }
    SET DOT NEW LPAR (LPAR o1=orExpression { args.add($o1.orExprRet) }
    (COMMA o2=orExpression { args.add($o2.orExprRet) } )* RPAR)?  RPAR
    ;

value returns [Value valueRet]
    :
    v1=boolValue { $valueRet = $v1.boolValueRet; }
    |
    v2=INT_VALUE
    {
        $valueRet = new IntValue($v2.int);
        $valueRet.setLine($v2.getLine());
    }
    ;

boolValue returns [BoolValue boolValueRet]
    :
    t=TRUE
    {
        $boolValueRet = new BoolValue(true);
        $boolValueRet.setLine($t.getLine());
    }
    |
    f=FALSE
    {
        $boolValueRet = new BoolValue(false);
        $boolValueRet.setLine($f.getLine());
    }
    ;

class_identifier returns [ClassType classIdentifierRet]
    :
    id=CLASS_IDENTIFIER
    { $classIdentifierRet = new ClassType($id.text); }
    ;

identifier returns [Identifier identifierRet, int line]
    :
    id=IDENTIFIER
    {
        $identifierRet = new Identifier($id.text);
        $identifierRet.setLine($id.getLine());
        $line = $id.getLine();
    }
    ;

type returns [Type typeRet]
    :
    INT { $typeRet = new IntType(); }
    | BOOL { $typeRet = new BoolType(); }
    | a=array_type { $typeRet = $a.arrayTypeRet; }
    | f=fptr_type { $typeRet = $f.fptrTypeRet; }
    | s=set_type { $typeRet = $s.setTypeRet; }
    | c=class_identifier { $typeRet = $c.classIdentifierRet; }
    ;

array_type returns [ArrayType arrayTypeRet]
    :
    { $arrayTypeRet = new ArrayType(); }
    (INT { $arrayTypeRet.setType(new IntType()); }
    | BOOL { $arrayTypeRet.setType(new BoolType()); }
    | c=class_identifier { $arrayTypeRet.setType(c.classIdentifierRet); }
    )
    { demensions = new ArrayList<Integer>(); }
    (LBRACK e=expression RBRACK { demensions.add($e.expressionRet); })+
    ;

fptr_type returns [FptrType fptrTypeRet]
    :
    {
        $fptrTypeRet = new FptrType();
        $fptrTypeRet.setArgumentsTypes(new ArrayList<Type>());
    }
    FPTR LESS_THAN
    (
    VOID
    |
    (t1=type { $fptrTypeRet.addArgumentType($t1.typeRet); }
    (COMMA t2=type { $fptrTypeRet.addArgumentType($t2.typeRet); } )*
    )
    )
    ARROW
    (
    t3=type { $fptrTypeRet.setReturnType($t3.typeRet); }
    |
    VOID { $fptrTypeRet.setReturnType(new NullType()); }
    ) GREATER_THAN
    ;

set_type returns [SetType setTypeRet]
    :
    SET LESS_THAN (INT) GREATER_THAN
    { $setTypeRet = new SetType(); }
    ;


LINE_BREAK: ('//\n') -> skip;

CLASS: 'class';
PUBLIC: 'public';
PRIVATE: 'private';
INITIALIZE: 'initialize';
NEW: 'new';
SELF: 'self';


RETURN: 'return';
VOID: 'void';


DELETE: 'delete';
INCLUDE: 'include';
ADD: 'add';
MERGE: 'merge';
PRINT: 'print';


IF: 'if';
ELSE: 'else';
ELSIF: 'elsif';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';
INC: '++';
DEC: '--';

EQUAL: '==';
GREATER_THAN: '>';
LESS_THAN: '<';

ARROW: '->';
BAR: '|';

AND: '&&';
OR: '||';
NOT: '!';

TIF: '?';
TELSE: ':';

TRUE: 'true';
FALSE: 'false';
NULL: 'null';

BEGIN: '=begin';
END: '=end';

INT: 'int';
BOOL: 'bool';
FPTR: 'fptr';
SET: 'Set';
EACH: 'each';
DO: 'do';

ASSIGN: '=';
SHARP: '#';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

COMMA: ',';
DOT: '.';
SEMICOLON: ';' -> skip;
NEWLINE: '\n';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-z_][A-Za-z0-9_]*;
CLASS_IDENTIFIER: [A-Z][A-Za-z0-9_]*;

COMMENT: '#' .*? '\n' -> skip;
MLCOMMENT: ('=begin' .*? '=end') -> skip;
WS: ([ \t\r]) -> skip;
