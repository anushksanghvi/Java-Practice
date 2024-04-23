public class Factorial {

    public static int factorial(int n){
        //BaseCase
        if(n == 0){
            return 1;
        }
        if(n<0){
            return -1;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(-6));
    }
}
