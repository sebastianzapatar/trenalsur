public class BusquedaSecuencial {
    public static int isis(int[] a,int busqueda){
        for(int i=0;i<a.length;i++){
            if(a[i]==busqueda){

                return i;
            }
        }
        return -1;
    }
    public static int diferente(int[] a,int busqueda){
        boolean find=false;
        int index=-1;
        int i=0;
        while(i<a.length && !find){
            if(a[i]==busqueda){
                index=i;
                find=true;
            }
            i++;
        }
        return index;
    }
    public static boolean existeSuma(int[] a,int suma){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==suma)return true;
            }
        }
        return false;
    }
    public static int secuencia(Object[] a,
                                    Object busqueda){
        for(int i=0;i<a.length;i++){
            if(a[i].equals(busqueda)){
                return i;
            }
        }
        return -1;
    }
    public static int secuencia2(Object[] a,
                                Object busqueda){
        int i=0;
        boolean find=false;
        int index=-1;
        while(i<a.length && !find){
            if(a[i].equals(busqueda)){
                index=i;
                find=true;
            }
            i++;
        }
        return index;
    }
}
