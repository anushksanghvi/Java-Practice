import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a: ");
        float a = sc.nextFloat();
        
        System.out.print("Enter b: ");
        float b = sc.nextFloat();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);    //nextChar() does not exist

        switch(operator){
            case '+' : System.out.println("Sum = " + (a + b));
            break;

            case '-' : System.out.println("Subtraction = " + (a - b));
            break;

            case '*' : System.out.println("Multiplication = " + (a * b));
            break;

            case '/' : 
            if (b == 0){
                System.out.println("Invalid Division");
            }
            else{
                System.out.println("Division = " + (a / b));
            }       
            break;

            case '%' : 
            if (b == 0){
                System.out.println("Invalid Division");
            }
            else{
                System.out.println("Modulo = " + (a % b));
            }    
            break;

            default : System.out.println("Invalid operator");
        }

    }
}
