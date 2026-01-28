package partida;

public class PartidaModel {
    int pontosPartidaAzul = 0;
    int pontosPartidaVermelho = 0;
    
    int pontosTimeAzul = 0;
    int pontosTimeVermelho = 0;
    PartidaModel partida;

    public PartidaModel(PartidaModel partida) {
        this.partida = partida;
    }

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
