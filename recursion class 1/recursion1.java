public class recursion1 {
    public static void Printing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Printing(n - 1); // resursion
    }
    
    public static void main(String []args){
        Printing(5);
    }
    
}
