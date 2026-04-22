import java.util.Arrays;

public class BusquedaBinaria {
    public static int busquedaBinaria(
            int[] arreglo,int a
    ){
        int izquierda=0;
        int derecha=arreglo.length-1;
        while(izquierda<=derecha){
            int medio=izquierda+
                    (derecha-izquierda)/2;
            if(arreglo[medio]==a){
                return medio;
            }
            if(arreglo[medio]<a){
                izquierda=medio+1;
            }
            else{
                derecha=medio-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,8,10,11,32};
        System.out.println(busquedaBinaria(arr,10));
        System.out.println(
                Arrays.
                        binarySearch
                                (arr,11));
    }
}
