import java.util.ArrayList;

public class Q5 {

    public static void PrintSubset(ArrayList<Integer> subset){
        for(int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void FindSubset(int n, ArrayList<Integer> subset){

        if(n == 0){
            PrintSubset(subset);
            return;
        }

        subset.add(n);
        FindSubset(n - 1, subset);

        subset.remove(subset.size() - 1);
        FindSubset(n - 1, subset);
    }

    // time complexity: O(2^n)

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        FindSubset(n, subset);
    }
}
