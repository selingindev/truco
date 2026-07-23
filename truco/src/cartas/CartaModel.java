package cartas;

public class CartaModel {

    private EnumNumero nome;   
    private int peso;
    private EnumNaipe naipe;
    private int indexAssociado;

    public CartaModel(EnumNumero nome, int peso, EnumNaipe naipe) {
        this.nome = nome;
        this.peso = peso;
        this.naipe = naipe;
        this.indexAssociado = 0;
    }

    public EnumNumero getNumero() {return nome;}
    public void setNumero(EnumNumero nome) {
        this.nome = nome;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public EnumNaipe getNaipe() {
        return naipe;
    }
    public void setNaipe(EnumNaipe naipe) {
        this.naipe = naipe;
    }
    public EnumNumero getNome() {return nome;}
    public void setNome(EnumNumero nome) {this.nome = nome;}
    public int getIndexAssociado() {return indexAssociado;}
    public void setIndexAssociado(int indexAssociado) {this.indexAssociado = indexAssociado;}
}
