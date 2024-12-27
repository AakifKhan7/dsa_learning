class Permutation1 {


    public static void PrintPerm(String s, String temp){

        if(s.length() == 0){
            System.out.println(temp);
            return;
        }

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i + 1);
            PrintPerm(newStr, temp + currentChar);
        }
    }
    // time complexity: (n!)

    public static void main(String[] args) {
        String s = "abc";
        PrintPerm(s, "");
    }
}
