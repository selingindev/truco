package partida;
import rodada.RodadaController;
import rodada.EnumRodada.QuemVenceuEnum;

public class PartidaController {
    RodadaController rodadaController = new RodadaController();
    PartidaModel partidaModel = new PartidaModel();
    int quantidadeJogadores = partidaModel.jogadores.size();

    private void aumentarPontos(){
        QuemVenceuEnum vencedor = rodadaController.continuarRodada(partidaModel.jogadores);
        if(vencedor == QuemVenceuEnum.Azul){
        partidaModel.pontosPartidaAzul = rodadaController.pesoRodada();
           } else if (vencedor == QuemVenceuEnum.Vermelho){
                    partidaModel.pontosPartidaVermelho = rodadaController.pesoRodada();
           } else {
            return;
           }
        }
    }

