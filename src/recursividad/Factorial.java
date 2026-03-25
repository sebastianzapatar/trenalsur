package recursividad;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int n){
        if(n==0 || n==1)return new BigInteger("1");
        else{
            BigInteger c=
                    new BigInteger(Integer.toString(n));
            return c.multiply(factorial(n-1));
        }
    }
    //Sumar los n primeros numeros naturales
    public static long sumatorial(int n){
        if(n==0 || n==1)return 1;
        else return n+sumatorial(n-1);
    }
    public static long potencia(int a,int b){
        if(b==0)return 1;
        else{
            return a*potencia(a,b-1);
        }
    }
    public static int contarDigitos(int n){
        if(n<10) return 1;
        else
            return 1 + contarDigitos(n/10);
    }
    public static int sumaDigitos(int n){
        if(n==0) return 0;
        else
            return sumaDigitos(n/10)+n%10;
    }
    public static long fibo(int n){
        if(n==1 || n==2)return 1;
        else return fibo(n-1)+fibo(n-2);
    }
    public static void hanio(int n, char origen,
                             char auxiliar,char destino){
        if(n==1){
            System.out.println("Mover disco 1 de "+origen
            +" a "+destino);
            return;
        }
        //Mover disco peque del origen al auxiliar
        hanio(n-1,origen,destino,auxiliar);
        System.out.println("Mover disco "+ n+ " de "+origen+
                " a "+destino);
        //Mover disco grande del origen al destino
        hanio(n-1,auxiliar,origen,destino);

    }
    public static int sumaVect(int[] v){
        return sumaVecRecursivo(v,0);
    }
    private static int sumaVecRecursivo(int[] v, int i){
        if(i==v.length) return 0;
        else
            return v[i]+sumaVecRecursivo(v,i+1);
    }
}
