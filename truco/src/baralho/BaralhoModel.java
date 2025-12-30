package baralho;
import java.util.ArrayList;
import java.util.List;

import cartas.CartaModel;

public class BaralhoModel {
    List<CartaModel> cartas = new ArrayList<>();


    public BaralhoModel(List<CartaModel> cartas) {
        this.cartas = cartas;
    } 

    public List<CartaModel> getCartas() {
        return cartas;
    }

    private void buildCartas() {
     for(int i = 0; i < 40; i++) {
            
     }
    }
}
