package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends Node{

    private String SCRIPTLET;
    private List<htmlAttribute> htmlAttribute = new ArrayList<htmlAttribute>();
    private htmlContent htmlContent =  new htmlContent();

    public String getSCRIPTLET() {
        return SCRIPTLET;
    }

    public void setSCRIPTLET(String SCRIPTLET) {
        this.SCRIPTLET = SCRIPTLET;
    }

    public List<htmlAttribute> getHtmlAttribute() {
        return htmlAttribute;
    }

    public void setHtmlAttribute(List<htmlAttribute> htmlAttribute) {
        this.htmlAttribute = htmlAttribute;
    }

    public htmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(htmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
