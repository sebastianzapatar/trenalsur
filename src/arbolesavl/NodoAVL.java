package arbolesavl;

import Arboles.Nodo;

public class NodoAVL<J extends Comparable<J>>{
    J data;
    NodoAVL<J> izquierdo;
    NodoAVL<J> derecho;
    int altura;
    public NodoAVL(J data){
        this.data=data;
        this.izquierdo=null;
        this.derecho=null;
        this.altura=1;
    }
}
