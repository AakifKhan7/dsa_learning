class occurance {

    static int first = -1;
    static int last = -1;

    public static void findOccurance(String s, int n, char element){

        if(n == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char current = s.charAt(n);
        if(current == element){
            if(first == -1){
                first = n;
            }else{
                last = n;
            }
        }
        findOccurance(s, n + 1, element);
    }

    // time complexity: O(n)
    public static void main(String[] args) {
        String s = "abcedfdfdfdf"; 
        findOccurance(s, 0,'f');
    }    
}
