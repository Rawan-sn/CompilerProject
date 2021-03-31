package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class CpStatment extends Node {

    private List<String> spaces = new ArrayList<>();
    private List<Expression1> expressions = new ArrayList<>();

    public List<Expression1> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression1> expressions) {
        this.expressions = expressions;
    }

    public List<String> getSpaces() {
        return spaces;
    }

    public void setSpaces(List<String> spaces) {
        this.spaces = spaces;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
