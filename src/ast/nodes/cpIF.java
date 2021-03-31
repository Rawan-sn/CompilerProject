package ast.nodes;

public class cpIF extends Attribute {
    private String opvalue;
//    private Expression expressoin;


    public String getOpvalue() {
        return opvalue;
    }

    public void setOpvalue(String opvalue) {
        this.opvalue = opvalue;
    }

    public void accept(AstVisitorInterface astVisitorInterface) {
        astVisitorInterface.visit(this);


    }
}
