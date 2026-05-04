package listasdobles;

public class ListaDobleCircular<P> {
    private NodoDoble<P> cabeza;
    private int tam;
    public ListaDobleCircular() {
        this.tam = 0;
        this.cabeza = null;
    }
    //Metodo insertar al principio y al final
    public void insertar(P elemento) {
        NodoDoble<P> nuevo = new NodoDoble<>(elemento);
        if(cabeza == null) {
            cabeza = nuevo;
            cabeza.next = cabeza;
            cabeza.prev = cabeza;
        }
        else{
            NodoDoble<P> ultimo = cabeza.prev;
            nuevo.next = cabeza;
            nuevo.prev = ultimo;
            ultimo.next=nuevo;
            cabeza.prev = nuevo;
        }
        tam++;
    }
}
//todo buscar, recorrr derecho y reves, eliminar, insertar cualquier pos
