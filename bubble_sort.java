class BubbleSorting{

    public static void PrintArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {7, 8, 3, 2, 1};

        // time complexity = O(n^2)
        // bubble sort
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j + 1]){
                    // swap 
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        PrintArray(a);
    }
}