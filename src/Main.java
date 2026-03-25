import ListasLigadas.ListaLigada;
import recursividad.Factorial;

import java.math.BigInteger;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(200));
        System.out.println(Factorial.sumatorial(10));
        System.out.println(Factorial.potencia(3,4));
        System.out.println(Factorial.contarDigitos(15678));
        Factorial.hanio(10,'a','b','c');
    }
}