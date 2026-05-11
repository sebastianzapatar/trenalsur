package colaprioridad;

public class Paciente implements  Comparable<Paciente>{
    private String nombre;
    private String apellido;
    private int edad;
    private int gravedad;
    public Paciente(){}
    public Paciente(String nombre, String apellido, int edad, int gravedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int compareTo(Paciente o) {
        if(this.gravedad == o.gravedad){

            if(this.edad <=3 && o.edad >3){

                return -1;
            }
            if(this.edad >3 && o.edad <=3){

                return 1;
            }
            return o.edad - this.edad;
        }
        return o.gravedad-this.gravedad;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", gravedad=" + gravedad +
                '}';
    }
}
