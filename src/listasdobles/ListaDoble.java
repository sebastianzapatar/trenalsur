package listasdobles;

public class ListaDoble<V> {
    private NodoDoble<V> cabeza;
    private NodoDoble<V> cola;
    private int tamano;
    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }
    //todo insertar inicio, insertar final, insertar anywhere
    public void insertarInicio(V dato){
        NodoDoble<V> nuevo = new NodoDoble<>(dato);
        if(cabeza==null){
            cabeza=cola=nuevo;
        }
        else{
            nuevo.next=cabeza;
            cabeza.prev=nuevo;
            cabeza=nuevo;
        }
        tamano++;
    }
    public void insertarFin(V dato){
        NodoDoble<V> nuevo = new NodoDoble<>(dato);
        if(cabeza==null){
            cabeza=cola=nuevo;
        }else{
            cola.next=nuevo;
            nuevo.prev=cola;
            cola=nuevo;
        }
        tamano++;
    }
    public void insertarAnywhere(V dato, int posicion){
        NodoDoble<V> nuevo = new NodoDoble<>(dato);
        if(posicion<0 || posicion>tamano){
            System.out.println("Torpe no es posible");
            return;
        }
        if(posicion==0){
            insertarInicio(dato);
            return;
        }
        if(posicion==tamano){
            insertarFin(dato);
            return;
        }
        NodoDoble<V> actual = cabeza;
        for(int i=0;i<posicion;i++){
            actual=actual.next;
        }
        nuevo.prev=actual.prev;
        nuevo.next=actual;
        actual.prev.next=nuevo;
        actual.prev=nuevo;
        tamano++;
    }
    public void clear(){
        cabeza=null;
        cola=null;
        tamano=0;
    }
    public void recorrerAdelante(){
        NodoDoble<V> actual = cabeza;
        while(actual.next!=null){
            System.out.print(actual.datos + "<-> ");
            actual=actual.next;
        }
        System.out.println("null");
    }
    public void recorrerAtras(){
        NodoDoble<V> actual = cola;
        while(actual.prev!=null){
            System.out.print(actual.datos + "<-> ");
            actual=actual.prev;
        }
        System.out.println("null");
    }
    //Hacer buscar por dato
    public int getNodo(V dato){
        NodoDoble<V> actual = cabeza;
        int i=0;
        while(actual.next!=null){
            if(actual.datos.equals(dato)){
                return i;
            }
            i++;
            actual=actual.next;
        }
        return -1;
    }
    //todo eliminar con el dato o por posicion
}
