package main.visitor.utils;

import main.ast.nodes.Node;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.SetAdd;
import main.ast.nodes.statement.set.SetDelete;
import main.ast.nodes.statement.set.SetMerge;
import main.compileError.CompileError;
import main.visitor.Visitor;

import java.util.ArrayList;

public class ErrorPrinter extends Visitor<Integer> {

    private int printErrors(Node node) {
        ArrayList<CompileError> errors = node.flushErrors();
        for(CompileError compileErrorException : errors) {
            System.out.println(compileErrorException.getMessage());
        }
        return errors.size();
    }

    @Override
    public Integer visit(Program program) {
        int numOfErrors = printErrors(program);
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables())
            variableDeclaration.accept(this);
        for (ClassDeclaration classDeclaration: program.getClasses())
            classDeclaration.accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(ClassDeclaration classDeclaration) {
        int numOfErrors = printErrors(classDeclaration);
        classDeclaration.getClassName().accept(this);
        if(classDeclaration.getParentClassName() != null)
            classDeclaration.getParentClassName().accept(this);
        if(classDeclaration.getConstructor() != null)
            classDeclaration.getConstructor().accept(this);
        for(MethodDeclaration md : classDeclaration.getMethods()) {
            md.accept(this);
        }
        for(FieldDeclaration fd : classDeclaration.getFields()) {
            fd.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(ConstructorDeclaration constructorDeclaration) {
        int numOfErrors = printErrors(constructorDeclaration);
        if (constructorDeclaration.getArgs() != null)
            for(VariableDeclaration arg : constructorDeclaration.getArgs()) {
                arg.accept(this);
            }

        if (constructorDeclaration.getLocalVars() != null)
            for(VariableDeclaration localVar : constructorDeclaration.getLocalVars()) {
                localVar.accept(this);
            }

        if (constructorDeclaration.getBody() != null)
            for(Statement body : constructorDeclaration.getBody()) {
                body.accept(this);
            }
        return numOfErrors;
    }

    @Override
    public Integer visit(MethodDeclaration methodDeclaration) {
        int numOfErrors = printErrors(methodDeclaration);
        methodDeclaration.getMethodName().accept(this);

        for(VariableDeclaration arg : methodDeclaration.getArgs()) {
            arg.accept(this);
        }

        for(VariableDeclaration localVar : methodDeclaration.getLocalVars()) {
            localVar.accept(this);
        }

        for(Statement body : methodDeclaration.getBody()) {
            body.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(FieldDeclaration fieldDeclaration) {
        int numOfErrors = printErrors(fieldDeclaration);
        fieldDeclaration.getVarDeclaration().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(VariableDeclaration varDeclaration) {
        int numOfErrors = printErrors(varDeclaration);
        varDeclaration.getVarName().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(AssignmentStmt assignmentStmt) {
        int numOfErrors = printErrors(assignmentStmt);
        assignmentStmt.getlValue().accept(this);
        assignmentStmt.getrValue().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(BlockStmt blockStmt) {
        int numOfErrors = printErrors(blockStmt);
        for(Statement stmt : blockStmt.getStatements()) {
            stmt.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(ConditionalStmt conditionalStmt) {
        int numOfErrors = printErrors(conditionalStmt);
        conditionalStmt.getCondition().accept(this);
        conditionalStmt.getThenBody().accept(this);

        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);

        if (conditionalStmt.getElsif() != null)
            for(ElsifStmt stmt : conditionalStmt.getElsif()) {
                stmt.accept(this);
            }
        return numOfErrors;
    }

    @Override
    public Integer visit(ElsifStmt elsifStmt) {
        int numOfErrors = printErrors(elsifStmt);
        elsifStmt.getCondition().accept(this);
        elsifStmt.getThenBody().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(MethodCallStmt methodCallStmt) {
        int numOfErrors = printErrors(methodCallStmt);
        methodCallStmt.getMethodCall().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(PrintStmt print) {
        int numOfErrors = printErrors(print);
        print.getArg().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(ReturnStmt returnStmt) {
        int numOfErrors = printErrors(returnStmt);
        returnStmt.getReturnedExpr().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(EachStmt eachStmt) {
        int numOfErrors = printErrors(eachStmt);
        eachStmt.getVariable().accept(this);
        eachStmt.getList().accept(this);
        eachStmt.getBody().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(BinaryExpression binaryExpression) {
        int numOfErrors = printErrors(binaryExpression);
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(UnaryExpression unaryExpression) {
        int numOfErrors = printErrors(unaryExpression);
        unaryExpression.getOperand().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(TernaryExpression ternaryExpression) {
        int numOfErrors = printErrors(ternaryExpression);
        ternaryExpression.getCondition().accept(this);
        ternaryExpression.getTrueExpression().accept(this);
        ternaryExpression.getFalseExpression().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(ObjectMemberAccess objectOrListMemberAccess) {
        int numOfErrors = printErrors(objectOrListMemberAccess);
        objectOrListMemberAccess.getInstance().accept(this);
        objectOrListMemberAccess.getMemberName().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(Identifier identifier) {
        int numOfErrors = printErrors(identifier);
        return numOfErrors;
    }

    @Override
    public Integer visit(ArrayAccessByIndex arrayAccessByIndex) {
        int numOfErrors = printErrors(arrayAccessByIndex);
        arrayAccessByIndex.getInstance().accept(this);
        arrayAccessByIndex.getIndex().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(MethodCall methodCall) {
        int numOfErrors = printErrors(methodCall);
        methodCall.getInstance().accept(this);
        for(Expression arg : methodCall.getArgs()) {
            arg.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(NewClassInstance newClassInstance) {
        int numOfErrors = printErrors(newClassInstance);
        for(Expression arg : newClassInstance.getArgs()) {
            arg.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(SelfClass selfClass) {
        int numOfErrors = printErrors(selfClass);
        return numOfErrors;
    }

    @Override
    public Integer visit(IntValue intValue) {
        int numOfErrors = printErrors(intValue);
        return numOfErrors;
    }

    @Override
    public Integer visit(BoolValue boolValue) {
        int numOfErrors = printErrors(boolValue);
        return numOfErrors;
    }

    @Override
    public Integer visit(SetInclude setAdd) {
        int numOfErrors = printErrors(setAdd);
        setAdd.getSetArg().accept(this);
        setAdd.getElementArg().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(SetValue setValue) {
        int numOfErrors = printErrors(setValue);
        return numOfErrors;
    }

    @Override
    public Integer visit(SetMerge setMerge) {
        int numOfErrors = printErrors(setMerge);
        setMerge.getSetArg().accept(this);
        for(Expression arg : setMerge.getElementArgs()) {
            arg.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(SetDelete setDelete) {
        int numOfErrors = printErrors(setDelete);
        setDelete.getSetArg().accept(this);
        setDelete.getElementArg().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(SetAdd setAdd) {
        int numOfErrors = printErrors(setAdd);
        setAdd.getSetArg().accept(this);
        setAdd.getElementArg().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(RangeExpression rangeExpression) {
        int numOfErrors = printErrors(rangeExpression);
        rangeExpression.getLeftExpression().accept(this);
        rangeExpression.getRightExpression().accept(this);
        return numOfErrors;
    }
}