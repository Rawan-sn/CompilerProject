package ast.nodes;

public class htmlComment extends Node {

    private String HTML_COMMENT;
    private String HTML_CONDITIONAL_COMMENT;

    public String getHTML_COMMENT() {
        return HTML_COMMENT;
    }

    public void setHTML_COMMENT(String HTML_COMMENT) {
        this.HTML_COMMENT = HTML_COMMENT;
    }

    public String getHTML_CONDITIONAL_COMMENT() {
        return HTML_CONDITIONAL_COMMENT;
    }

    public void setHTML_CONDITIONAL_COMMENT(String HTML_CONDITIONAL_COMMENT) {
        this.HTML_CONDITIONAL_COMMENT = HTML_CONDITIONAL_COMMENT;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
