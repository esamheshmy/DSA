package ds.linear;

public class LinkedList<T> {
    NodeD head;
    public LinkedList() {
        head= null;
    }
    public void add(Object value){
        NodeD  newNode=new NodeD(value, null,null);
        if(head==null)
            head=newNode;
        else{
            newNode.next=head;
            head.previous=newNode;
            head= newNode;
        }
    }
    public void delete(){
        head=head.next;
        head.previous=null;

    }
    public void display(){
        NodeD n=head;
        while(n!=null){
            System.out.println((T)n.value);
            n=n.next;
        }
    }
}

class Node {
    Object value;
    Node next;
    public Node(Object value,Node next) {
        this.value=value;
        this.next=next;
    }

}
 class NodeD {
    Object value;
    NodeD next;
    NodeD previous;
    public NodeD(Object value,NodeD next,NodeD previous) {
        this.value=value;
        this.next=next;
        this.previous=previous;
    }
}