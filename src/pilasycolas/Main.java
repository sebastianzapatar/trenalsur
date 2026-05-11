package pilasycolas;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> lista = new Stack<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        //add = push
        //Agregan en la punta de la pila
        System.out.println(lista.pop());
        /*
        Funciones Stack
        push y add para agregar
        pop para obtener y limpiar el ultimo elemento
        peek obtienen la cima de la pila sin quitarlo
        .isEmpty la lista vacia
        .size devuelve el tam de la pila
         */
    }
}
