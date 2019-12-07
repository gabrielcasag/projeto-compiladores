import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner entradaPadrao = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        Tabela tabelaDeSimbolos = new Tabela();
        String filepath = "./src/test/" ;
        System.out.println("Digite o nome de um arquivo de teste (teste.jmm|teste1.jmm) :");
        filepath += entradaPadrao.nextLine();

        ANTLRFileStream file = new ANTLRFileStream(filepath);

        JmmLexer lexer = new JmmLexer(file);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        //ETAPA 2
        JmmParser parser = new JmmParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        final int[] error = {0};
        ParseTreeListener listener = new ParseTreeListener() {
            public void visitTerminal(TerminalNode terminalNode) {
                System.out.println("[visitando TERMINAL NODE]");
            }
            public void visitErrorNode(ErrorNode errorNode) {
                System.out.println("[visitando <ERROR NODE>]");
                error[0]++;
            }
            public void enterEveryRule(ParserRuleContext parserRuleContext) {
                System.out.println("[visitando ENTER RULE]");
            }
            public void exitEveryRule(ParserRuleContext parserRuleContext) {
                System.out.println("[visitando EXIT RULE]");
            }
        };
        ParseTree tree = parser.compilationUnit();
        System.out.println("\nIMPRIMINDO A ARVORE DE DERIVACAO\n");
        walker.walk(listener, tree);

        if ( error[0] == 0 )
        {
            System.out.println("Compilado sem erros !!");
        }else{
            System.out.println("Houve um ou mais erros de compilacao, verifique antes da Arvore !!");
        }

    }
}
