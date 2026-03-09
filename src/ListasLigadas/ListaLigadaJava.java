package ListasLigadas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaLigadaJava {
    public static void main(String[] args) {
        List<String>lista=new LinkedList<>();
        lista.add("Samuel");
        lista.add("Valeria");
        System.out.println(lista.size());
        lista.addFirst("Majo");
        lista.addLast("Andres novio Majo");
        System.out.println(lista);
    }
    //todo addSafe que inserter al final si la lista es muy grande
    //indice es 0 inserta al inicio
    //insertar normal
    // si el indice mayor o igual al tam insertar al final
}
