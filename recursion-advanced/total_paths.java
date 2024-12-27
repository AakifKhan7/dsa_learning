public class total_paths {

    public static int CountPaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n - 1 && j == m - 1){
            return 1;
        }
        // move down
        int downPaths = CountPaths(i + 1, j, n, m);

        // move right
        int rightPaths = CountPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }
    // time complexity: O(2^(n + m))
    public static void main(String[] args) {
        int n = 3, m = 3;
        int total_paths = CountPaths(0, 0, n, m);
        System.out.println(total_paths);
    }
}
