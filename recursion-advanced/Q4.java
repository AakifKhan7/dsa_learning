public class Q4 {

    public static int callGuests(int n){

        if(n <= 1){
            return 1;
        }

        // single person
        int ways1 = callGuests(n - 1);

        // pai
        int ways2 = (n - 1) * callGuests(n - 2);

        return ways1 + ways2;
    }
    
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));
    }
}
