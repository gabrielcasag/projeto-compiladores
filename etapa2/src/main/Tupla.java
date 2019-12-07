import org.antlr.v4.runtime.Token;

import java.util.Random;

public class Tupla {
    private TipoEntradaTabSimb tipo ;
    private int endereco ;
    private Token token ;
    private int linha;
    private int coluna;

    public Tupla( Token token, int linha, int coluna , TipoEntradaTabSimb tipo ) {
        Random gerador = new Random() ;
        this.tipo = tipo ;
        this.endereco = gerador.nextInt(100000) ;
        this.token = token ;
        this.linha = linha ;
        this.coluna = coluna ;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public TipoEntradaTabSimb getTipo() {
        return tipo;
    }

    public void setTipo(TipoEntradaTabSimb tipo) {
        this.tipo = tipo;
    }
}
