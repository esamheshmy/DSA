public class SearchAlgorithms {
    

    public static int binarySearchAlgorithm(int[] sortedArray,int key,int low,int high ) {
        int index = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] == key) {
                 index = mid;
                 break;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] < key) {
                 low = mid + 1;
            }
        }
        return index;
    }

    public static int linerSearsh(int[] arr,int n,int l){

        for(int i=0;i<l;i++){
        if(arr[i]==n) return i;
        }
        return -1;
        }
    
  
}
