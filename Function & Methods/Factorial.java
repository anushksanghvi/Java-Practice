import java.util.*;
public class Factorial {

    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        System.out.print("Factorial = " + factorial(n)); 
    
    }
}
