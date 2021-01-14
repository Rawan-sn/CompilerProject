package ast.nodes;

public class Attributes extends  Node {


    private String  ID ,TYPE , CLASS , CLICK , MOUSEOVER , DATAMODULE;
    private Open_statment open_statment=new Open_statment();
    private   Close_statment close_statment=new Close_statment();


    public Open_statment getOpen_statment() {
        return open_statment;
    }

    public void setOpen_statment(Open_statment open_statment) {
        this.open_statment = open_statment;
    }

    public Close_statment getClose_statment() {
        return close_statment;
    }

    public void setClose_statment(Close_statment close_statment) {
        this.close_statment = close_statment;
    }

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
