import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MileLen {
	private static String load(String preCodeFile) 
			  throws java.io.IOException {
		return new String(
				java.nio.file.Files.readAllBytes(
						java.nio.file.Paths.get(preCodeFile)), 
				java.nio.charset.Charset.forName("UTF-8"));
	}

	public static void main(String[] args) {
		try {
			System.out.println("Scanning file...");
			ANTLRInputStream input = new ANTLRInputStream (
					load("examples/eje2.rpg")) ;
			MileParserLexer lexer = new MileParserLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			MileParserParser parser = new MileParserParser(tokens);
			ParseTree tree = parser.program();
			System.out.println("Done");
		} catch (Exception e) {
			System.err.print(e);
		}
	}
}
