public class Compare {
    public static void main(String[] args) {
        
/* 

1) The main difference between the .equals() method and the == operator is that one is a method, and the other is the operator.
2) We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.

NOTE:
Whenever we create an object using the operator 'new', it will create a new memory location for that object. So we use the == operator to check memory location or address of two objects are the same or not.

*/

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String ("Tony");

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
