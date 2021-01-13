package ast.nodes;

public class htmlAttribute extends  Node {

   Attribute attribute =new Attribute();
   Cp cp=new Cp();
   Open_statment open_statment=new Open_statment();
   Close_statment close_statment=new Close_statment();
   CpStatment cpStatment=new CpStatment();

    public CpStatment getCpStatment() {
        return cpStatment;
    }

    public void setCpStatment(CpStatment cpStatment) {
        this.cpStatment = cpStatment;
    }

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

    public Cp getCp() {
        return cp;
    }

    public void setCp(Cp cp) {
        this.cp = cp;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
