import java.util.Scanner;

public class Ques4_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if (year % 4 == 0){
            System.out.println("Leap Year!");
        }
        else{
            System.out.println("Not a Leap Year");
        }

    }
}
