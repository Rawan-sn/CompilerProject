package ast.nodes;

public class Expression  extends  Node {

   private String ATT_VARIABLE;
   private Array array=new Array();
   private FunctionCall functionCall=new FunctionCall();
   private String OBJ;
   private String INDEX;
   private String ATTVALUE_VALUE;
   private String ATT_NUMBER;


    public String getATT_VARIABLE() {
        return ATT_VARIABLE;
    }

    public void setATT_VARIABLE(String ATT_VARIABLE) {
        this.ATT_VARIABLE = ATT_VARIABLE;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public String getOBJ() {
        return OBJ;
    }

    public void setOBJ(String OBJ) {
        this.OBJ = OBJ;
    }

    public String getINDEX() {
        return INDEX;
    }

    public void setINDEX(String INDEX) {
        this.INDEX = INDEX;
    }

    public String getATTVALUE_VALUE() {
        return ATTVALUE_VALUE;
    }

    public void setATTVALUE_VALUE(String ATTVALUE_VALUE) {
        this.ATTVALUE_VALUE = ATTVALUE_VALUE;
    }

    public String getATT_NUMBER() {
        return ATT_NUMBER;
    }

    public void setATT_NUMBER(String ATT_NUMBER) {
        this.ATT_NUMBER = ATT_NUMBER;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
