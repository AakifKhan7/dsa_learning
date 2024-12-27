public class place_tiles {

    public static int placeTiles(int n, int m){

        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        // vertically
        int vertically = placeTiles(n - m, m);

        // horizontally
        int horizontally = placeTiles(n - 1, m);

        return vertically + horizontally;
    }

    public static void main(String[] args) {
        int n  = 4, m = 2;
        int total_ways = placeTiles(n, m);
        System.out.println(total_ways);
    }
}
