public class check_sort {
    public static boolean isSorted(int[] a, int n){

        if(n == 0){
            return true;
        }

        isSorted(a, n - 1);
        if(a[n] > a[n - 1]){
            return true;
        }
        else{ 
            return false;
        }
    }

    // time complexity: O(n)
    public static void main(String[] args) {
        int[] a = {7, 8, 3, 2, 1};
        int n = a.length - 1;
        System.out.println(isSorted(a, n));
    }
}
