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
        Estudiante[] estudiantes = new Estudiante[4];
        Estudiante e1=new Estudiante("JJ F",5);
        Estudiante e2=new Estudiante("T G",4);
        Estudiante e3=new Estudiante("A S",4);
        Estudiante e4=new Estudiante("M C",1);
        estudiantes[0]=e1;
        estudiantes[1]=e2;
        estudiantes[2]=e3;
        estudiantes[3]=e4;
        bubbleSort2(estudiantes);
        for(int j = 0; j < estudiantes.length; j++) {
            System.out.println(estudiantes[j]);
        }
    }
}
