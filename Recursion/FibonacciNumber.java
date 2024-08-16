public class FibonacciNumber {
    public static int fib(int n){
        //BaseCase
        if(n == 1 || n == 0){
            return n;
        }

        int f1 = fib(n-1);
        int f2 = fib(n-2);
        return f1 + f2;

        // return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));      // print nth Fibonacci No.


        //For printing Fibonacci Sequence till n
        int n = 10;
        for (int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
