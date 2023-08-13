import java.util.Scanner;
public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of line n = ");
        int n = sc.nextInt();

        // //1st METHOD
        // for(int line=n; line>=1; line--){
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }  

    //--------------------------------------------------------------------

        // //2nd METHOD
        for(int line=1; line<=n; line++){
            for (int star=1; star<=n-line+1; star++){
                System.out.print("*");
            }  
            System.out.println();
        }
  
    }
}