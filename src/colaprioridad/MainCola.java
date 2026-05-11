package colaprioridad;

import java.util.PriorityQueue;

public class MainCola {
    public static void main(String[] args) {
        PriorityQueue<Paciente> p = new PriorityQueue<>();
        Paciente p1 = new Paciente("mono","Diaz",17,100);
        Paciente p2 = new Paciente("Alejo","Sanchez",23,3);
        Paciente p3 = new Paciente("Majo","Sosa",18,3);
        Paciente p4 = new Paciente("Nicolas","Aguas",3,3);
        p.offer(p1);
        p.offer(p2);
        p.offer(p3);
        p.offer(p4);
        while(!p.isEmpty()){
            System.out.println(p.poll());
        }
    }
}
