package rodada;

import java.util.ArrayList;
import java.util.List;

import cartas.CartaModel;
import jogador.JogadorController;
import jogador.JogadorModel;
import rodada.EnumRodada.QuemVenceuEnum;


public class RodadaController {

    JogadorController jogadorController = new JogadorController();
    List<CartaModel> cartasJogadasAzul = new ArrayList<>();
    List<CartaModel> cartasJogadasVermelho = new ArrayList<>();
    int index = 0;
    int pesoRodada = 1;
    

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

    private boolean faltaAlguem(List<JogadorModel> jogadores) {
        int indexFalta = index + 1;
        return indexFalta < jogadores.size();
    }

    void continuarRodada(List<JogadorModel> jogadores, ) {
        if (faltaAlguem(jogadores)) {
            
        }else{
           QuemVenceuEnum vencedor = quemGanhou(cartasJogadasAzul, cartasJogadasVermelho);
           if(vencedor == QuemVenceuEnum.Azul){
            //time azul ganha a rodada
           } else if (vencedor == QuemVenceuEnum.Vermelho){
            //time vermelho ganha a rodada
           } else {
            //paxou
           }
        }
    }

    private QuemVenceuEnum quemGanhou(List<CartaModel> cartasJogadasAzul, List<CartaModel> cartasJogadasVermelho) {
        int maiorAzul = buscarMaior(cartasJogadasAzul);
        int maiorVermelho = buscarMaior(cartasJogadasVermelho);
        if (maiorAzul > maiorVermelho){
            return QuemVenceuEnum.Azul;
        } else if (maiorVermelho > maiorAzul){
            return QuemVenceuEnum.Vermelho;
        }else{
            return QuemVenceuEnum.Paxou; 
        }
      }
    

    private int buscarMaior(List<CartaModel> cartasJogadas){
        int maior = 0;
        for(int i = 0; i < cartasJogadas.size(); i++) {
            CartaModel carta = cartasJogadas.get(i);
            if (carta.getPeso() > maior) {
                 maior = carta.getPeso();
            }
        }
        return maior;
    }

    private int pesoRodada() {
        return pesoRodada = pesoRodada + 3;
    }


}
