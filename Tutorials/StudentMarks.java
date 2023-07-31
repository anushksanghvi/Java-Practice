import java.util.Scanner;

public class StudentMarks {
    
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the marks: ");
    float marks = sc.nextFloat();

    // Ternary Operator

    String result = (marks >= 33) ? "Pass" : "Fail";
    System.out.println(result);

    }
}
