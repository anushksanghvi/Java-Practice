public class UpperCase_Problem {

    //I Method [Not Accurate. Cannot  handles when there are multiple consecutive whitespace]
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) ==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    //II Method [More Optimized and accurate]
    public static String toUpperCase1(String str) {
        StringBuilder sb = new StringBuilder();
        boolean isNewWord = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isWhitespace(c)) {
                sb.append(c);
                isNewWord = true;
            } 
            else if (isNewWord) {
                sb.append(Character.toUpperCase(c));
                isNewWord = false;
            } 
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "hi everyone, i am anushk        ti  ";
        String str2 = "hello WORLD";

        System.out.println(toUpperCase(str1));
        System.out.println(toUpperCase(str2));
        System.out.println();
        System.out.println(toUpperCase1(str1));
        System.out.println(toUpperCase1(str2));

        //Time Complexity = O(n)     [for both the Methods]
    }

}