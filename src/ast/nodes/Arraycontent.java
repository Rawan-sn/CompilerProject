package ast.nodes;

public class Arraycontent  {

    private String variable;
    private boolean aboolean;

    private Array array=new Array();


    public boolean isAboolean() {
        return aboolean;
    }

    public void setAboolean(boolean aboolean) {
        this.aboolean = aboolean;
    }

    private String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }


}