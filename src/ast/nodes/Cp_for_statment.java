package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class Cp_for_statment extends  Node {

    private  List<Expression1> list=new ArrayList<>();

    public List<Expression1> getList() {
        return list;
    }

    public void setList(List<Expression1> list) {
        this.list = list;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
