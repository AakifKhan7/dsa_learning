import java.util.Scanner;

public class recuresion4 {
    public static void Factorial(int n, int fact){
        if(n == 0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        Factorial(n - 1, fact);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        Factorial(n, 1);
    }
}
