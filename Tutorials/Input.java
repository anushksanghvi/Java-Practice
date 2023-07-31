import java.util.*;
public class Input {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        String name = sc.next();       // next() -> print only one word of input
        String fullLine = sc.nextLine();     // nextLine() -> print line of input
        int a = sc.nextInt();            // nextInt() -> take int type of input
        float b = sc.nextFloat();        // nextFloat() -> take float type of input
        double c = sc.nextDouble();
        boolean old = sc.nextBoolean();  // nextBoolean()-> take only true or false as input

       System.out.println(name);
       System.out.println(fullLine);
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(old);
        
    }
}
