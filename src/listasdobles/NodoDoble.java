package listasdobles;

public class NodoDoble<T> {
    public T datos;
    public NodoDoble<T> prev;
    public NodoDoble<T> next;
    public NodoDoble(T datos) {
        this.datos = datos;
        this.prev = null;
        this.next = null;
    }
}
