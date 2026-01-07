package jogador;

import java.util.List;

import cartas.CartaModel;

public class JogadorModel {

    private String nome;
    private List<CartaModel> mao;
    public boolean isYourTurn = true;

    public JogadorModel(String nome, List<CartaModel> mao) {
        this.nome = nome;   
        this.mao = mao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CartaModel> getMao() {
        return mao;
    }
    public void setMao(List<CartaModel> mao) {
        this.mao = mao;
    }

    public void setTurn(boolean turn){
        this.isYourTurn = turn;
    }

}