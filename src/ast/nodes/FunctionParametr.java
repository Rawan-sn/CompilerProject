package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class FunctionParametr  {
//    private List<String > ATT_VARIABLE=new ArrayList<>();
    private  String   ATT_VARIABLE;
    private FunctionCall functionCall  = new FunctionCall();

//    public List<String> getATT_VARIABLE() {
//        return ATT_VARIABLE;
//    }
//
//    public void setATT_VARIABLE(List<String> ATT_VARIABLE) {
//        this.ATT_VARIABLE = ATT_VARIABLE;
//    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public String getATT_VARIABLE() {
        return ATT_VARIABLE;
    }

    public void setATT_VARIABLE(String ATT_VARIABLE) {
        this.ATT_VARIABLE = ATT_VARIABLE;
    }
}
