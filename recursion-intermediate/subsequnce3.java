public class subsequnce3 {

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};

    public static void combination(String s, int n, String temp) {
        if(n == s.length()){
            System.out.println(temp);
            return;
        }
        char currentChar = s.charAt(n);

        String mapping = keypad[currentChar - '0'];
        for(int i = 0; i < mapping.length(); i++){
            combination(s, n + 1, temp + mapping.charAt(i));
        }
    }

    // time complexity: O(4^n)

    public static void main(String[] args) {
        String s = "45";
        combination(s, 0, "");
    }
}
