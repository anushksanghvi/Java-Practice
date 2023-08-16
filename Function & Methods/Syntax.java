import java.util.Scanner;

public class Syntax{

    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int addition(int num1, int num2){   //parameter or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
         printHelloWorld();              //function call


        Scanner sc = new Scanner (System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
          
        System.out.println("Addition = " + addition(a,b));   // Arguments or actual parameters
    }
}