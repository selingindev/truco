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
        ;
        int jogadorAtual = index;
        index++;
        return jogadorAtual;
    }

    void jogarRodada(CartaModel carta, List<JogadorModel> jogadores) {
        if (index % 2 == 0) {
            cartasJogadasAzul.add(carta);
        } else {
            cartasJogadasVermelho.add(carta);
        }
        jogadorController.jogarCarta(jogadores.get(index), carta);
    }

}
