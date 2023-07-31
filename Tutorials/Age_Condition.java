import java.util.*;
public class Age_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age >= 18){
            System.out.println("Adult: Can drive and vote");
        }
        else{
            System.out.println("Not adult");
        }
        
    }
}
