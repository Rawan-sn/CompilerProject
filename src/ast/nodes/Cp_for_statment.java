package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class Cp_for_statment extends  Node {

    private  List<Expression> list=new ArrayList<>();

    public List<Expression> getList() {
        return list;
    }

    public void setList(List<Expression> list) {
        this.list = list;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
