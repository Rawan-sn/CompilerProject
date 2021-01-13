package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class Cp_for_statment extends  Node {

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    //    List<Expression> list=new ArrayList<>();
    Expression expression = new Expression();


    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
