package ast.nodes;

public class htmlAttribute extends  Node {

   private Attribute attribute =new Attribute();
   private Cp cp=new Cp();
   private Open_statment open_statment=new Open_statment();
   private Close_statment close_statment=new Close_statment();
   private CpStatment cpStatment=new CpStatment();
   private Cp_for_statment cp_for_statment=new Cp_for_statment();
   private Cp_switch_Default cp_switch_default=new Cp_switch_Default();
   private Attributes attributes=new Attributes();

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Cp_switch_Default getCp_switch_default() {
        return cp_switch_default;
    }

    public void setCp_switch_default(Cp_switch_Default cp_switch_default) {
        this.cp_switch_default = cp_switch_default;
    }

    public Cp_for_statment getCp_for_statment() {
        return cp_for_statment;
    }

    public void setCp_for_statment(Cp_for_statment cp_for_statment) {
        this.cp_for_statment = cp_for_statment;
    }

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
