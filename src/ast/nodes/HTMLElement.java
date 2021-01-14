package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends Node{

    private String name;
    private List<htmlAttribute> htmlAttribute = new ArrayList<htmlAttribute>();
    private htmlContent htmlContent =  new htmlContent();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
