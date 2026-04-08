package backtracking;
/*

Es dado un arreglo de enteros y un valor
objetivo, usar backtracking para ver si el
elemento existe y devolver su indice
 */
public class Ejercicio1 {
    public static int buscar(
            int[] arreglo,int objetivo,
            int indice
    ){
        if(indice==arreglo.length) return -1;
        if(objetivo==arreglo[indice]) return indice;

        return buscar(arreglo,objetivo,
                indice+1);
    }

    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5};
        int objetivo=4;
        int indice=buscar(arreglo,objetivo,0);
        System.out.println(indice);
    }
}
