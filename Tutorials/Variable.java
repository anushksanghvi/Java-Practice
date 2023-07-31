public class Variable {
    public static void main (String args[]){

    int a = 10;
    double b = 15.25;
    float c = 45.2f;      // to write float value we need to put "f" as shown
    double sum = a + b;
    char marks = 'a';
    String name = "Anushk";
    int age = 19;
    
    System.out.println ( "a = " + a);
    System.out.println("b = " + b);
    System.out.println("Sum of two number a and b = " + sum);
    System.out.println(marks);

    System.out.println("1) "+ name + age);
    System.out.println("2) "+ name + " " + age);
    System.out.println("3) " + name + "\n" + age);
    System.out.println("4) " + name + "\t" + age);

    }
}
