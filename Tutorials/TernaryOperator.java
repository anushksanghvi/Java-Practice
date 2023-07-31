import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter num = ");
        int num = sc.nextInt();

        // Ternary Operator

        String type = ((num%2) == 0) ? "even" : "odd";
        System.out.println(type);

    }
}
