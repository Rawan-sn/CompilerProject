package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends Node{

    private String name;
    private List<htmlAttribute> attributes = new ArrayList<htmlAttribute>();
    private htmlContent htmlContent =  new htmlContent();

    public ast.nodes.htmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(ast.nodes.htmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public List<htmlAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<htmlAttribute> attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<htmlAttribute> getElement() {
        return attributes;
    }

    public void setElement(List<htmlAttribute> elements) {
        this.attributes = elements;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
