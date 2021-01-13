package ast.visitor;

import ast.nodes.*;
//import ast.nodes;
import generated.HTMLParser;
import generated.HTMLParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends HTMLParserBaseVisitor  {
    @Override
    public HtmlDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        System.out.println("\nhtml document");
        HtmlDocument doc = new HtmlDocument();
        for (int i = 0; i < ctx.htmlElements().size(); i++) {
            doc.getElements().add(visitHtmlElements(ctx.htmlElements(i)));
        }
        if (ctx.XML() != null){
            doc.setXml(true);
        }
        if(ctx.DTD() !=null)
        {
            doc.setDtd(true);
        }
        for(int i=0;i<ctx.htmlMisc().size();i++)
        {
            doc.getMiscs().add(visitHtmlMisc(ctx.htmlMisc(i)));
            if(i==0)
            {
                System.out.print("\nComment Visited  : ");
            }
            System.out.println(ctx.htmlMisc(i).getText());
        }
        for(int i=0;i<ctx.scriptletOrSeaWs().size();i++)
        {
            doc.getScriptletOrSeaWs().add(visitScriptletOrSeaWs(ctx.scriptletOrSeaWs(i)));
        }

        return doc;
    }


    @Override
    public scriptletOrSeaWs visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx) {
          scriptletOrSeaWs scriptletOrSeaWs=new scriptletOrSeaWs();
        scriptletOrSeaWs.setScriptLeft(ctx.getText());
        return scriptletOrSeaWs;
    }

    @Override
    public htmlElements visitHtmlElements(HTMLParser.HtmlElementsContext ctx) {
        System.out.println("visitHtmlElements");
        htmlElements htmlElements=new htmlElements();
        for(int i=0;i<ctx.htmlMisc().size();i++)
        {
            htmlElements.getHtmlMiscs().add(visitHtmlMisc(ctx.htmlMisc(i)));
        }

        if(ctx.htmlElement()!=null)
        {
            htmlElements.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        }
        return htmlElements;
//        return super.visitHtmlElements(ctx);
    }



    @Override
    public HTMLElement visitHtmlElement(HTMLParser.HtmlElementContext ctx) {

        System.out.println("Visit Html Element");
        HTMLElement htmlElement=new HTMLElement();
        HTMLTag tag = new HTMLTag();
        System.out.println("Tag Name : "+ctx.TAG_NAME(0).getText());
        System.out.println("---------------------------------------------------");
        System.out.println(ctx.TAG_NAME().size() + "hhhhhhhhhhhhhhhhhhh");
        //Attribute attribute=new Attribute();
        tag.setName(ctx.TAG_NAME(0).getText());
        System.out.println("HTML element: " + ctx.TAG_NAME(0).getText());
        if (ctx.htmlContent().htmlElement().size() <= 0) {
            tag.setTextContent(ctx.htmlContent().getText());
            List<Attribute> attributeList = new ArrayList<Attribute>();
            for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
                Attribute attribute = visitHtmlAttribute(ctx.htmlAttribute(i));
                attributeList.add(attribute);
                 //Todo

//                htmlElement.getAttributes().add(visitHtmlAttribute(ctx.at)));
            }
              // -------------------------------------------------------
              if(ctx.htmlContent()!=null)
              {
                  htmlContent content =visitHtmlContent(ctx.htmlContent());
              }




            //
            tag.setAttributes(attributeList);
            return tag;
            //TODO iterate on ctx.htmlAttribute() and generate attribute then set its tag
        } else if (ctx.htmlContent().htmlElement().size() > 0) {
            // Visit all html attributes
            List<Attribute> attributeList = new ArrayList<Attribute>();
            for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
                Attribute attribute = visitHtmlAttribute(ctx.htmlAttribute(i));
                attributeList.add(attribute);
            }
            tag.setAttributes(attributeList);
            // Visit all html elements (children)
            List<HTMLElement> elements = new ArrayList<HTMLElement>();
            System.out.println(", children: [ ");
            for (int i = 0; i < ctx.htmlContent().htmlElement().size(); i++) {
//                comments.add(ctx.htmlContent().htmlComment(i));
                elements.add(visitHtmlElement(ctx.htmlContent().htmlElement(i)));
                System.out.print(",");
            }
            System.out.print(" ] ");
            tag.setContent(elements);
            return tag;
        }

        return htmlElement;
    }

    @Override
    public Content visitContent(HTMLParser.ContentContext ctx) {
       Content content =new Content();
        return content;
    }

    @Override
    public htmlContent visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        htmlContent htmlContent=new htmlContent();
        System.out.println(" Visit Html Content");

        for(int i=0;i<ctx.htmlChardata().size();i++)
        {
            htmlContent.getHtmlChardata().add(visitHtmlChardata(ctx.htmlChardata(i)));
        }
        for(int i=0;i<ctx.htmlElement().size();i++)
        {
            htmlContent.getHtmlElement().add(visitHtmlElement(ctx.htmlElement(i)));
        }
        for(int i=0;i<ctx.htmlComment().size();i++)
        {
            htmlContent.getHtmlComment().add(visitHtmlComment(ctx.htmlComment(i)));
        }
        for(int i=0;i<ctx.content().size();i++)
        {
            htmlContent.getContent().add(visitContent(ctx.content(i)));
        }

        return htmlContent;
    }

    @Override
    public Attribute visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        Attribute attribute = new Attribute();
        // handle cp app
        if(ctx.cp().CP_APP() != null){
            // Store values
            String attrName = ctx.cp().CP_APP().getText();
            String attrValue = ctx.cpStatment().expression().get(0).getText();
            // Set values in attribute
            attribute.setName(attrName);
            attribute.setValue(attrValue);
            // print out result
            System.out.println(attribute.toString());

        }
        if(ctx.cp().CP_FOR() != null){
            // TODO: Code here ..
//            String expre1 = ctx.cpStatment().cp_for_statment().expression(0).getText();
//            String expre2 = ctx.cpStatment().cp_for_statment().expression(1).getText();
            // Store in attribute
            attribute.setName(ctx.cp().CP_FOR().getText());
//            attribute.setValue(ctx.cpStatment().cp_for_statment().getText());
//            ctx.cp_for_statment()
//
//            if(ctx.cpStatment().cp_for_statment().expression(1).array() != null){
//
////                System.out.println(ctx.cpStatment().cp_for_statment().expression(1).array().
////                arraycontent().ARRAYCONTENT().getText());
//            }
            // print out result
            System.out.println(attribute.toString());
        }
        if(ctx.cp().CP_IF() != null){
            //
            String name = ctx.cp().CP_IF().getText();
            String value = ctx.cpStatment().getText();
            // store values
            attribute.setName(name);
            attribute.setValue(value);
            System.out.println(attribute.toString());
        }
        if(ctx.cp().CP_MODEL()!=null)
        {
            String name = ctx.cp().CP_MODEL().getText();
            String value = ctx.cpStatment().getText();
            // store values
            attribute.setName(name);
            attribute.setValue(value);
            System.out.println(attribute.toString());
        }


        return attribute;
    }

    @Override
    public htmlChardata visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
          htmlChardata htmlChardata=new htmlChardata();
        return htmlChardata;
    }

    @Override
    public htmlMisc visitHtmlMisc(HTMLParser.HtmlMiscContext ctx) {
         htmlMisc htmlMisc=new htmlMisc();
        return htmlMisc;
    }

    @Override
    public htmlComment visitHtmlComment(HTMLParser.HtmlCommentContext ctx) {
         htmlComment htmlComment =new htmlComment();
        return  htmlComment;
    }

    @Override
    public Object visitScript(HTMLParser.ScriptContext ctx) {
        return super.visitScript(ctx);
    }

    @Override
    public Object visitStyle(HTMLParser.StyleContext ctx) {
        System.out.println("This is style ");
        return super.visitStyle(ctx);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
//
//    public void visit(cpIF cpif) {
//
//        System.out.println("visited");
//        if (cpif.getName() != null) {
//            cpif.accept(this);
//            System.out.println("cc" + cpif.getName());
//        }
//        //cpif.accept(this);
//    }
}
