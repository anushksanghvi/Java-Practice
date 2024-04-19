public class BitOperation {

    //Get ith Bit
    public static int get_Ith_Bit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // Set ith Bit    
    public static int set_Ith_Bit(int n, int i){
        int bitMask = 1<<i;
        return (n | bitMask);
    }

    //Clear ith Bit
    public static int clear_Ith_Bit(int n, int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }

    //Update ith Bit
    public static int update_Ith_Bit(int n, int i, int newBit){
    
        //I Approach        
        if (newBit == 0){
            return clear_Ith_Bit(n, i);
        }
        else{
            return set_Ith_Bit(n, i);
        }

    //  //II Approach
    // n=clear_Ith_Bit(n, i);
    // int bitMask = newBit<<i;
    // return (n | bitMask);    
    }

    //Toggle ith Bit
    public static int toggle_Ith_Bit(int n, int i){
        int bitMask = 1<<i;
        return (n ^ bitMask);
    }

    //Clear Last i Bits
    public static int clearLast_I_Bits(int n, int i) {
        int bitMask = (~0<<i);
        return (n & bitMask);
    }

    //Removing last set bit(rightmost)
    public static int removingLastSetBit(int n){
        return (n & n-1);
    }

    //Checking if a number is Power of 2
    public static boolean isPowerOfTwo(int n){
        // if((n & (n-1)) == 0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return (n & n-1) == 0;
    }
 
    public static void main(String[] args){
        System.out.println(get_Ith_Bit(10, 2));
        System.out.println(set_Ith_Bit(10, 2));
        System.out.println(clear_Ith_Bit(10, 1));
        System.out.println(update_Ith_Bit(10, 1, 0));
        System.out.println(toggle_Ith_Bit(10, 2));
        System.out.println(clearLast_I_Bits(15, 2));

        System.out.println(removingLastSetBit(40));
        System.out.println(isPowerOfTwo(40));
        System.out.println(isPowerOfTwo(16));
        
    }
}