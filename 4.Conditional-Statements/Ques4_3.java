import java.util.Scanner;

public class Ques4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Week Number: ");
        int WeekNum = sc.nextInt();

        switch(WeekNum){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4 : System.out.println("Wednesday");
            break;
            case 5 : System.out.println("Thursday");
            break;
            case 6 : System.out.println("Friday");
            break;
            case 7 : System.out.println("Saturday");
            break;
            default : System.out.println("Invalid Week Number");
        }
    
    }
}
