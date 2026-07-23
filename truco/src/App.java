import java.util.ArrayList;
import java.util.List;

import baralho.BaralhoController;
import jogador.JogadorController;
import jogador.JogadorModel;
import rodada.RodadaController;

public class App {
    public static void main(String[] args) throws Exception {
        BaralhoController baralhoController = new BaralhoController();
        JogadorController jogadorController = new JogadorController();
        List<JogadorModel> jogadores = new ArrayList<>();
        RodadaController rodadaController = new RodadaController();


        JogadorModel jogador1 = new JogadorModel("Player1", null);
        JogadorModel jogador2 = new JogadorModel("Player2", null);

        jogadores.add(jogador1);
        jogadores.add(jogador2);
    
        baralhoController.buildCartas();
        baralhoController.destribuirCartas(jogadores);

        for (JogadorModel jogador : jogadores) {
            System.out.println("Mão do " + jogador.getNome() + ":");
            for (var carta : jogador.getMao()) {
                System.out.println("- " + carta.getNumero() + " de " + carta.getNaipe());
            }
        }
        System.out.println(baralhoController.getVira().getNumero() + " de " + baralhoController.getVira().getNaipe() + " é a carta virada."); 



            rodadaController.quemSai(jogadores);
            rodadaController.jogarRodada(jogador1.getMao().get(0), jogadores);
            rodadaController.jogarRodada(jogador2.getMao().get(2), jogadores);
            rodadaController.quemGanhouQueda();

            rodadaController.quemSai(jogadores);
            rodadaController.jogarRodada(jogador1.getMao().get(1), jogadores);
            rodadaController.jogarRodada(jogador2.getMao().get(1), jogadores);
            rodadaController.quemGanhouQueda();

            rodadaController.quemSai(jogadores);
            rodadaController.jogarRodada(jogador1.getMao().get(0), jogadores);
            rodadaController.jogarRodada(jogador2.getMao().get(0), jogadores);
            rodadaController.quemGanhouQueda();

            rodadaController.quemGanhouRodada();

    }
}
