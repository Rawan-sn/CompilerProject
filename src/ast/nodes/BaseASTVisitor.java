package ast.nodes;

public class BaseASTVisitor implements AstVisitorInterface {

    public void visit(HtmlDocument document){
        System.out.println("doc");
    }

    @Override
    public void visit(cpIF cpif) {
        // Code here ..
        System.out.println("Cp if");
    }



}
