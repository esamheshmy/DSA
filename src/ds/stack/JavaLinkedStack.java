package ds.stack;


import ds.nodes.DynamicNode;

public class JavaLinkedStack<T> {
    DynamicNode top;
    public JavaLinkedStack() {
        top= null;
    }
    public void push(Object value){
        DynamicNode newNode=new  DynamicNode (value,null);
        if(top==null)
            top=newNode;
        else{
            newNode.next=top;
            top= newNode;
        }
    }
    public T  pop(){
        if(top==null){
            System.out.println("stack is emplty");
            return null;
        }
        T value=(T) top.value;
        top=top.next;
        return value;
    }



}
