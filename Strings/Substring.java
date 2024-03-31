public class Substring {

    public static String printSubString(String str, int si, int ei){
        String substr = "";       //Initialize substr as an empty string
        for (int i=si; i<ei; i++){
            substr += str.charAt(i);    //concatenate
        }
        return substr;
    }

    
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(printSubString(str, 2    , 5));;


/*------------------------------------------------------------- */

        // Java has inbuilt substring function
        System.out.println(str.substring(2,7));
    }
}
