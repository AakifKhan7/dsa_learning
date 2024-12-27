public class x_toEnd {
    
    static String temp = "";
    static int count = 0;
    public static void xToEnd(String s, int n){
        if(n == s.length()){
            for(int i = 0; i < count; i++){
                temp += 'x';
            }
            System.out.println(temp);
            return;
        }
        if(s.charAt(n) == 'x'){
            count++;
        }
        else{
            temp += s.charAt(n);
        }
        xToEnd(s, n + 1);
    }
    // time complexity: O(n)
    public static void main(String[] args) {
        String s = "axbxcxdx";
        int n = 0;
        xToEnd(s, n);
    }
}
