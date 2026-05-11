package Arboles;

public class Nodo<S extends Comparable<S>> {
    S data;
    Nodo izquierdo;
    Nodo derecho;
    public Nodo(S data) {
        this.data = data;
        izquierdo = null;
        derecho = null;
    }
}
