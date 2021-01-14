package ast.nodes;

public class Content  extends  Node  {

    Expression expression = new Expression();

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }


    @Override
    public void accept(AstVisitorInterface astVisitor) {
    }
}
