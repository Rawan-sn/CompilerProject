package ast.nodes;

public class htmlMisc extends Node {

    private  htmlComment comment=new htmlComment();

    public htmlComment getComment() {
        return comment;
    }

    public void setComment(htmlComment comment) {
        this.comment = comment;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
