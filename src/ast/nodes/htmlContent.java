package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class htmlContent {

    List<htmlChardata> htmlChardata=new ArrayList<>();

    List<HTMLElement> htmlElement=new ArrayList<>();
    List<htmlComment> htmlComment =new ArrayList<>();
    List<Content> content =new ArrayList<>();

    public List<HTMLElement> getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(List<HTMLElement> htmlElement) {
        this.htmlElement = htmlElement;
    }

    public List<ast.nodes.htmlComment> getHtmlComment() {
        return htmlComment;
    }

    public void setHtmlComment(List<ast.nodes.htmlComment> htmlComment) {
        this.htmlComment = htmlComment;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public List<ast.nodes.htmlChardata> getHtmlChardata() {
        return htmlChardata;
    }

    public void setHtmlChardata(List<ast.nodes.htmlChardata> htmlChardata) {
        this.htmlChardata = htmlChardata;
    }
}
