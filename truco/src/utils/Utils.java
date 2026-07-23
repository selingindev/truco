package utils;

import rodada.EnumRodada.QuemVenceuEnum;

import java.util.ArrayList;

public class Utils {

   public static int contadorDeIncidencia(ArrayList<QuemVenceuEnum> objeto, QuemVenceuEnum comparacao){
        int contador = 0;
        for(QuemVenceuEnum enuns : objeto){
            if (enuns.equals(comparacao)){
                contador++;
            }
        }
         return contador;
    }


}
