class SubSequnce1{
    
    public static void subsequence(String s, int n, String temp){
        if(n == s.length()){
            System.out.println(temp);
            return;
        }
        char currentChar = s.charAt(n);

        // to be
        subsequence(s, n + 1, temp + currentChar);

        // not to be
        subsequence(s, n + 1, temp);

    }
    // time complexity: O(2^n)
    
    public static void main(String[] args) {
        String s = "abc";
        int n = 0;
        subsequence(s, n, "");
    }
}
