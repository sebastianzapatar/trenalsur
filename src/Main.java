import ListasLigadas.ListaLigada;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaLigada<String> listaLigada = new ListaLigada<>();
        listaLigada.createListaLigada("coste");
        listaLigada.insert("nalgona",0);
        listaLigada.showLista();
        System.out.println();
        listaLigada.insert("pechugona",2);
        listaLigada.insert("otra",1);
        listaLigada.showLista();
    }
}