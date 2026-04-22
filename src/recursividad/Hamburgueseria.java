package recursividad;

public class Hamburgueseria {
    private Hamburguesa[] hamburguesas=
            new Hamburguesa[10];
    private static int cantidad=0;
    public void agregarHamburguesa
            (Hamburguesa hamburguesa){
        int index=secuencia2(hamburguesas,
                hamburguesa);
        if(index!=-1){
            System.out.println("Hamburguesa ya existe" +
                    "no sea imbecil" +
                    "Mono por favor cante");
            return;
        }
        hamburguesas[cantidad++]=hamburguesa;
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
