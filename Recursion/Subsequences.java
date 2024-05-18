import java.util.HashSet;

public class Subsequences {

    public static void printSubSequences(String str, int idx, String newStr){
        //baseCase
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        // to be
        printSubSequences(str, idx+1, newStr+currChar);

        // not to be 
        printSubSequences(str, idx+1, newStr);
    }

    
    public static void uniqueSubSequences(String str, int idx, String newStr, HashSet<String> set){
        //baseCase
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }

        char currChar = str.charAt(idx);
        // to be
        uniqueSubSequences(str, idx+1, newStr+currChar, set);

        // not to be 
        uniqueSubSequences(str, idx+1, newStr, set);
    }


    public static void main(String[] args) {
        printSubSequences("abc", 0, "");

        System.out.println("------");

        HashSet<String> set = new HashSet<>();
        uniqueSubSequences("aaa", 0, "", set);
    }
}
