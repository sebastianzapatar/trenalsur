import ListasLigadas.ListaLigada;
import recursividad.Factorial;

import java.math.BigInteger;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.set(2,1500);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println(lista.toString());
    }
}