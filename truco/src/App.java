import java.util.ArrayList;
import java.util.List;

import baralho.BaralhoController;
import jogador.JogadorController;
import jogador.JogadorModel;

public class App {
    public static void main(String[] args) throws Exception {
        BaralhoController baralhoController = new BaralhoController();
        JogadorController jogadorController = new JogadorController();
        List<JogadorModel> jogadores = new ArrayList<>();


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

        jogadorController.jogarCarta(jogador1, jogador1.getMao().get(0));
        jogadorController.jogarCarta(jogador2, jogador2.getMao().get(0));

        
    }
}
