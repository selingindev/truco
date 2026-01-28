package rodada;

import java.util.HashMap;
import java.util.Map;

import baralho.BaralhoModel;

public class RodadaModel {
   
    BaralhoModel baralho;   
    Map<String, Integer> placar = new HashMap<>();
    int pesoRodada = 1;
    int pesoTruco = 3;

    
    RodadaModel(BaralhoModel baralho){
        this.baralho = baralho;
    }


    public BaralhoModel getBaralho() {
        return baralho;
    }


    public void setBaralho(BaralhoModel baralho) {
        this.baralho = baralho;
    }


    public Map<String, Integer> getPlacar() {
        return placar;
    }


    public void setPlacar(Map<String, Integer> placar) {
        this.placar = placar;
    }


    public int getPesoRodada() {
        return pesoRodada;
    }


    public void setPesoRodada(int pesoRodada) {
        this.pesoRodada = pesoRodada;
    }


    public int getPesoTruco() {
        return pesoTruco;
    }


    public void setPesoTruco(int pesoTruco) {
        this.pesoTruco = pesoTruco;
    }
    
     
}
