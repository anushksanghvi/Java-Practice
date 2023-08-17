import java.util.Scanner;

public class Factorial {
    public static int printFactorial(int n){
        int f = 1;
        if (n<0){
            System.out.println("Invalid number");
        }
        else{        
            for(int i=1; i<=n; i++){
                f = f * i;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        System.out.println("Factorial = " + printFactorial(n));
    }
}
