package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument extends Node {
    private List<htmlElements> elements = new ArrayList<htmlElements>();
    private  boolean xml = false;
    private  boolean dtd = false;
    private List<htmlMisc> miscs=new ArrayList<>();
    private  List<scriptletOrSeaWs> scriptletOrSeaWs=new ArrayList<>();

    public List<ast.nodes.scriptletOrSeaWs> getScriptletOrSeaWs() {
        return scriptletOrSeaWs;
    }

    public void setScriptletOrSeaWs(List<ast.nodes.scriptletOrSeaWs> scriptletOrSeaWs) {
        this.scriptletOrSeaWs = scriptletOrSeaWs;
    }

    public List<htmlMisc> getMiscs() {
        return miscs;
    }

    public void setMiscs(List<htmlMisc> miscs) {
        this.miscs = miscs;
    }

    public boolean isXml() {
        return xml;
    }

    public void setXml(boolean xml) {
        this.xml = xml;
    }

    public boolean isDtd() {
        return dtd;
    }

    public void setDtd(boolean dtd) {
        this.dtd = dtd;
    }

    public void setElements(List<htmlElements> elements) {
        this.elements = elements;
    }


    public List<htmlElements> getElements() {
        return elements;
    }

    @Override
    public void accept(AstVisitorInterface astVisitor) {
        astVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "HTML DOC";
    }
}
