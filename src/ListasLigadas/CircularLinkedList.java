package ListasLigadas;

public class CircularLinkedList<M> {
    public Node<M> head;
    public Node<M> tail;
    public int size;
    public Node<M> createdCircular(M value) {
        Node<M> w=new Node<>();
        w.data=value;

        w.next=w;
        head=w;
        tail=w;
        size=1;
        return w;
    }
    //todo insertar al principio, mitad y final
    public void insertar(M value,int index){
        Node<M> w=new Node<>();
        w.data=value;
        if(index==0){
            w.next=head;
            tail.next=w;
            head=w;
        }
    }
}
