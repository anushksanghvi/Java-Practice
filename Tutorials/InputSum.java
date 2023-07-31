import java.util.*;
public class InputSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        double add = a + b;
        double sub = a - b; 
        double mul = a * b;

        System.out.println("Sum of two number is = " + add);
        System.out.println("Subtraction of two number is = " + sub);
        System.out.println("Multiplication of two number is = " + mul);

    }
}
