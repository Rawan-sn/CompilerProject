package ast.nodes;

public class Cp_switch_Default extends  Node {
   private String CP_SWITCH_DEFAULT="";



    public String getCP_SWITCH_DEFAULT() {
        return CP_SWITCH_DEFAULT;
    }

    public void setCP_SWITCH_DEFAULT(String CP_SWITCH_DEFAULT) {
        this.CP_SWITCH_DEFAULT = CP_SWITCH_DEFAULT;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
