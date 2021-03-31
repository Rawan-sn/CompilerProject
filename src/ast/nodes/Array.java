package ast.nodes;

public class Array extends Node {

    private Arraycontent arraycontent = new Arraycontent();

    public Arraycontent getArraycontent() {
        return arraycontent;
    }

    public void setArraycontent(Arraycontent arraycontent) {
        this.arraycontent = arraycontent;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {

    }
}
