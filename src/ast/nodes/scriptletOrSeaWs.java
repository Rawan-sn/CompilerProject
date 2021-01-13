package ast.nodes;

public class scriptletOrSeaWs extends  Node {

    private String scriptLeft;


    public String getScriptLeft() {
        return scriptLeft;
    }

    public void setScriptLeft(String scriptLeft) {
        this.scriptLeft = scriptLeft;
    }


    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
