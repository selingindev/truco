package jogador;

import java.util.List;

import cartas.CartaModel;

public class JogadorController {
    
    public CartaModel jogarCarta(JogadorModel jogador, CartaModel carta) {
        if(!jogador.isYourTurn) return null;
        removerCarta(jogador, carta);
        System.out.println(jogador.getNome() + " jogou " + carta.getNumero() + " de " + carta.getNaipe());
        return carta;
    
    }

    public List<CartaModel> verMao(JogadorModel jogador) {
        return jogador.getMao();
    }

    private void removerCarta(JogadorModel jogador, CartaModel carta){
        List<CartaModel> maoAtual = jogador.getMao();
        maoAtual.remove(carta);
        jogador.setMao(maoAtual);
    }

    


}
 