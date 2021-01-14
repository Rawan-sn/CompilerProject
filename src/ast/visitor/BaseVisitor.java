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
        System.out.println("visit HtmlElement");
        HTMLElement htmlElement=new HTMLElement();
        if(ctx.SCRIPTLET()!=null)
        {
            htmlElement.setSCRIPTLET(ctx.SCRIPTLET().toString());
        }
        for(int i=0;i<ctx.htmlAttribute().size();i++)
        {
            htmlElement.getHtmlAttribute().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
        }
        if(ctx.htmlContent()!=null)
        {
            htmlElement.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        }
        return htmlElement;
    }

    @Override
    public Content visitContent(HTMLParser.ContentContext ctx) {
        System.out.println("visit Content");
        Content content =new Content();
        if(ctx.expression()!=null)
        {
            content.setExpression(visitExpression(ctx.expression()));
        }
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
    public Attributes visitAttributes(HTMLParser.AttributesContext ctx) {
        System.out.println("visit Attributes");
        Attributes attributes =new Attributes();
        if(ctx.ID()!=null)
        {
            attributes.setID(ctx.ID().toString());
        }
        if(ctx.TYPE()!=null)
        {
            attributes.setTYPE(ctx.TYPE().toString());
        }
        if(ctx.CLASS()!=null)
        {
            attributes.setCLASS(ctx.CLASS().toString());
        }
        if(ctx.CLICK()!=null)
        {
            attributes.setCLICK(ctx.CLICK().toString());
        }
        if(ctx.MOUSEOVER()!=null)
        {
            attributes.setMOUSEOVER(ctx.MOUSEOVER().toString());
        }
        if(ctx.DATAMODULE()!=null)
        {
            attributes.setDATAMODULE(ctx.DATAMODULE().toString());
        }
        if(ctx.open_statment()!=null)
        {
            attributes.setOpen_statment(visitOpen_statment(ctx.open_statment()));
        }
        if(ctx.close_statment()!=null)
        {
            attributes.setClose_statment(visitClose_statment(ctx.close_statment()));
        }

        return attributes;
    }

    @Override
    public Cp visitCp(HTMLParser.CpContext ctx) {
        System.out.println("Visit Cp");
        Cp cp=new Cp();
        if(ctx.CP_IF()!=null)
        {
         cp.setCP_IF(ctx.CP_IF().toString());
        }
        if(ctx.CP_MODEL()!=null)
        {
            cp.setCP_MODEL(ctx.CP_MODEL().toString());
        }
        if(ctx.CP_APP()!=null)
        {
            cp.setCP_APP(ctx.CP_APP().toString());
        }
        if(ctx.CP_FOR()!=null)
        {
            cp.setCP_FOR(ctx.CP_FOR().toString());
        }
        if(ctx.CP_HIDE()!=null)
        {
            cp.setCP_HIDE(ctx.CP_HIDE().toString());
        }
        if(ctx.CP_SHOW()!=null)
        {
            cp.setCP_SHOW(ctx.CP_SHOW().toString());
        }
        if(ctx.CP_SWITCH()!=null)
        {
            cp.setCP_SWITCH(ctx.CP_SWITCH().toString());
        }
        if(ctx.CP_SWITCH_CASE()!=null)
        {
            cp.setCP_SWITCH(ctx.CP_SWITCH().toString());
        }

        return cp;
    }

    @Override
    public Object visitCpSwitch(HTMLParser.CpSwitchContext ctx) {
        System.out.println("visit CpSwitch");
        return super.visitCpSwitch(ctx);
    }


    @Override
    public CpStatment visitCpStatment(HTMLParser.CpStatmentContext ctx) {
        System.out.println("visit Cp Statment");
        CpStatment cpStatment=new CpStatment();
         for(int i=0;i<ctx.expression().size();i++)
         {
             cpStatment.getExpressions().add(visitExpression((ctx.expression(i))));
         }
        for(int i=0;i<ctx.NOT().size();i++)
        {
            cpStatment.getSpaces().add(ctx.NOT(i).toString());
        }
        return cpStatment;
    }

    @Override
    public Array visitArray(HTMLParser.ArrayContext ctx) {
        System.out.println("visit Array");
         Array array=new Array();
         if(ctx.arraycontent()!=null)
         {
             array.setArraycontent(visitArraycontent(ctx.arraycontent()));
         }
        return array;
    }

    ///// Todo
    @Override
    public Arraycontent visitArraycontent(HTMLParser.ArraycontentContext ctx) {
        System.out.println("visit Arraycontent");
        Arraycontent arraycontent=new Arraycontent();
        if(ctx.array()!=null)
        {
            arraycontent.setArray(visitArray(ctx.array()));
        }
        return  arraycontent;
    }

    @Override
    public FunctionCall visitFunctionCall(HTMLParser.FunctionCallContext ctx) {
        System.out.println("visit FunctionCall");
        FunctionCall functionCall=new FunctionCall();
        if(ctx.ATT_VARIABLE()!=null)
        {
            functionCall.setATT_VARIABLE(ctx.ATT_VARIABLE().toString());
        }
        for(int i=0;i<ctx.functionParametr().size();i++)
        {
            functionCall.getFunctionParametrs().add(visitFunctionParametr(ctx.functionParametr(i)));
        }
        return functionCall;
    }

    @Override
    public FunctionParametr visitFunctionParametr(HTMLParser.FunctionParametrContext ctx) {
        System.out.println("visit FunctionParametr");
      FunctionParametr functionParametr=new FunctionParametr();
       if(ctx.ATT_VARIABLE()!=null)
       {
           functionParametr.setATT_VARIABLE(ctx.ATT_VARIABLE().toString());
       }
       if(ctx.functionCall()!=null)
       {
           functionParametr.setFunctionCall(visitFunctionCall(ctx.functionCall()));
       }
        return functionParametr;
    }

    @Override
    public Expression visitExpression(HTMLParser.ExpressionContext ctx) {
        System.out.println("visit Expression");
         Expression expression=new Expression();
         if(ctx.ATT_VARIABLE()!=null)
         {
             expression.setATT_VARIABLE(ctx.ATT_VARIABLE().toString());
         }
          if(ctx.array()!=null)
          {
              expression.setArray(visitArray(ctx.array()));
          }
          if(ctx.functionCall()!=null)
          {
              expression.setFunctionCall(visitFunctionCall(ctx.functionCall()));
          }

           if(ctx.OBJ()!=null){
            expression.setOBJ(ctx.OBJ().toString());
        }
        if(ctx.INDEX()!=null){
            expression.setINDEX(ctx.INDEX().toString());
        }
        if(ctx.ATTVALUE_VALUE()!=null){
            expression.setATTVALUE_VALUE(ctx.ATTVALUE_VALUE().toString());
        }
        if(ctx.ATT_NUMBER()!=null){
            expression.setATT_NUMBER(ctx.ATT_NUMBER().toString());
        }
        return  expression;
    }

    @Override
    public Open_statment visitOpen_statment(HTMLParser.Open_statmentContext ctx) {
        System.out.println("visit Open_statment");
      Open_statment open_statment=new Open_statment();
         return  open_statment;
    }

    @Override
    public Close_statment visitClose_statment(HTMLParser.Close_statmentContext ctx) {
        System.out.println(" visit Close statment");
        Close_statment close_statment=new Close_statment();
        return  close_statment;
    }

    @Override
    public Cp_for_statment visitCp_for_statment(HTMLParser.Cp_for_statmentContext ctx) {
        System.out.println("visit Cp_for_statment");
        Cp_for_statment cp_for_statment=new Cp_for_statment();
         for(int i=0;i<ctx.expression().size();i++)
         {
             cp_for_statment.getList().add(visitExpression(ctx.expression(i)));
         }
        return cp_for_statment;
    }

    @Override
    public Cp_switch_Default visitCp_switch_Default(HTMLParser.Cp_switch_DefaultContext ctx) {
        System.out.println("visit Cp_switch_Default");
         Cp_switch_Default cp_switch_default=new Cp_switch_Default();
         if(ctx.CP_SWITCH_DEFAULT()!=null)
         {
             cp_switch_default.setCP_SWITCH_DEFAULT(ctx.CP_SWITCH_DEFAULT().toString());
         }
        return cp_switch_default;
    }

    @Override
    public htmlAttribute visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {

        System.out.println("Html Attribute visit");
        htmlAttribute htmlAttribute=new htmlAttribute();
        Attribute attribute=new Attribute();

        if(htmlAttribute.getCp()!=null)
        {
            htmlAttribute.setCp(visitCp(ctx.cp()));
        }
        if(htmlAttribute.getOpen_statment()!=null)
        {
            htmlAttribute.setOpen_statment(visitOpen_statment(ctx.open_statment()));
        }
        if(htmlAttribute.getClose_statment()!=null)
        {
            htmlAttribute.setClose_statment(visitClose_statment(ctx.close_statment()));
        }
        if(htmlAttribute.getCpStatment()!=null)
        {
            htmlAttribute.setCpStatment(visitCpStatment(ctx.cpStatment()));
        }
        if(htmlAttribute.getCp_for_statment()!=null)
        {
            htmlAttribute.setCp_for_statment(visitCp_for_statment(ctx.cp_for_statment()));
        }
        if(htmlAttribute.getCp_switch_default()!=null)
        {
            htmlAttribute.setCp_switch_default(visitCp_switch_Default(ctx.cp_switch_Default()));
        }
        if(htmlAttribute.getAttributes()!=null)
        {
            htmlAttribute.setAttributes(visitAttributes(ctx.attributes()));
        }
        return htmlAttribute;
    }

    @Override
    public htmlChardata visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        System.out.println("visit HtmlChardata");
        htmlChardata htmlChardata=new htmlChardata();
        if(ctx.HTML_TEXT()!=null)
        {
            htmlChardata.setName(ctx.HTML_TEXT().toString());
        }
        return htmlChardata;
    }

    @Override
    public htmlMisc visitHtmlMisc(HTMLParser.HtmlMiscContext ctx) {
        System.out.println("visit HtmlMisc");
        htmlMisc htmlMisc=new htmlMisc();
        if(ctx.htmlComment()!=null)
        {
            htmlMisc.setComment(visitHtmlComment(ctx.htmlComment()));
        }
        return htmlMisc;
    }

    @Override
    public htmlComment visitHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        System.out.println("visit HtmlComment");
        htmlComment htmlComment =new htmlComment();
        if(ctx.HTML_COMMENT()!=null)
        {
            htmlComment.setHTML_COMMENT(ctx.HTML_COMMENT().toString());
        }
        if(ctx.HTML_CONDITIONAL_COMMENT()!=null)
        {
            htmlComment.setHTML_CONDITIONAL_COMMENT(ctx.HTML_CONDITIONAL_COMMENT().toString());
        }
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
//    @Override
//    public HTMLElement visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
//
//        System.out.println("Visit Html Element");
//        HTMLElement htmlElement=new HTMLElement();
//        HTMLTag tag = new HTMLTag();
//        System.out.println("Tag Name : "+ctx.TAG_NAME(0).getText());
//        System.out.println("---------------------------------------------------");
//        System.out.println(ctx.TAG_NAME().size() + "hhhhhhhhhhhhhhhhhhh");
//        //Attribute attribute=new Attribute();
//        tag.setName(ctx.TAG_NAME(0).getText());
//        System.out.println("HTML element: " + ctx.TAG_NAME(0).getText());
//        if (ctx.htmlContent().htmlElement().size() <= 0) {
//            tag.setTextContent(ctx.htmlContent().getText());
//            List<Attribute> attributeList = new ArrayList<Attribute>();
//            for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
//                Attribute attribute = visitHtmlAttribute(ctx.htmlAttribute(i));
//                attributeList.add(attribute);
//                //Todo
//
////                htmlElement.getAttributes().add(visitHtmlAttribute(ctx.at)));
//            }
//            // -------------------------------------------------------
//            if(ctx.htmlContent()!=null)
//            {
//                htmlContent content =visitHtmlContent(ctx.htmlContent());
//            }
//            //
//            tag.setAttributes(attributeList);
//            return tag;
//            //TODO iterate on ctx.htmlAttribute() and generate attribute then set its tag
//        } else if (ctx.htmlContent().htmlElement().size() > 0) {
//            // Visit all html attributes
//            List<Attribute> attributeList = new ArrayList<Attribute>();
//            for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
//                Attribute attribute = visitHtmlAttribute(ctx.htmlAttribute(i));
//                attributeList.add(attribute);
//            }
//            tag.setAttributes(attributeList);
//            // Visit all html elements (children)
//            List<HTMLElement> elements = new ArrayList<HTMLElement>();
//            System.out.println(", children: [ ");
//            for (int i = 0; i < ctx.htmlContent().htmlElement().size(); i++) {
////                comments.add(ctx.htmlContent().htmlComment(i));
//                elements.add(visitHtmlElement(ctx.htmlContent().htmlElement(i)));
//                System.out.print(",");
//            }
//            System.out.print(" ] ");
//            tag.setContent(elements);
//            return tag;
//        }
//
//        return htmlElement;
//    }

}
