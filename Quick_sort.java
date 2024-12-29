public class Quick_sort {

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low - 1;

        for(int j = low;  j < high; j++){
            if(arr[j] < pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;// pivot index
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }
    
    // worst case time complexity: O(n^2)
    // best case time complexity: O(nlogn)
    public static void main(String[] args) {
        int[] arr = {7, 32, 64, 2, 10, 23};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
}
