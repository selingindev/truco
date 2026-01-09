package rodada;

import java.util.ArrayList;
import java.util.List;

import cartas.CartaModel;
import jogador.JogadorController;
import jogador.JogadorModel;

public class RodadaController {

    JogadorController jogadorController = new JogadorController();
    List<CartaModel> cartasJogadasAzul = new ArrayList<>();
    List<CartaModel> cartasJogadasVermelho = new ArrayList<>();
    int index = 0;

    private int quemSai(List<JogadorModel> jogadores) {
        int numeroJogadores = jogadores.size();
        if (numeroJogadores - index == 0) {
            index = 0;
            return index;
        }
        int quemSai = index;
        index++;
        return quemSai;
    }

    void jogarRodada(CartaModel carta, List<JogadorModel> jogador) {
        jogador.get(index).setTurn(true);
        jogadorController.jogarCarta(jogador.get(index), carta);
        if (index % 2 == 0) {
            cartasJogadasAzul.add(carta);
        } else {
            cartasJogadasVermelho.add(carta);
        }
           jogador.get(index).setTurn(false);
    }

    private boolean faltaAlguem(List<JogadorModel> jogadores){
        int indexJogador = index + 1;
        return indexJogador < jogadores.size();
    }

    void continuarRodada(List<JogadorModel> jogadores){
     if(faltaAlguem(jogadores)){
        
     }
    }

}
