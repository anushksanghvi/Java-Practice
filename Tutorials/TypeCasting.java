import java.util.*;
public class TypeCasting {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        float marks = 94.999f;
        int marks2 = (int) marks;    // converting float to int

        System.out.println(marks);
        System.out.println(marks2);

// ------------------------------------

        // int number = 45;
        // char ch = (char) number;  //converting int to char

        // System.out.println(number);

//------------------------------------------------------------

        char ch = 'a';
        char ch2 = 'A';
        int number = ch;        //converting char to int       /* AESII values */
        int number2 = ch2;      //converting char to int
        
        System.out.println(number);
        System.out.println(number2);
        
//------------------------------------------------------------

        System.out.print("Enter your percentile: ");
        float percentile = sc.nextFloat();
        System.out.println("Your percentile is: " + (int)percentile);

      
    }
}
