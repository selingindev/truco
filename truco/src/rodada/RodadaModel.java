package rodada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import baralho.BaralhoModel;
import rodada.EnumRodada.QuemVenceuEnum;

public class RodadaModel {
   
    BaralhoModel baralho;   
    Map<String, Integer> placar = new HashMap<>();
    int pesoRodada = 1;
    int pesoTruco = 3;
    ArrayList<QuemVenceuEnum> quemVenceuRodada;

    
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

    public ArrayList<QuemVenceuEnum> getQuemVenceuRodada() {
        return quemVenceuRodada;
    }

    public void setQuemVenceuRodada(ArrayList<QuemVenceuEnum> quemVenceuRodada) {
        this.quemVenceuRodada = quemVenceuRodada;
    }
}
