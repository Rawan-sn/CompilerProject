package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class CpStatment extends  Node {

  private List<String> spaces=new ArrayList<>();
  private List<Expression> expressions=new ArrayList<>();

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
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
