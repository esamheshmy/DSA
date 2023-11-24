import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        long l=factorial(0);
        System.out.print(l);
    }


      



    public static long factorial(int i){
        if (i==1||i==0) {
            return 1;
        }else{
            return i*(factorial(i-1));
        
        }
    }

}