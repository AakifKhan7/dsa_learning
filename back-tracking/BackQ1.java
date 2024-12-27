class BackQ1 {

    // time complexity: O(n * n!)
    public static void main(String[] args) {
        String s = "abc";
        q1(s, "", 0);
    }
    
    static void q1(String s, String temp, int n){
        if(s.length() == 0){
            System.out.println(temp);
            return;
        }
        
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            String newString = s.substring(0, i) + s.substring(i + 1);
            q1(newString, temp + currentChar, n + 1);
        }
    }
}
