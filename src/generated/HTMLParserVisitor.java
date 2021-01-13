// Generated from C:/Users/asus/Desktop/Compiler-project11/src\HTMLParser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HTMLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(HTMLParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp(HTMLParser.CpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cpSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpSwitch(HTMLParser.CpSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cpSwitchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpSwitchCase(HTMLParser.CpSwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cpFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpFor(HTMLParser.CpForContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cpStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpStatment(HTMLParser.CpStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#open_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_statment(HTMLParser.Open_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#close_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_statment(HTMLParser.Close_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_for_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_for_statment(HTMLParser.Cp_for_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_switch_Default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_switch_Default(HTMLParser.Cp_switch_DefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arraycontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraycontent(HTMLParser.ArraycontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#functionParametr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParametr(HTMLParser.FunctionParametrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HTMLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HTMLParser.StyleContext ctx);
}