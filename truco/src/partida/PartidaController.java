package partida;
import rodada.RodadaController;
import rodada.EnumRodada.QuemVenceuEnum;

public class PartidaController {
    RodadaController rodadaController = new RodadaController();
    PartidaModel partidaModel = new PartidaModel();
    int quantidadeJogadores = partidaModel.jogadores.size();

    private void aumentarPontos(){
        QuemVenceuEnum vencedor = rodadaController.quemGanhouRodada();
        if(vencedor.equals(QuemVenceuEnum.Azul)){
            partidaModel.setPontosTimeAzul(rodadaController.pesoRodada());
           } else if (vencedor.equals(QuemVenceuEnum.Vermelho)){
            partidaModel.setPontosTimeVermelho(rodadaController.pesoRodada());
           }
        }
    }

