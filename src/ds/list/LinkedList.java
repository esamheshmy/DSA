package ds.list;



import ds.nodes.LinkedNode;

public class LinkedList<T> {
    LinkedNode head;
    public LinkedList() {
        head= null;
    }
    public void add(Object value){
        LinkedNode newNode=new LinkedNode(value, null,null);
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
        LinkedNode n=head;
        while(n!=null){
            System.out.println((T)n.value);
            n=n.next;
        }
    }
}

