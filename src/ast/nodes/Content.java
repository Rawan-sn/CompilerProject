package ast.nodes;

public class Content  extends  Node  {

    Expression1 expression = new Expression1();

    public Expression1 getExpression() {
        return expression;
    }

    public void setExpression(Expression1 expression) {
        this.expression = expression;
    }


    @Override
    public void accept(AstVisitorInterface astVisitor) {
    }
}
