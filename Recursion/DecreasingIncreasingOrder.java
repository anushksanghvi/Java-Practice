public class DecreasingIncreasingOrder {

    public static void printDec(int n) {
       // Base Case
        if (n <= 0) { 
            return; 
        }  
        System.out.print(n + " ");   // Kaam
        printDec(n - 1);             //Call inner function
    }


    public static void printInc(int n){
        // Base Case
        if(n<=0){
            return;
        }
        printInc(n-1);               ////Call inner function
        System.out.print(n + " ");   //Kaam

    }

    public static void main(String[] args) {
        printDec(10);
        printDec(-10);    // return nothing
        System.out.println();

        printInc(10);
    }
}
