import java.util.*;
public class RemoveDuplicateString {

    //Ist Approach -----> Brute Force ------> TC = O(n^2)
    public static String removeDuplicate1(String str){
        String ans = "";
        for(int i=0; i<str.length(); i++){
            int j=0;
            for(j=0; j<i; j++){
                if(str.charAt(i) == str.charAt(j)){ //same character found
                    break;
                }
            }
            if(i == j){                //if the index i is equal to the index j, it means that the character at index i has not been found earlier in the string before reaching index i. the character at index i is not a duplicate. So, it is appended to ans
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    // IInd Approach -----> Using Sorting ------> TC = O(nlog n)
    public static String removeDuplicate2(String str){
        char ch[] = str.toCharArray();
        String ans = "";
        Arrays.sort(ch);
        
        ans += ch[0];
        for(int i=1; i<ch.length; i++){
            if(ch[i] != ch[i-1]){
                ans += ch[i];
            }
        }
        return ans;
    }

    // IIIrd Approach -----> Using Recursion      -----> valid only for a to z and not for capital letters or special character)
    public static void removeDuplicate3(String str, int idx, StringBuilder newStr, boolean map[]){
        //Base Case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicate3(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicate3(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "abac#Ab$dB#a";
        System.out.println(removeDuplicate1(str));
        System.out.println(removeDuplicate2(str));
        String str1 = "appnnacollege";
        removeDuplicate3(str1, 0, new StringBuilder(""), new boolean[26]);
    }
}
