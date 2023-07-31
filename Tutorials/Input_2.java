import java.util.*;
public class Input_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();                /* After supplying data for int, we would hit the enter key. What nextInt() and nextDouble() does is it assigns integer to appropriate variable and keeps the enter key unread in the keyboard buffer. so when its time to supply String the nextLine() will read the enter key from the user thinking that the user has entered the enter key.(that's we get empty output). Unlike C, there is no fflush() to clean buffer, so we have to flush by not taking it in variable. */
        
        String s1 = sc.nextLine();
   
        System.out.println("Int1: " + i);
        System.out.println("Double: " + d);
        System.out.println("String1: " + s1);

//--------------------------------------------------------------------------------------------------------------
   

        // String s1 = sc.nextLine();
        // int i = sc.nextInt();
        // double d = sc.nextDouble();

        // System.out.println("Int1: " + i);
        // System.out.println("Double: " + d);
        // System.out.println("String1: " + s1);


    }
}