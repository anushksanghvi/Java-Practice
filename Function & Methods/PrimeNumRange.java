import java.util.*;
public class PrimeNumRange {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if (n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)==true){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();

        primeInRange(n);

    }
}
