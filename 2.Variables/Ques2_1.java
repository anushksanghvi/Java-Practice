import java.util.*;

//Average of 3 nos.

public class Ques2_1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        float A = sc.nextFloat();
        System.out.print("Enter B : ");
        float B = sc.nextFloat();
        System.out.print("Enter C : ");
        float C = sc.nextFloat(); 
        
        float Avg = (A + B + C)/3;
        System.out.println("Average of 3 nos. = " + Avg);
    }
}