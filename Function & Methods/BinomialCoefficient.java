import java.util.Scanner;

public class BinomialCoefficient{
    public static int factorial(int n){
        int f = 1;
        if(n<0){
            System.out.println("Invalid number");
        }
        else{
            for(int i=1; i<=n; i++){
                f = f * i;
            }
        }
        return f;
    }

    public static int binoCoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binoCoff = fact_n/(fact_r*fact_nmr);
        return binoCoff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.print("Enter r = ");
        int r = sc.nextInt();

        System.out.println("Binomial Coefficient = " + binoCoff(n, r));
               
    }
}