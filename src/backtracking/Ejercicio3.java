package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    private static boolean palindromo(String n,int inicio,
                                      int fin){
        while(inicio<fin){
            if(n.charAt(inicio)!=n.charAt(fin)){
                return false;
            }
            inicio++;
            fin--;

        }
        return true;
    }
    public static void partir(String s, int inicio,
                              List<String> particion,
                              List<List<String>> resultado){
        if(inicio==s.length()){
            resultado.add(new ArrayList<>(particion));
            return;
        }
        for(int fin=inicio;fin<s.length();fin++){
            //Substring s[inicio:fin] es palidromo?
            if(palindromo(s,inicio,fin)){
                String part = s.substring(inicio,fin+1);
                System.out.println("Palidromo encontrado: "+part);
                particion.add(part);
                partir(s,fin+1,particion,resultado);
                particion.remove(particion.size()-1);
                System.out.println("Backtracking desde "+part);
            }
        }

    }

    public static void main(String[] args) {
        String s="ANA";
        List<List<String>> resultado = new ArrayList<>();
        partir(s,0,new ArrayList<>(),resultado);
        for(List<String> lista:resultado){
            System.out.println(lista);
        }
    }
}
