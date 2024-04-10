import java.util.Arrays;
public class Anagram {

    public static void anagram(String str1, String str2){
        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()){
            // Convert strings into char arrays
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            // Sorting the char arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // If the sorted char arrays are the same, then the strings are anagrams
            if (Arrays.equals(str1charArray, str2charArray)){                // NOT str1charArray.equals(str2charArray)  because str1charArray.equals(str2charArray): This compares whether the two arrays are the same object in memory. WHEREAS Arrays.equals(str1charArray, str2charArray): This method from the Arrays class compares the contents of two arrays. In the context of checking for anagrams, you need to compare the sorted character arrays to see if they contain the same characters, regardless of their positions. So, you should use Arrays.equals() to ensure you're comparing the contents of the arrays, not their references in memory. 
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } 
            else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } 

        else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        anagram(str1, str2);

    }
}
