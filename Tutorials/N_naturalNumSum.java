import java.util.Scanner;

public class N_naturalNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        // int i = 1;
        // while( i<=n ){
        //    System.out.print(i + " ");
        //     i++;
        // }

//---------------------------------------------------------------------------------------------

       // // SUM of N-natural numbers

        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum + i;
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println("Sum is = " + sum);


    }
}
