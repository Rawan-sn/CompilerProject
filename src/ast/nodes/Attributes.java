package ast.nodes;

public class Attributes extends  Node {


    String  ID ,TYPE , CLASS , CLICK , MOUSEOVER , DATAMODULE;
     Open_statment open_statment=new Open_statment();
     Close_statment close_statment=new Close_statment();



    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public String getCLICK() {
        return CLICK;
    }

    public void setCLICK(String CLICK) {
        this.CLICK = CLICK;
    }

    public String getMOUSEOVER() {
        return MOUSEOVER;
    }

    public void setMOUSEOVER(String MOUSEOVER) {
        this.MOUSEOVER = MOUSEOVER;
    }

    public String getDATAMODULE() {
        return DATAMODULE;
    }

    public void setDATAMODULE(String DATAMODULE) {
        this.DATAMODULE = DATAMODULE;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
