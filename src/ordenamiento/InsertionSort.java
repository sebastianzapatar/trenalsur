package ordenamiento;

import java.util.Arrays;

public class InsertionSort {
    public static<T extends Comparable<T>>
    void insertionSort(T[] arr) {
        for(int i=1;i<arr.length;i++) {
            T llave = arr[i];
            int j=i-1;//puntero que compara con lo demas
            while(j>=0 && llave.compareTo(arr[j])<0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = llave;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {13,22,7,69,71,50,3,4,323};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
