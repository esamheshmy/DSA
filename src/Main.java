import static algorithm.Search.binarySearch;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      //  int[]ii=new int[1000];for(int i=0;i<ii.length;i++){ii[i]=i*2;}
        //System.out.print(binarySearch(ii,50));

        ArrayList<Object> ee=new ArrayList<>();

        ee.add(55);

        Stack ss=new Stack<>();
        ss.add("dd1");
        ss.add("dd2");
        ss.add("dd3");
        ss.add("dd4");
        ss.add("dd5");
        ss.add("dd6");
        ss.push("dd6");
        ss.add(2,"ssssssss");
        ss.pop();
        System.out.print(ss);


    }
    
}