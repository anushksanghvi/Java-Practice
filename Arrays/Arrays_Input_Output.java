import java.util.Scanner;

public class Arrays_Input_Output{
    public static void main(String[] args) {
        int marks[] = new int [5];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phy marks: ");
        // int phy = sc.nextInt();
        marks[0] = sc.nextInt();
        System.out.print("Enter chem marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter maths marks: ");
        marks[2] = sc.nextInt();
        System.out.print("Enter english marks: ");
        marks[3] = sc.nextInt();

        System.out.println("Your marks are: ");
        System.out.println("Phy = " + marks[0]);
        System.out.println("Chem = " + marks[1]);
        System.out.println("Maths = " + marks[2]);
        System.out.println("English = " + marks[3]);

        marks[3] = 95;
        System.out.println("English updated marks = " + marks[3]);
        marks[2] = marks[2] + 4;
        System.out.println("Maths updated marks = " + marks[2]);

        double percentage = (marks[0]+marks[1]+marks[2]+marks[3])/4;
        System.out.println("Percentage = " + percentage);
    }
}