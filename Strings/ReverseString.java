public class ReverseString {

    public static String reverseString(String str){
        String revStr = "";
        for(int i=str.length()-1; i>=0; i--){
            revStr += str.charAt(i);
        }
        return revStr;
    }

    // IInd Method
    public static String reverseStringII(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();     //String Builder has in-built function to reverse the string
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(reverseStringII("Hello"));
        
    }
}
