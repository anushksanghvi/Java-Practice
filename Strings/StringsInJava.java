import java.util.*;
public class StringsInJava {

    //function to print the string using charAt() Method     
    public static void printLetters(String str){
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }


    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};  //character arrays

        String str = "abcd";
        String str2 = new String("xyz@#3588$");

        // Strings are IMMUTABLE

/*----------------------------------------------------------------------- */ 
        // //Input/Output
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the name:");
        // String name = sc.next();   // print only first word
        // System.out.println(name);
        // sc.nextLine();  // consume the newline character
        
        // System.out.println("Enter address:");
        // String address = sc.nextLine();  // print the complete line
        // System.out.println(address);

/*----------------------------------------------------------------------- */ 
        // //To find the length of String

        // String Fullname = "Anushk Sanghvi";
        // System.out.println(Fullname.length()); 

/*----------------------------------------------------------------------- */        
        //Concatenation
        String firstname = "Hello";
        String lastname = "World!";
        
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

/*----------------------------------------------------------------------- */        

        //charAt() Method
        System.out.println(firstname.charAt(4));
        System.out.println(fullname.charAt(5));

        //calling function to print the string using charAt() Method------> written above
        printLetters(fullname);

    }
}
