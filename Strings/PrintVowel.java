import java.util.*;

public class PrintVowel {
    public static void countVowel(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                System.out.print(str.charAt(i) + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total no. of vowels in the string: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        countVowel(str);
    }
    
}
