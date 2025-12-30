package jogador;

import java.util.List;

import cartas.CartaModel;

public class JogadorController {
    
    public void jogarCarta(JogadorModel jogador, CartaModel carta) {
        if(jogador.isYourTurn = false) return;
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
 