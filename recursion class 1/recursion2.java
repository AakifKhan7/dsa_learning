public class recursion2 {
    public static void PrintNumber(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        PrintNumber(n + 1); // recursion
    }
    public static void main(String[] args){
        PrintNumber(1);
    }
}
