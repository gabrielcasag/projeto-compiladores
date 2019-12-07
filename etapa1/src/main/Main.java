import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner entradaPadrao = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        Tabela tabelaDeSimbolos = new Tabela();
        String filepath = "./src/test/" ;
        System.out.println("Digite o nome de um arquivo de teste (testeLexico.jmm) :");
        filepath += entradaPadrao.nextLine();

        ANTLRFileStream file = new ANTLRFileStream(filepath);

        //ETAPA 1
        JmmLexer lexer = new JmmLexer(file);
        AnalisadorLexico al = new AnalisadorLexico(lexer);
        al.analisadorLexico(tabelaDeSimbolos);
    }
}
