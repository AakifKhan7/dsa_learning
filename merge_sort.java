public class merge_sort {
    public static void conquer(int arr[], int st, int mid, int end){
        int merged[] = new int[end - st + 1];

        int i = st;
        int j = mid + 1;

        int k = 0;

        // O(n)
        while (i <= mid && j <= end) {
            if(arr[i] <= arr[j]){
                merged[k++] = arr[i++];
            }else{
                merged[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = arr[i++];
        }

        while (j <= end) {
            merged[k++] = arr[j++];
            
        }

        for(int x = 0, y = st; x < merged.length; x++, y++){
            arr[y] = merged[x];
        }
    }

    public static void divide(int[] arr, int st, int end){
        if(st >= end){
            return;
        }
        // O(longn)
        int mid = st + (end - st) / 2; 
        divide(arr, st, mid);
        divide(arr, mid + 1, end);
        conquer(arr, st, mid, end);
    }

    // time complexity: O(nlogn)
    
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        divide(arr, 0, n - 1);
        // print
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
