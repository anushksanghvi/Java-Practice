public class FindPermutation {

    public static void findPrem(String str, String ans){
        //BaseCase
        if(str.length()==0){
            System.out.println(ans);
        }
        
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            
            //abcde ==> remove "c" ==> "ab" + "de" = "abde" 
            String NewStr = str.substring(0, i) + str.substring(i+1, str.length()); //removed i char from the string and stored in NewStr
            findPrem(NewStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPrem(str, "");
    }
}
