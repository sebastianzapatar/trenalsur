package ListasLigadas;

public class ListaLigada<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size;
    public Node createListaLigada(T value){
        head=new Node<>();
        head.data=value;
        tail=head;
        size=1;
        return head;
    }
    public void insert(T value,int index){
        Node<T> newNode=new Node<>();
        newNode.data=value;
        if(size==0){
            createListaLigada(value);
            return;
        }
        if(index>=size){
            newNode.next=null;
            tail.next=newNode;
            tail=newNode;
            size++;

        }
        else if(index==0){
            newNode.next=head;
            head=newNode;
            size++;
        }
        else{
            Node<T> temp=head;
            int i=0;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            Node<T> nextNode=temp.next;
            temp.next=newNode;
            newNode.next=nextNode;
            size++;
        }

    }
    public void showLista(){
        Node<T> temp=head;
        while(temp!=null){

            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
    }
    public int size(){
        return size;
    }
    //todo borrar elemento de la lista
    public void delete(int index){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        if(index==0){

            Node<T> temp=head;
            size--;
        }else if(index==size-1){
            Node<T> temp=head;
            for(int i=0;i<size-1;i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
        else if(index<size-1){
            Node<T> temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }

    }
    public void clear(){
        size=0;
        head=null;
        tail=null;
    }
    //Devolver un elemento de la posicion k

}
