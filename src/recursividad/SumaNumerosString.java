package recursividad;

public class SumaNumerosString {
    public static int suma(String s){
        return sumaRecursivo(s,0);
    }
    private static int sumaRecursivo(String s,int index){

        if (index >= s.length()) {
            return 0;
        }


        if (Character.isDigit(s.charAt(index))) {
            String numeroS = extraerNumero(s.substring(index));
            int numero = Integer.parseInt(numeroS);


            return numero + sumaRecursivo(s, index + numeroS.length());
        }

        // Si no es dígito, avanzar una posición
        return sumaRecursivo(s, index + 1);
    }
    public static int suma2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        if (Character.isDigit(s.charAt(0))) {
            String numeroStr = extraerNumero(s);
            int numero = Integer.parseInt(numeroStr);
            return numero +
                    suma2(s.substring(numeroStr.length()));
        }

        return suma2(s.substring(1));
    }
    private static String extraerNumero(String s){
        if(s.isEmpty() || !Character.isDigit(s.charAt(0))){
            return "";
        }
        return s.charAt(0)+
                extraerNumero(s.substring(1));
    }
    public static boolean palindrome(String s){
        return palRecursivo(s,0,s.length()-1);
    }
    private static boolean palRecursivo(String s,int ini,int fin){
        if(ini>=fin){
            return true;
        }
        if(s.charAt(ini) != s.charAt(fin))return false;
        return palRecursivo(s,ini+1,fin-1);
    }
    public static int sumaMatriz(int [][] matriz){
        return recorrerFilas(matriz,0);
    }
    private static int recorrerFilas(int [][] matriz,int f){
        if(f==matriz.length){
            return 0;
        }
        return recorrerColumnas(matriz,f,0)+
                recorrerFilas(matriz,f+1);
    }
    private static int recorrerColumnas(int [][]matriz, int f, int c){
        if (c == matriz[f].length) {
            return 0;
        }
        return matriz[f][c]+recorrerColumnas(matriz,f,c+1);
    }
    public static int cantidadCaminos(int n,int m){
        if(n==1 || m==1) return 1;
        return cantidadCaminos(n-1,m)+cantidadCaminos(n,m-1);
    }
    public static void main(String[] args) {
        System.out.println(suma("999999x99"));
        System.out.println(suma2("x1234ey7z"));
        System.out.println(suma2("x24234ey7z"));
    }
}
