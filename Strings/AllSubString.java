public class AllSubString {

    public static void printAllSubString1(String str){
        for (int i=0; i<str.length(); i++){            // Pick starting index
            for (int j=i+1; j<=str.length(); j++){     // Pick ending index
                System.out.println(str.substring(i,j));
            }     
        }
    }
    /*
    Time complexity: O( n^3 )
    Auxiliary Space: O(1)
     */

     public static void printAllSubString2(String str){
        for (int i=0; i<str.length(); i++){     // First loop for starting index
            String substr = "";
            for (int j=i; j<str.length(); j++){  // Second loop is generating sub-String
                substr += str.charAt(j);
                System.out.println(substr);
            }
        }
     }
     /*
    Time complexity: O(N2), where N is the length of the input string.
    Auxiliary Space: O(N), where N is the length of the input string.
      */

    public static void main(String[] args) {
        String str = "abcd";
        // printAllSubString1(str);
        printAllSubString2(str);
    }
}
