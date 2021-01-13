package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class htmlElements extends  Node {

    private List<htmlMisc> htmlMiscs = new ArrayList<htmlMisc>();
    private  HTMLElement htmlElement=new HTMLElement();

    public List<htmlMisc> getHtmlMiscs() {
        return htmlMiscs;
    }

    public HTMLElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HTMLElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public void setHtmlMiscs(List<htmlMisc> htmlMiscs) {
        this.htmlMiscs = htmlMiscs;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
