package partida;
import rodada.RodadaController;
import rodada.EnumRodada.QuemVenceuEnum;

public class PartidaController {
    int pontosAzul;
    int pontosVermelho;

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


    private boolean acabouPartida(){
         pontosAzul = partidaModel.getPontosPartidaAzul();
         pontosVermelho = partidaModel.getPontosPartidaVermelho();

        if (pontosAzul >= 12 || pontosVermelho >= 12){
            return true;
        }
        return false;
    }

    public QuemVenceuEnum quemVenceuPartida(){
        if (pontosAzul >= 12){
            int pontoPartidaAzul = partidaModel.getPontosPartidaAzul() + 1;
            partidaModel.setPontosPartidaAzul(pontoPartidaAzul);
            return QuemVenceuEnum.Azul;
        }else{
            int pontoPartidaVermelha = partidaModel.getPontosPartidaVermelho() + 1;
            partidaModel.setPontosPartidaVermelho(pontoPartidaVermelha);
            return QuemVenceuEnum.Vermelho;
        }

    }

    }




