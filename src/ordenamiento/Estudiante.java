package ordenamiento;

public class Estudiante implements
        Comparable<Estudiante>{
    private String nombre;
    private float promedio;

    public Estudiante(String nombre, float promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                '}';
    }

    public int compareTo(Estudiante estudiante) {
        if(this.promedio > estudiante.promedio)
            return 1;
        if(this.promedio < estudiante.promedio)
            return -1;
        else{
           return this.nombre.
                    compareTo(estudiante.nombre);
        }


    }
}
