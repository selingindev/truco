package baralho;

import java.util.ArrayList;
import java.util.List;

import cartas.CartaModel;
import cartas.EnumNaipe;
import cartas.EnumNumero;
import jogador.JogadorModel;

public class BaralhoController {

    private BaralhoModel baralhoModel = new BaralhoModel();
    private List<CartaModel> cartas = new ArrayList<>();
    int index = 0;

    public void buildCartas() {
        int peso = 4;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                cartas.add(new CartaModel(EnumNumero.values()[i], peso, EnumNaipe.values()[j]));
            }
            peso++;
        }
        baralhoModel.setCartas(cartas);
    }

    private void removerCarta(CartaModel carta) {
        cartas.remove(carta);
    }

    private CartaModel darCarta() {
        int idx = (int) (Math.random() * cartas.size());
        CartaModel carta = cartas.get(idx);
        removerCarta(carta);
        return carta;
    }

    private void virarCarta() {
        CartaModel carta = darCarta();
        baralhoModel.setVira(carta);
        definirManilha();
    }

    private void definirManilha(){
        CartaModel vira = baralhoModel.getVira();
        int indexManilha = vira.getNumero().ordinal() + 1;  
        if (indexManilha >= EnumNumero.values().length) {
            indexManilha = 0;
        }
        alterarPesoManilha(EnumNumero.values()[indexManilha]);   
    }

    private void alterarPesoManilha(EnumNumero manilha){
        for (CartaModel carta : cartas) {
            if (carta.getNumero() == manilha) {
                switch (carta.getNaipe()) {
                    case Balão:
                        carta.setPeso(15);
                        break;
                    case Espadas:
                        carta.setPeso(16);
                        break;
                    case Copas:
                        carta.setPeso(17);
                        break;
                    case Zap:
                        carta.setPeso(18);
                        break;
                } 
                System.out.println("Manilha: " + carta.getNumero() + " de " + carta.getNaipe() + " com peso " + carta.getPeso());
            }
        }
    }

    public CartaModel getVira() {
        return baralhoModel.getVira();
    }

    private void destruirBaralho() {
        cartas.clear();
    }

    private void quemSai(List<JogadorModel> jogadores){
        int numeroJogadores = jogadores.size(); 
        if(numeroJogadores - index == 0){
            index = 0;
            return;
        };
        index++;
    }

    public void destribuirCartas(List<JogadorModel> jogadores) {
        int numeroJogadores = jogadores.size();
        //virando carta de início para não ter problemas com peso
        virarCarta();
        for (int i = 0; i < numeroJogadores; i++) {      
            JogadorModel jogador = jogadores.get(i);
            List<CartaModel> mao = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                mao.add(darCarta());
            }
            jogador.setMao(mao);
        }
        System.out.println("Cartas não distribuídas: " + cartas.size());
    }

}
