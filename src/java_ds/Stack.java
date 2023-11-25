package java_ds;

import java.util.ArrayList;

public class Stack<E> {
    int top=-1;
    ArrayList<E> elemenArre;
    void stack(){
        this.elemenArre= new ArrayList<E>();
    }

    void push(E element){
        top++;
        //   elemenArre(element);
    }
    void pop(E element){
        elemenArre.set(top, element);
        top--;
    }



}
