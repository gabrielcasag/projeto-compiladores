
import org.antlr.v4.runtime.Token;
import java.util.List;

public class AnalisadorLexico {

    private JmmLexer lexer;

    public AnalisadorLexico(JmmLexer l ){
        lexer = l;
    }

    public void analisadorLexico(Tabela tabelaDeSimbolos)
    {
        List<? extends Token> tokens = lexer.getAllTokens();

        //INSERINDO TOKENS NA TABELA DE SIMBOLOS
        //CLASSE TABELA TRATA DE CRIAR AS TUPLAS
        for ( Token t : tokens ) {

            //IMPRIMINDO TOKENS RECONHECIDOS
            System.out.println(t.getText()) ;

            //VERIFICANDO SE E PALAVRA CHAVE OU ID
            if ( t.getType() == 51){
                tabelaDeSimbolos.insereNaTabela( t , t.getLine() , t.getCharPositionInLine() , TipoEntradaTabSimb.ID );
            }
            if ( t.getType() == 50 ){
                System.out.println("Token não reconhecido :" + t.getText());
                System.out.println("Erro na linha: " + t.getLine() + ", coluna: " + t.getCharPositionInLine());
                System.out.println();
            }
        }

        //IMPRIMINDO A TABELA DE SIMBOLOS
        System.out.println("IMPRIMINDO TABELA DE SIMBOLOS NO PADRAO :");
        System.out.println("ID : [ TOKEN , ENDEREÇO ( TIPOTOKEN ) ] \n");
        System.out.println( tabelaDeSimbolos );
    }
}
