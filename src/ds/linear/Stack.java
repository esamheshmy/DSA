package ds.linear;

class Stack<T>{
int top;
int size;
Object[] arrey;

Stack(int size){
this.size=size;
top=-1;
arrey=new Object[this.top];
}

    boolean isFull(){
return (top==this.size);
}
    boolean isEmpty(){
        return (top==-1);
}
void push(T t){
    top ++;
    if (isFull()){
        System.out.print("arrey is full");
    }else {
    arrey[top]=t;}
}
void pop(){
    if(isEmpty()){
        System.out.print("arrey is empty");
    }else {
        arrey[top]=null;
        top --;
    }

}
void printStackItems(){
    for(int i=top;i>0;i--){
        System.out.print(arrey[i]);

    }
}



}