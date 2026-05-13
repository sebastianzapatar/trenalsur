package Arboles;

public class Arbol <M extends Comparable<M>> {
    private Nodo<M> raiz;

    //todo
    //1. Inicializar el arbol
    //2. Insertar
    //Recorridos preorden inorden postorden
    //3. Eliminar
    //4. Buscar
    public Arbol() {
        this.raiz = null;
    }
    public void insertar(M valor) {
        this.raiz=this.insertarRecursivo(raiz, valor);
    }
    public Nodo<M> insertarRecursivo(Nodo<M>
                                     nodoactual,M valor){
        if(nodoactual == null){
            return new Nodo<>(valor);
        }
        if(valor.compareTo(nodoactual.data)<0){
            nodoactual.izquierdo=insertarRecursivo
                    (nodoactual.izquierdo,valor);
        }else if(valor.compareTo(nodoactual.data)>0){
            nodoactual.derecho=insertarRecursivo
                    (nodoactual.derecho,valor);
        }
        return nodoactual;
    }
    public void recorridoPreorden(){
        System.out.println("Recorrido de preorden");
        recorridoPreOrdenRecursivo(this.raiz);

        System.out.println();
        System.out.println("Recorrido de preorden" +
                " terminado");
    }
    public void recorridoPreOrdenRecursivo(Nodo<M> actual){
        if(actual!=null){
            System.out.print(actual.data+" ");
            recorridoPreOrdenRecursivo(actual.izquierdo);
            recorridoPreOrdenRecursivo(actual.derecho);

        }
    }
    public void recorridoInOrden(){
        recorridoInOrdenRecursivo(this.raiz);
        System.out.println();
    }
    public void recorridoInOrdenRecursivo(Nodo<M> actual){
        if(actual!=null){
            recorridoInOrdenRecursivo(actual.izquierdo);
            System.out.print(actual.data+" ");
            recorridoInOrdenRecursivo(actual.derecho);


        }
    }
    public void recorridoPostOrden(){
        recorridoPostOrdenRecursivo(this.raiz);
        System.out.println();
    }
    public void recorridoPostOrdenRecursivo(Nodo<M> actual){
        if(actual!=null){
            recorridoPostOrdenRecursivo(actual.izquierdo);
            recorridoPostOrdenRecursivo(actual.derecho);
            System.out.print(actual.data+" ");

        }
    }
    /*
    tres casos, el nodo que voy a eliminar no tenga hijos
    el nodo solo tenga un hijo,
    El nodo tenga dos hijos
     */
    public void eliminar(M valor){
        this.raiz=this.eliminarRecursivo(raiz, valor);
    }
    private Nodo<M> eliminarRecursivo(Nodo<M> nodoactual,
                                      M valor){
        if(nodoactual == null){
            return null;
        }else if(valor.compareTo(nodoactual.data)<0){
            nodoactual.izquierdo=eliminarRecursivo(nodoactual.izquierdo,valor);
        }else if(valor.compareTo(nodoactual.data)>0){
            nodoactual.derecho=eliminarRecursivo(nodoactual.derecho,valor);
        }else{
            if(nodoactual.izquierdo==null){
                return nodoactual.derecho;
            }
            if(nodoactual.derecho==null){
                return nodoactual.izquierdo;
            }
            nodoactual.data= (M)encontrarMinino(nodoactual.derecho);
            nodoactual.derecho=eliminarRecursivo(nodoactual.derecho,valor);
        }
        return  nodoactual;
    }
    private M encontrarMinino(Nodo<M> nodoactual){
        M min=nodoactual.data;
        while(nodoactual.izquierdo!=null){
            nodoactual=nodoactual.izquierdo;
            min=nodoactual.data;
        }
        return min;
    }
    public static void main(String[] args) {
        Arbol<Integer> w=new Arbol<Integer>();
        w.insertar(11);
        w.insertar(20);
        w.insertar(30);
        w.insertar(25);
        w.insertar(15);
        w.insertar(10);
        w.insertar(9);
        w.recorridoPreorden();
        w.recorridoInOrden();
        w.recorridoPostOrden();
    }

}
