import java.util.Scanner;
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of line n = ");
        int n = sc.nextInt();

        for(int line=n; line>=1; line--){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}        