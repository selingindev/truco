package rodada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baralho.BaralhoModel;
import cartas.CartaModel;

public class Rodada {
   
    BaralhoModel baralho;   
    Map<String, Integer> placar = new HashMap<>();
    int pesoRodada = 1;
    int pesoTruco = 3;

    
    Rodada(BaralhoModel baralho){
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
