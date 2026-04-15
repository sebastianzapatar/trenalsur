package ordenamiento;

import java.util.Arrays;

public class SelectionSort {
    public static<T extends Comparable<T>>
    void selectionSort(T[] arr) {
        int totalIter=0;
        for(int i = 0; i < arr.length; i++) {
            int indiceMinino=i;
            for(int j=i+1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[indiceMinino]) > 0) {
                    indiceMinino=j;
                }
                totalIter++;
            }
            if(indiceMinino!=i) {
                T aux = arr[i];
                arr[i] = arr[indiceMinino];
                arr[indiceMinino] = aux;
            }
        }
        System.out.println("Total Itera: "+totalIter);
    }

    public static void main(String[] args) {
        Integer[] arr = {13,22,7,69,71,50,3,4,323};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
