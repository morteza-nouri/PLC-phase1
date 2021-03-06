package main.ast.nodes.expression;

import main.visitor.IVisitor;

//line -> IDENTIFIER
public class ObjectMemberAccess extends Expression{
    private Expression instance;
    private Identifier memberName;

    public ObjectMemberAccess(Expression instance, Identifier memberName) {
        this.instance = instance;
        this.memberName = memberName;
    }

    public Expression getInstance() {
        return instance;
    }

    public void setInstance(Expression instance) {
        this.instance = instance;
    }

    public Identifier getMemberName() {
        return memberName;
    }

    public void setMemberName(Identifier memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "ObjectMemberAccess_" + this.memberName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
