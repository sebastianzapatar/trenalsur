package arbolesavl;

public class ArbolAVL <N extends Comparable<N>> {
    private NodoAVL<N> raiz;
    public ArbolAVL(){
        this.raiz=null;
    }
    private int obtenerAltura(NodoAVL<N> nodoactual){
        if(nodoactual.izquierdo==null){
            return 0;
        }
        return nodoactual.altura;
    }
    public int obtenerBalance(NodoAVL<N> nodoactual){
        if(nodoactual==null){
            return 0;
        }
        return obtenerAltura(nodoactual.izquierdo)-
                obtenerAltura(nodoactual.derecho);
    }
    private NodoAVL<N> rotacionDerecha(NodoAVL<N> y){
        NodoAVL<N> x=y.izquierdo;//Raiz del subabrol
        NodoAVL<N> T2=y.derecho;//Subarbol derecho
        x.derecho=y;
        y.izquierdo=T2;
        y.altura=Math.max(obtenerAltura(y.izquierdo),
                obtenerAltura(y.derecho));
        x.altura=Math.max(obtenerAltura(x.izquierdo),
                obtenerAltura(x.derecho));
        return y;
    }
}
