package algorithm;

public class Search {
    public static int linearSearch(int[] data, int item) {
        int dataItem=-1;
        for (int i = 0; i < data.length; i++) {if (data[i] == item) {dataItem=i;break;}}
        return dataItem;
    }
    public static int binarySearch(int[] data, int item) {
        int low=0;
        int high=data.length;
        int mid=-1;

        while(true){
            mid=low+((high-low)/2);
            if(data[mid]==item){
                break;
            }
            if( data[mid]< item) low=mid+1;
            if( data[mid]> item) high=mid-1;
        }
        return mid;
}}

