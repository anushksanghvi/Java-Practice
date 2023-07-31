import java.util.*;
public class Area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle r : ");
        float r = sc.nextFloat();

        System.out.print("Enter sides of a Square s : ");
        float s = sc.nextFloat();

        System.out.print("Enter the length of Rectangle L : ");
        float L = sc.nextFloat();

        System.out.print("Enter the breadth of Rectangle B : ");
        float B = sc.nextFloat();

        System.out.print("Enter the height of Rectangle H : ");
        float H = sc.nextFloat();

        float CirArea = 3.14f * r * r;
        float SqrArea = s * s;
        float RecArea = L*B*H;
        
        
        System.out.println("Area of Circle = " + CirArea + " units sq");
        System.out.println("Area of Square of side " + s + " units = " + SqrArea + " units sq");
        System.out.println("Area of Rectangle = " + RecArea + " units sq" );

    }
    
}
