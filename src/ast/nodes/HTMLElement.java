package ast.nodes;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends Node{

//    private HTMLTag htmlTag=new HTMLTag();

    //private String TAG_OPEN;
    private List<String>TAG_OPEN=new ArrayList<>();
    private List<String>TAG_NAME=new ArrayList<>();
    private List<String>TAG_CLOSE=new ArrayList<>();

    //private String TAG_NAME;
//    private String TAG_CLOSE;
    private String TAG_SLASH;
    private String TAG_SLASH_CLOSE;
    private String SCRIPTLET;
    private List<htmlAttribute> htmlAttribute = new ArrayList<htmlAttribute>();
    private htmlContent htmlContent =  new htmlContent();


    public List<String> getTAG_CLOSE() {
        return TAG_CLOSE;
    }

    public void setTAG_CLOSE(List<String> TAG_CLOSE) {
        this.TAG_CLOSE = TAG_CLOSE;
    }

    public String getTAG_SLASH() {
        return TAG_SLASH;
    }

    public void setTAG_SLASH(String TAG_SLASH) {
        this.TAG_SLASH = TAG_SLASH;
    }

    public String getTAG_SLASH_CLOSE() {
        return TAG_SLASH_CLOSE;
    }

    public void setTAG_SLASH_CLOSE(String TAG_SLASH_CLOSE) {
        this.TAG_SLASH_CLOSE = TAG_SLASH_CLOSE;
    }
//    public HTMLTag getHtmlTag() {
//        return htmlTag;
//    }
//
//    public void setHtmlTag(HTMLTag htmlTag) {
//        this.htmlTag = htmlTag;
//    }


    public List<String> getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(List<String> TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
    }

    public List<String> getTAG_NAME() {
        return TAG_NAME;
    }

    public void setTAG_NAME(List<String> TAG_NAME) {
        this.TAG_NAME = TAG_NAME;
    }

    public String getSCRIPTLET() {
        return SCRIPTLET;
    }

    public void setSCRIPTLET(String SCRIPTLET) {
        this.SCRIPTLET = SCRIPTLET;
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
