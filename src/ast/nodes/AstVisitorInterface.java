package ast.nodes;

public interface AstVisitorInterface {
    public void visit(cpIF cpif);

    public void visit(HtmlDocument document);
}
