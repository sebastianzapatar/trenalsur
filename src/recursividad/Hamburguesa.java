package recursividad;

import java.util.Objects;

public class Hamburguesa
        implements Comparable<Hamburguesa>{
    private int codigo;
    private float precio;
    private String nombre;

    @Override
    public boolean equals(Object o) {
        if (o == null ||
                getClass() != o.getClass())
            return false;
        Hamburguesa that = (Hamburguesa) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public int compareTo(Hamburguesa o) {
        if(this.precio > o.precio){ return 1;}
        else if(this.precio < o.precio){ return -1;}
        else{ return 0;}
    }
}
