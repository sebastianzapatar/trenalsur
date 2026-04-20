package ordenamiento;

import java.util.Arrays;
import java.util.Random;


public class QuickSort {

    // Generador de números aleatorios para escoger el pivote
    private static final Random RANDOM = new Random();

    /**
     * Método público para ordenar el arreglo completo.
     */
    public static <T extends Comparable<T>> void quickSort(T[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        ordenar(arr, 0, arr.length - 1);
    }

    /**
     * Ordena recursivamente el subarreglo entre las posiciones bajo y alto.
     */
    private static <T extends Comparable<T>> void ordenar(T[] arr, int bajo, int alto) {
        if (bajo >= alto) {
            return;
        }

        // Escoger un pivote aleatorio dentro del rango [bajo, alto]
        int pivoteAleatorio = bajo + RANDOM.nextInt(alto - bajo + 1);

        // Mover el pivote al final para usar la partición de Lomuto
        intercambiar(arr, pivoteAleatorio, alto);

        // Particionar el arreglo y obtener la posición final del pivote
        int posicionPivote = particionar(arr, bajo, alto);

        // Llamadas recursivas a los subarreglos izquierdo y derecho
        ordenar(arr, bajo, posicionPivote - 1);
        ordenar(arr, posicionPivote + 1, alto);
    }

    /**
     * Particiona el arreglo usando el esquema de Lomuto.
     * Los menores o iguales al pivote quedan a la izquierda,
     * y los mayores a la derecha.
     */
    private static <T extends Comparable<T>> int particionar(T[] arr, int bajo, int alto) {
        T pivote = arr[alto];
        int i = bajo - 1;

        for (int j = bajo; j < alto; j++) {
            if (arr[j].compareTo(pivote) <= 0) {
                i++;
                intercambiar(arr, i, j);
            }
        }

        // Colocar el pivote en su posición correcta
        intercambiar(arr, i + 1, alto);
        return i + 1;
    }

    /**
     * Intercambia dos elementos del arreglo.
     */
    private static <T> void intercambiar(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = {14, 12, 3, 0, 15, 1, 7, 8, 9, 10};

        quickSort(array);

        System.out.println(Arrays.toString(array));
    }
}