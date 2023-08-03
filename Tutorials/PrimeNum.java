import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

// // 1st METHOD

//         boolean isPrime = true;

//         if (n <= 1){
//             isPrime = false;
//         }

//         for (int i=2; i<=(n-1); i++){
//             if (n % i == 0){
//                 isPrime = false;
//             }
//         }
//         if (isPrime==true){
//             System.out.println("Number entered is Prime Number");
//         }
//         else{
//             System.out.println("Number entered is not Prime Number");
//         }
//     }
// }    



// 2nd METHOD [OPTIMIZED CODE] 

        boolean isPrime = true;

        if (n <= 1){
            isPrime = false;
        }

        for (int i=2; i<=Math.sqrt(n); i++){
            if (n % i == 0){
                isPrime = false;
            }
        }
        if (isPrime==true){
            System.out.println("Number entered is Prime Number");
        }
        else{
            System.out.println("Number entered is not Prime Number");
        }
    }
}

