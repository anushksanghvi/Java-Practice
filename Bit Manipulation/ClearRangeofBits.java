public class ClearRangeofBits {

    // Ist Approach
    public static int clearBitInRange1(int n, int i, int j){
        int a = (~0 << (j+1));
        int b = ((1<<i) - 1);
        int bitMask = a | b;  
        return n & bitMask;
    }

    
    // IInd Approach
    public static int clearBitInRange2(int n, int i, int j) {
        for (int x = i; x <= j; x++) {
            int bit = (n & (1 << x));   // get the bit from i to j
            if (bit != 0) {             
                n = n ^ (1 << x);        // toggle '1'
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(clearBitInRange1(106, 1, 5));
        System.out.println(clearBitInRange2(106, 1, 5));
    }
}
