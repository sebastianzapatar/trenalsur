package colaprioridad;

public class Cliente implements Comparable<Cliente>{
    private String name;
    private String surname;
    private int age;
    private Tipos tipo;
    public Cliente(String name,String surname,int age,Tipos tipo){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.tipo=tipo;
    }


    @Override
    public int compareTo(Cliente o) {
        if(this.tipo==o.tipo){
            return this.surname.compareTo(o.surname);
        }
        if(this.tipo==Tipos.DOMICILIOVIP && o.tipo==Tipos.NORMAL){
            return this.surname.compareTo(o.surname);
        }
        if(this.tipo==Tipos.VIP && o.tipo!=Tipos.VIP){
            return -1;
        }
        else {
            return this.surname.compareTo(o.surname);
        }
    }
}
