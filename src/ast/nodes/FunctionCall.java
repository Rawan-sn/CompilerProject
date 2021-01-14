package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends Node {
    private  String ATT_VARIABLE;
    private List<FunctionParametr> functionParametrs = new ArrayList<FunctionParametr>();

    public String getATT_VARIABLE() {
        return ATT_VARIABLE;
    }

    public void setATT_VARIABLE(String ATT_VARIABLE) {
        this.ATT_VARIABLE = ATT_VARIABLE;
    }

    public List<FunctionParametr> getFunctionParametrs() {
        return functionParametrs;
    }

    public void setFunctionParametrs(List<FunctionParametr> functionParametrs) {
        this.functionParametrs = functionParametrs;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
