import ast.nodes.BaseASTVisitor;
import ast.nodes.HtmlDocument;
import ast.visitor.BaseVisitor;
import generated.HTMLLexer;
import generated.HTMLParser;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        try {
            String source = "samples//samples.txt";
            CharStream cs = fromFileName(source);
            HTMLLexer lexer = new HTMLLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            HTMLParser parser = new HTMLParser(token);
            ParseTree tree = parser.htmlDocument();
            HtmlDocument doc = (HtmlDocument) new BaseVisitor().visit(tree);
//            doc.accept(new BaseASTVisitor());
//            System.out.println(doc);
//            CommonTree tree = (CommonTree)parser.parse().getTree();
//            DOTTreeGenerator gen = new DOTTreeGenerator();
//            StringTemplate st = gen.toDOT(tree);
//            System.out.println(gen);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
