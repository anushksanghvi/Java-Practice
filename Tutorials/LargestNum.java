import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter num1 = ");
        float num1 = sc.nextFloat();

        System.out.print("Enter num2 = ");
        float num2 = sc.nextFloat();

        System.out.print("Enter num3 = ");
        float num3 = sc.nextFloat();

           if (num1 >= num2 && num1 >= num3 ){
            System.out.println("Largest Number is = " + num1);
        }
        else if (num2 >= num3){
            System.out.println("Largest Number is = " + num2);
        }
        else {
            System.out.println("Largest Number is = " + num3);
        }
        
    }
}
