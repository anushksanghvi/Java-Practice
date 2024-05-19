public class StringPermutation {
    public static void printPerm(String str, String permutation){
        //baseCase
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }


        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1, str.length());
            printPerm(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        printPerm("abc", "");
    }
}
