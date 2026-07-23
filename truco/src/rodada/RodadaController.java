package rodada;

import java.util.ArrayList;
import java.util.List;

import baralho.BaralhoModel;
import cartas.CartaModel;
import utils.Utils;
import jogador.JogadorController;
import jogador.JogadorModel;
import rodada.EnumRodada.QuemVenceuEnum;


public class RodadaController {

    JogadorController jogadorController = new JogadorController();
    BaralhoModel baralhoModel = new BaralhoModel();
    RodadaModel rodadaModel = new RodadaModel(baralhoModel);
    List<CartaModel> cartasJogadasAzul = new ArrayList<>();
    List<CartaModel> cartasJogadasVermelho = new ArrayList<>();
    ArrayList<QuemVenceuEnum> quemVenceuRodada = new ArrayList<>();
    int index = 0;
    

    public int quemSai(List<JogadorModel> jogadores) {
        int numeroJogadores = jogadores.size();
        if (numeroJogadores - index == 0) {
            index = 0;
            return index;
        }
        return index;
    }

    private boolean faltaAlguem(List<JogadorModel> jogadores) {
        int indexFalta = index + 1;
        return indexFalta < jogadores.size();
    }

    public boolean continuarRodada(List<JogadorModel> jogadores) {
        if (faltaAlguem(jogadores)) {
            return true;
        }else {
            QuemVenceuEnum vencedor = quemGanhouQueda();
            quemVenceuRodada.add((vencedor));
            return false;
        }
    }

   public void jogarRodada(CartaModel carta, List<JogadorModel> jogador) {
        jogador.get(index).setTurn(true);
        jogadorController.jogarCarta(jogador.get(index), carta);
        if (index % 2 == 0 || index == 0) {
            cartasJogadasAzul.add(carta);
        } else {
            cartasJogadasVermelho.add(carta);
        }
       jogador.get(index).setTurn(false);
        index++;
    }


     public QuemVenceuEnum quemGanhouQueda() {
        int maiorAzul = buscarMaior(cartasJogadasAzul);
        int maiorVermelho = buscarMaior(cartasJogadasVermelho);
        if (maiorAzul > maiorVermelho){
            quemVenceuRodada.add(QuemVenceuEnum.Azul);
            return QuemVenceuEnum.Azul;
        } else if (maiorVermelho > maiorAzul){
            quemVenceuRodada.add(QuemVenceuEnum.Vermelho);
            return QuemVenceuEnum.Vermelho;
        }else{
            quemVenceuRodada.add(QuemVenceuEnum.Paxou);
            return QuemVenceuEnum.Paxou;
        }
      }
    
    public QuemVenceuEnum quemGanhouRodada() {
        int quantidade;
        QuemVenceuEnum quemVenceu = QuemVenceuEnum.Paxou;
        if (quemVenceuRodada.contains(QuemVenceuEnum.Paxou)) {
            quantidade = Utils.contadorDeIncidencia(quemVenceuRodada, QuemVenceuEnum.Paxou);
            switch (quantidade) {
                case 1:
                    if (quemVenceuRodada.getFirst().equals(QuemVenceuEnum.Paxou)) {
                        quemVenceu = quemVenceuRodada.get(1);
                    } else {
                        quemVenceu = quemVenceuRodada.getFirst();
                    }
                    break;
                case 2:
                    quemVenceu = quemVenceuRodada.getLast();
                    break;
                case 3:
                    quemVenceu = QuemVenceuEnum.Paxou;
            }
        } else {
            quantidade = Utils.contadorDeIncidencia(quemVenceuRodada, QuemVenceuEnum.Azul);
            if (quantidade == 2) {
                quemVenceu = QuemVenceuEnum.Azul;
            } else {
                quemVenceu = QuemVenceuEnum.Vermelho;
            }
        }
        System.out.println(quemVenceu);
        return quemVenceu;
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

    public int pesoRodada() {
        if(rodadaModel.pesoRodada == 1){
            return rodadaModel.pesoRodada = rodadaModel.pesoRodada + 2;
        }
        return rodadaModel.pesoRodada = rodadaModel.pesoRodada + 3;
    }


}
