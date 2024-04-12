public class OddEven {

    //Ist Approach
    public static void checkOddEven1(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    //IInd Approach
    public static void checkOddEven2(int n){
        int bitMask = 1;
        if((n ^ bitMask) == n+1){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        checkOddEven1(3);
        checkOddEven1(12);

        checkOddEven2(11);
        checkOddEven2(14);

        
    }    
}
