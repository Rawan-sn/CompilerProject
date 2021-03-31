package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class Expression1 extends Node {

    private String ATT_VARIABLE;
    private Array array = new Array();
    private FunctionCall functionCall = new FunctionCall();
    private String OBJ;
    private String INDEX;
    private String ATTVALUE_VALUE;
    private String ATT_NUMBER;
    private List<String> ASSIGN = new ArrayList<>();
    private String OPERATION;
    private String OR;
    private String IF_CONDITION;
    private String DOT;

    public String getOPERATION() {
        return OPERATION;
    }

    public void setOPERATION(String OPERATION) {
        this.OPERATION = OPERATION;
    }

    public String getOR() {
        return OR;
    }

    public void setOR(String OR) {
        this.OR = OR;
    }

    public String getIF_CONDITION() {
        return IF_CONDITION;
    }

    public void setIF_CONDITION(String IF_CONDITION) {
        this.IF_CONDITION = IF_CONDITION;
    }

    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    List<Expression1> expression1 = new ArrayList<>();

    public List<Expression1> getExpression1() {
        return expression1;
    }

    public void setExpression1(List<Expression1> expression1) {
        this.expression1 = expression1;
    }

    public List<String> getASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(List<String> ASSIGN) {
        this.ASSIGN = ASSIGN;
    }

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
