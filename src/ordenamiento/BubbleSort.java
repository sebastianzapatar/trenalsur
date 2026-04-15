package ordenamiento;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
    public static<T extends Comparable<T>>
    void bubbleSort2(T[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for(int j = i; j < arr.length; j++) {
                if(arr[j].compareTo(arr[i]) < 0) {
                    T aux = arr[j];
                    arr[j] = arr[i];
                    arr[i] = aux;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];
        Persona p1=new Persona("Valeria P",
                19,"No gracias");
        Persona p2=new Persona("Sebastian Z",
                37,"Si por favor :(");
        Persona p3=new Persona("Alejo U",18,
                "Si por favor");
        Persona p4=new Persona("Pablo E",20
        ,"Bueno");
        personas[0]=p1;
        personas[1]=p2;
        personas[2]=p3;
        personas[3]=p4;
        bubbleSort2(personas);
    }
}
