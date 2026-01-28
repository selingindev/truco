package partida;

import java.util.List;

import jogador.JogadorModel;

public class PartidaModel {
    int pontosPartidaAzul = 0;
    int pontosPartidaVermelho = 0;
    int pontosTimeAzul = 0;
    int pontosTimeVermelho = 0;
    List<JogadorModel> jogadores;
    

    public int getPontosPartidaAzul() {
        return pontosPartidaAzul;
    }

    public void setPontosPartidaAzul(int pontosPartidaAzul) {
        this.pontosPartidaAzul = pontosPartidaAzul;
    }

    public int getPontosPartidaVermelho() {
        return pontosPartidaVermelho;
    }

    public void setPontosPartidaVermelho(int pontosPartidaVermelho) {
        this.pontosPartidaVermelho = pontosPartidaVermelho;
    }

    public int getPontosTimeAzul() {
        return pontosTimeAzul;
    }

    public void setPontosTimeAzul(int pontosTimeAzul) {
        this.pontosTimeAzul = pontosTimeAzul;
    }

    public int getPontosTimeVermelho() {
        return pontosTimeVermelho;
    }

    public void setPontosTimeVermelho(int pontosTimeVermelho) {
        this.pontosTimeVermelho = pontosTimeVermelho;
    }




    
}
