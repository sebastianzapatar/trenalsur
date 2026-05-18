package Arboles;

import arbolesavl.NodoAVL;

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
    public int altura(Nodo<M> nodoactual){
        if(nodoactual == null){
            return 0;
        }
        int alturaIzquiera=altura(nodoactual.izquierdo);
        int alturaDerecho=altura(nodoactual.derecho);
        return 1+Math.max(alturaIzquiera,alturaDerecho);

    }
    private M encontrarMinino(Nodo<M> nodoactual){
        M min=nodoactual.data;
        while(nodoactual.izquierdo!=null){
            nodoactual=nodoactual.izquierdo;
            min=nodoactual.data;
        }
        return min;
    }
    public int contarHojas(Nodo<M> nodoactual){
        if(nodoactual == null){
            return 0;
        }
        if(nodoactual.izquierdo==null && nodoactual.derecho==null){
            return 1;
        }
        return contarHojas(nodoactual.izquierdo)+contarHojas(nodoactual.derecho);
    }
    public  Nodo<M> construirArbol(M... valores){
        Nodo<M> nodoactual=null;
        for(M v:valores){
            nodoactual=insertarRecursivo(nodoactual,v);
        }
        return nodoactual;
    }
    public boolean buscarValor(Nodo<M> nodoActual,M valor){
        if(nodoActual == null){
            return false;
        }
        if(valor.compareTo(nodoActual.data)==0){
            return true;
        }
        if(valor.compareTo(nodoActual.data)<0){
            return buscarValor(nodoActual.izquierdo,valor);
        }
        return buscarValor(nodoActual.derecho,valor);
    }
    public int contarInternos(Nodo<M> nodoactual){
        if(nodoactual == null){
            return 0;
        }
        if(nodoactual.izquierdo!=null || nodoactual.derecho!=null){
            return 1;
        }
        return contarInternos(nodoactual.izquierdo)+contarInternos(nodoactual.derecho);
    }
    public int encontrarNivel(Nodo<M> nodoactual, M valor, int nivel){
        if(nodoactual == null){
            return -1;
        }
        if(valor.compareTo(nodoactual.data)==0){
            return nivel;
        }
        if(valor.compareTo(nodoactual.data)<0){
            return encontrarNivel(nodoactual.izquierdo,valor,nivel+1);
        }
        return encontrarNivel(nodoactual.derecho,valor,nivel+1);
    }
    public int nivel(M valor){
        return encontrarNivel(raiz,valor,0);
    }
    public Nodo<M> invertirArbol(Nodo<M> nodoactual){
        if(nodoactual == null){
            return null;
        }
        Nodo<M> nodoIzquiero=invertirArbol(nodoactual.izquierdo);
        Nodo<M> nodoDerecho=invertirArbol(nodoactual.derecho);
        nodoactual.izquierdo=nodoDerecho;
        nodoactual.derecho=nodoIzquiero;
        return nodoactual;
    }
    public void invertirArbol(){
        invertirArbol(raiz);
    }
    public boolean iguales(Nodo<M> raiz1, Nodo<M> raiz2){
       if(raiz1==null && raiz2==null){
           return true;
       }
       if(raiz1.izquierdo==null || raiz2.derecho==null){
           return false;
       }
       return (raiz1.data.compareTo(raiz2.data)==0)&&
               iguales(raiz1.izquierdo,raiz2.izquierdo)
               && iguales(raiz1.derecho,raiz2.derecho);
    }
    public boolean espejo(Nodo<M> raiz1, Nodo<M> raiz2){
        if(raiz1==null && raiz2==null){
            return true;
        }
        if(raiz1.izquierdo==null || raiz2.derecho==null){
            return false;
        }
        return (raiz1.data.compareTo(raiz2.data)==0)&&
                espejo(raiz1.izquierdo,raiz2.derecho)&&
                espejo(raiz1.derecho,raiz2.izquierdo);
    }
    public boolean opcion2 (Nodo<M> raiz2){
        this.invertirArbol();
        return iguales(this.raiz,raiz2);

    }
    public Nodo<M> encontrarLCA(Nodo<M> raiz, M valor1, M valor2){
        if(raiz==null) return null;
        if(raiz.data.compareTo(valor1)==0 || raiz.data.compareTo(valor2)==0){
            return raiz;
        }
        Nodo<M> resultadoIzquierdo=encontrarLCA(raiz.izquierdo,valor1,valor2);
        Nodo<M> resultadoDerecha=encontrarLCA(raiz.derecho,valor2,valor1);
        if(resultadoIzquierdo!=null && resultadoDerecha!=null){
            return raiz;
        }
        return  (resultadoDerecha!=null)?resultadoDerecha:resultadoIzquierdo;
    }
    public static void main(String[] args) {
        Arbol<Integer> w=new Arbol<Integer>();
        Nodo<Integer> k=w.construirArbol(10,5,12,20,11,30,25);
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
        System.out.println(w.buscarValor(w.raiz,25));
        System.out.println(w.nivel(49));

        w.recorridoInOrden();
        System.out.println("Invertir arbol");
        w.invertirArbol();
        w.recorridoInOrden();
    }

}
