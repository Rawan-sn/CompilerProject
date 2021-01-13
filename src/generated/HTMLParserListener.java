// Generated from C:/Users/asus/Desktop/Compiler-project11/src\HTMLParser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HTMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HTMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(HTMLParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(HTMLParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp}.
	 * @param ctx the parse tree
	 */
	void enterCp(HTMLParser.CpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp}.
	 * @param ctx the parse tree
	 */
	void exitCp(HTMLParser.CpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cpSwitch}.
	 * @param ctx the parse tree
	 */
	void enterCpSwitch(HTMLParser.CpSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cpSwitch}.
	 * @param ctx the parse tree
	 */
	void exitCpSwitch(HTMLParser.CpSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cpSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterCpSwitchCase(HTMLParser.CpSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cpSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitCpSwitchCase(HTMLParser.CpSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cpFor}.
	 * @param ctx the parse tree
	 */
	void enterCpFor(HTMLParser.CpForContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cpFor}.
	 * @param ctx the parse tree
	 */
	void exitCpFor(HTMLParser.CpForContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cpStatment}.
	 * @param ctx the parse tree
	 */
	void enterCpStatment(HTMLParser.CpStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cpStatment}.
	 * @param ctx the parse tree
	 */
	void exitCpStatment(HTMLParser.CpStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#open_statment}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statment(HTMLParser.Open_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#open_statment}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statment(HTMLParser.Open_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#close_statment}.
	 * @param ctx the parse tree
	 */
	void enterClose_statment(HTMLParser.Close_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#close_statment}.
	 * @param ctx the parse tree
	 */
	void exitClose_statment(HTMLParser.Close_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_for_statment}.
	 * @param ctx the parse tree
	 */
	void enterCp_for_statment(HTMLParser.Cp_for_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_for_statment}.
	 * @param ctx the parse tree
	 */
	void exitCp_for_statment(HTMLParser.Cp_for_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_switch_Default}.
	 * @param ctx the parse tree
	 */
	void enterCp_switch_Default(HTMLParser.Cp_switch_DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_switch_Default}.
	 * @param ctx the parse tree
	 */
	void exitCp_switch_Default(HTMLParser.Cp_switch_DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(HTMLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arraycontent}.
	 * @param ctx the parse tree
	 */
	void enterArraycontent(HTMLParser.ArraycontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arraycontent}.
	 * @param ctx the parse tree
	 */
	void exitArraycontent(HTMLParser.ArraycontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionParametr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParametr(HTMLParser.FunctionParametrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionParametr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParametr(HTMLParser.FunctionParametrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HTMLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HTMLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HTMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(HTMLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(HTMLParser.StyleContext ctx);
}