import java.util.HashSet;

public class subsequnce2 {

    public static void subsequence_(String s, int n, String temp, HashSet<String> set) {
        if(n == s.length()){
            if(set.contains(temp)){
                return;
            }else{
            System.out.println(temp);
            set.add(temp);
            return;
            }
        }
        char currentChar = s.charAt(n);

        // to be
        subsequence_(s, n + 1, temp + currentChar, set);

        // not to be
        subsequence_(s, n + 1, temp, set);

    }

    public static void main(String[] args) {
        String s = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence_(s, 0, "", set);
    }
}
