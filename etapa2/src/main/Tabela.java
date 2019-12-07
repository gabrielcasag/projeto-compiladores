import org.antlr.v4.runtime.Token;
import java.util.ArrayList ;

public class Tabela {

    private ArrayList<Tupla> tabela ;

    public Tabela( ) {
        this.tabela = new ArrayList<Tupla>() ;
    }

    private int encontrarNaTabela(String nome)
    {
        int ret = 0 ;

        for ( Tupla t : tabela ) {
            if ( t.getToken().getText().equals( nome ) ) {
                return ret;
            }
            ret++;
        }
        return -1;
    }

    public int insereNaTabela( Token token , int linha , int coluna , TipoEntradaTabSimb tipo ) {

        Tupla tupla = new Tupla( token , linha , coluna , tipo );

        int ret = encontrarNaTabela( token.getText() ) ;
        if ( ret != -1 )
        {
            System.out.println( "TUPLA JA INSERIDA NA TABELA");
            return ret;
        }
        else
        {
            boolean add = tabela.add(tupla);
            if ( !add )
            {
                System.out.println( "ERRO AO INSERIR NA TABELA" );
            }
            return ( tabela.size() - 1 );
        }
    }

    public Tupla getTupla ( int index ) {
        return tabela.get( index ) ;
    }

    @Override
    public String toString () {
        String retorno = "" ;
        int entrada = 0 ;

        for ( Tupla t : tabela )
        {
            if ( t.getTipo() == TipoEntradaTabSimb.ID ) {
                retorno += entrada + " : [ " + t.getToken().getText() + " , " + t.getEndereco() + " ( " + t.getTipo() + " ) ]" + '\n';
                entrada++;
            }
        }
        return retorno ;
    }






}
