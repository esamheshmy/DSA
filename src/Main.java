import static algorithm.Search.binarySearch;

public class Main {
    public static void main(String[] args) {
        int[]ii=new int[1000];for(int i=0;i<ii.length;i++){ii[i]=i*2;}
        System.out.print(binarySearch(ii,50));


    }
    
}