package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static boolean subconjuntos(
            int[] numeros,int objetivo,
            int indice, int sumaActual,
            List<Integer> subconjunto
    ){
        if(sumaActual == objetivo){
            return true;
        }
        if(indice==numeros.length || sumaActual>objetivo){
            return false;
        }
        subconjunto.add(numeros[indice]);

        if(subconjuntos(numeros,objetivo,indice+1,
                sumaActual+numeros[indice]
                ,subconjunto)){
            return true;
        }
        subconjunto.remove(subconjunto.size()-1);

        return subconjuntos(numeros,objetivo,indice+1,
                sumaActual,subconjunto);
    }

    public static void main(String[] args) {
        int[] arreglo = {10,2,3,4,5};
        int objetivo=7;
        System.out.println(subconjuntos(
                arreglo,objetivo,0,0,
                new ArrayList<>()
        ));
    }
}
