import java.util.*;

//Bill of the items

public class Ques2_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float Total = (pencil + pen + eraser);
        System.out.println("Total cost is = " + Total);

        System.out.println("!8% GST tax is applied to the items");  //!8% GST tax is applied to the items

        float Final_Cost = Total + (0.18f * Total);
        System.out.println("Final Total cost is = " + Final_Cost);

        
    }
}
