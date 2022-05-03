package main.visitor.name;

import main.ast.nodes.*;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.*;
import main.visitor.*;

import javax.swing.plaf.nimbus.State;

public class ASTTreePrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message) {
        System.out.println("Line " + line + ": " + message);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables())
            variableDeclaration.accept(this);
        for (ClassDeclaration classDeclaration: program.getClasses())
            classDeclaration.accept(this);
        return null;
    }
    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        messagePrinter(classDeclaration.getLine(), classDeclaration.toString());
        classDeclaration.getClassName().accept(this);
        if(classDeclaration.getParentClassName() != null)
            classDeclaration.getParentClassName().accept(this);
        for(FieldDeclaration fieldDeclaration : classDeclaration.getFields())
            fieldDeclaration.accept(this);
        if (classDeclaration.getConstructor() != null)
            classDeclaration.getConstructor().accept(this);
        for (MethodDeclaration methodDeclaration : classDeclaration.getMethods())
            methodDeclaration.accept(this);
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        messagePrinter(constructorDeclaration.getLine(), constructorDeclaration.toString());
        constructorDeclaration.getMethodName().accept(this);
        for (VariableDeclaration arg : constructorDeclaration.getArgs())
            if (arg != null)
                arg.accept(this);
        for (VariableDeclaration localVar : constructorDeclaration.getLocalVars())
            if (localVar != null)
                localVar.accept(this);
        for (Statement statement : constructorDeclaration.getBody())
            if (statement != null)
                statement.accept(this);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        messagePrinter(methodDeclaration.getLine(), methodDeclaration.toString());
        methodDeclaration.getMethodName().accept(this);
        for (VariableDeclaration arg : methodDeclaration.getArgs())
            arg.accept(this);
        for (VariableDeclaration localVar : methodDeclaration.getLocalVars())
            localVar.accept(this);
        for (Statement statement : methodDeclaration.getBody())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        messagePrinter(fieldDeclaration.getLine(), fieldDeclaration.toString());
        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        messagePrinter(varDeclaration.getLine(), varDeclaration.toString());
        varDeclaration.getVarName().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        messagePrinter(assignmentStmt.getLine(), assignmentStmt.toString());
        assignmentStmt.getlValue().accept(this);
        assignmentStmt.getrValue().accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        messagePrinter(blockStmt.getLine(), blockStmt.toString());

        if (blockStmt != null)
            for (Statement statement : blockStmt.getStatements())
                if (statement != null)
                    statement.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        messagePrinter(conditionalStmt.getLine(), conditionalStmt.toString());
        if (conditionalStmt.getCondition() != null)
            conditionalStmt.getCondition().accept(this);
        if (conditionalStmt.getThenBody() != null)
            conditionalStmt.getThenBody().accept(this);

        if (conditionalStmt.getElsif() != null)
            for (ElsifStmt elsifStmt : conditionalStmt.getElsif())
                if (elsifStmt != null)
                    elsifStmt.accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
        messagePrinter(elsifStmt.getLine(), elsifStmt.toString());
        elsifStmt.getCondition().accept(this);
        elsifStmt.getThenBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        messagePrinter(methodCallStmt.getLine(), methodCallStmt.toString());
        methodCallStmt.getMethodCall().accept(this);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        messagePrinter(print.getLine(), print.toString());
        print.getArg().accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        messagePrinter(returnStmt.getLine(), returnStmt.toString());
        returnStmt.getReturnedExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(EachStmt eachStmt) {
        messagePrinter(eachStmt.getLine(), eachStmt.toString());
        eachStmt.getVariable().accept(this);
        eachStmt.getList().accept(this);
        eachStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        messagePrinter(binaryExpression.getLine(), binaryExpression.toString());
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        messagePrinter(unaryExpression.getLine(), unaryExpression.toString());
        unaryExpression.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(TernaryExpression ternaryExpression) {
        messagePrinter(ternaryExpression.getLine(), ternaryExpression.toString());
        ternaryExpression.getCondition().accept(this);
        ternaryExpression.getTrueExpression().accept(this);
        ternaryExpression.getFalseExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ObjectMemberAccess objectOrListMemberAccess) {
        messagePrinter(objectOrListMemberAccess.getLine(), objectOrListMemberAccess.toString());
        objectOrListMemberAccess.getInstance().accept(this);
        objectOrListMemberAccess.getMemberName().accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        messagePrinter(identifier.getLine(), identifier.toString());
        return null;
    }

    @Override
    public Void visit(ArrayAccessByIndex arrayAccessByIndex) {
        messagePrinter(arrayAccessByIndex.getLine(), arrayAccessByIndex.toString());
        arrayAccessByIndex.getInstance().accept(this);
        arrayAccessByIndex.getIndex().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        messagePrinter(methodCall.getLine(), methodCall.toString());
        methodCall.getInstance().accept(this);
        for (Expression arg : methodCall.getArgs())
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        messagePrinter(newClassInstance.getLine(), newClassInstance.toString());
        for (Expression arg : newClassInstance.getArgs())
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(SelfClass selfClass) {
        messagePrinter(selfClass.getLine(), selfClass.toString());
        return null;
    }

    @Override
    public Void visit(NullValue nullValue) {
        messagePrinter(nullValue.getLine(), nullValue.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        messagePrinter(intValue.getLine(), intValue.toString());
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        messagePrinter(boolValue.getLine(), boolValue.toString());
        return null;
    }

    @Override
    public Void visit(SetInclude setInclude) {
        messagePrinter(setInclude.getLine(), setInclude.toString());
        setInclude.getSetArg().accept(this);
        setInclude.getElementArg().accept(this);
        return null;
    }

    @Override
    public Void visit(SetValue setValue) {
        messagePrinter(setValue.getLine(), setValue.toString());
        for (IntValue intValue : setValue.getElements())
            intValue.accept(this);
        return null;
    }

    @Override
    public Void visit(SetNew setNew) {
        messagePrinter(setNew.getLine(), setNew.toString());
        for (Expression arg : setNew.getArgs())
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(SetAdd setAdd) {
        messagePrinter(setAdd.getLine(), setAdd.toString());
        setAdd.getSetArg().accept(this);
        setAdd.getElementArg().accept(this);
        return null;
    }

    @Override
    public Void visit(SetDelete setDelete) {
        messagePrinter(setDelete.getLine(), setDelete.toString());
        setDelete.getSetArg().accept(this);
        setDelete.getElementArg().accept(this);
        return null;
    }

    @Override
    public Void visit(SetMerge setMerge) {
        messagePrinter(setMerge.getLine(), setMerge.toString());
        setMerge.getSetArg().accept(this);
        for (Expression arg : setMerge.getElementArgs())
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(RangeExpression rangeExpression) {
        messagePrinter(rangeExpression.getLine(), rangeExpression.toString());
        rangeExpression.getLeftExpression().accept(this);
        rangeExpression.getRightExpression().accept(this);
        return null;
    }
}
