public class remove_duplicates {
    static boolean[] map = new boolean[26];

    public static void removeDuplicates(String s, int n, String temp){

        if(n == s.length()){
            System.out.println(temp);
            return;
        }

        char currentChar = s.charAt(n);
        if(map[currentChar - 'a']){
            removeDuplicates(s, n + 1, temp);
        }else{
            temp += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicates(s, n + 1, temp);
        }
    }

    // time complexity: O(n)

    public static void main(String[] args) {
        String s = "abbcca";
        int n = 0;
        removeDuplicates(s, n, "");
    }
}
