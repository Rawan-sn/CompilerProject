package ast.nodes;

public class Cp extends Node {

    private String CP_IF = "",
                   CP_APP = "",
                   CP_HIDE = "",
                   CP_MODEL = "",
                   CP_SHOW = "",
                   CP_SWITCH = "",
                   CP_SWITCH_CASE = "",
                   CP_FOR = "";

    public String getCP_IF() {
        return CP_IF;
    }

    public void setCP_IF(String CP_IF) {
        this.CP_IF = CP_IF;
    }

    public String getCP_APP() {
        return CP_APP;
    }

    public void setCP_APP(String CP_APP) {
        this.CP_APP = CP_APP;
    }

    public String getCP_HIDE() {
        return CP_HIDE;
    }

    public void setCP_HIDE(String CP_HIDE) {
        this.CP_HIDE = CP_HIDE;
    }

    public String getCP_MODEL() {
        return CP_MODEL;
    }

    public void setCP_MODEL(String CP_MODEL) {
        this.CP_MODEL = CP_MODEL;
    }

    public String getCP_SHOW() {
        return CP_SHOW;
    }

    public void setCP_SHOW(String CP_SHOW) {
        this.CP_SHOW = CP_SHOW;
    }

    public String getCP_SWITCH() {
        return CP_SWITCH;
    }

    public void setCP_SWITCH(String CP_SWITCH) {
        this.CP_SWITCH = CP_SWITCH;
    }

    public String getCP_SWITCH_CASE() {
        return CP_SWITCH_CASE;
    }

    public void setCP_SWITCH_CASE(String CP_SWITCH_CASE) {
        this.CP_SWITCH_CASE = CP_SWITCH_CASE;
    }

    public String getCP_FOR() {
        return CP_FOR;
    }

    public void setCP_FOR(String CP_FOR) {
        this.CP_FOR = CP_FOR;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
