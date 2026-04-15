package ordenamiento;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private String sexo;

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    @Override
    public int compareTo(Persona o) {
        if(this.edad==o.edad) {
            return this.nombre.
                    compareTo(o.nombre);
        }
        return this.edad-o.edad;
    }
}
