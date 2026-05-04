package recursividad;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EjerciciosPreQuiz {
    public static boolean problem04(String text){
        return validateParentheses(text,0,0);
    }
    private static boolean validateParentheses(String text,int
                                               index, int cont){
        if(cont<0){
            return false;
        }
        if(index==text.length()){
            return cont==0;
        }
        char ch = text.charAt(index);
        if(ch=='('){
            return validateParentheses(text,index+1,cont+1);
        }
        if(ch==')'){
            return validateParentheses(text,index+1,cont-1);
        }
        return validateParentheses(text,index+1,cont);
    }
    public static void problem07(String text){
        permutar("",text);
    }
    private static void permutar(String prefijo,String restante){
        if(restante.isEmpty()){
            System.out.println(prefijo);
            return;
        }

        for(int i=0;i<restante.length();i++){
            char ch = restante.charAt(i);
            String nuevoRestante = restante.substring(0,i)+
                    restante.substring(i+1);
            permutar(prefijo+ch,nuevoRestante);
        }

    }
    public static void problem10(int[] arreglo){
        Map<Integer,Integer> frecuencia = new HashMap<>();
        for(int valor: arreglo){
            frecuencia.put(valor,
                    frecuencia.getOrDefault(valor,0)+1);
        }
        //Llamamos la funcion merge
        mergeSortFrecuencia(arreglo,0,arreglo.length-1,
                frecuencia);
    }
    private static void mergeSortFrecuencia(int[] arreglo,
                                            int inicio, int fin,
                                            Map<Integer,Integer> frecuencias){
        int medio=inicio+(fin-inicio)/2;
        //Llamamos la funcion para partir
        mergeSortFrecuencia(arreglo,inicio,medio,frecuencias);
        mergeSortFrecuencia(arreglo,medio+1,fin,frecuencias);
        mergeFrecuencia(arreglo,inicio,medio,fin,frecuencias);
    }
    private static void mergeFrecuencia(int[] arreglo, int inicio,
            int medio,int fin,
                                        Map<Integer,Integer> frecuencias){
        int[] temp=new int[fin-inicio+1];
        int i=inicio;
        int j=medio+1;
        int k=0;
        while(i<=medio&&j<=fin){
            if(compararFrecuencias(arreglo[i],arreglo[j],frecuencias)<=0){
                temp[k++]=arreglo[i++];
            }
            else{
                temp[k++]=arreglo[j++];
            }
        }
        while(i<=medio){
            temp[k++]=arreglo[i++];
        }
        while(j<=fin){
            temp[k++]=arreglo[j++];
        }
        for(int p = 0;p<temp.length;p++){
            arreglo[inicio+p]=temp[p];
        }

    }
    private static int compararFrecuencias(int a, int b, Map<Integer,Integer> frecuencias){
        int fa=frecuencias.get(a);
        int fb=frecuencias.get(b);
        if(fa!=fb){
            return fa-fb;
        }
        return a-b;
    }
    public static void problem13(int[] arreglo){
        int izq=0;
        int der=arreglo.length-1;
        while(izq<der){
            while(izq<der && arreglo[izq]%2==0){
                izq++;
            }
            while(izq<der && arreglo[der]%2!=0){
                der--;
            }
            if(izq<der){
                intercambiar(arreglo,izq,der);
            }
        }
    }
    private static void intercambiar(int[] arreglo, int i, int j) {
        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }
    public static void main(String[] args) {
        problem07("abc");
        int[] a={1,2,3,4,5};
        problem13(a);
        System.out.println(Arrays.toString(a));
    }
}
