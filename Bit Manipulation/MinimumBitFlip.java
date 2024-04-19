public class MinimumBitFlip {

    // Ist Approach ---> using Inbuilt function 
    public static int minBitFlip1(int start, int goal){
        return Integer.bitCount(start ^ goal);
    }

    // IInd Approach
    public static int minBitFlip2(int start, int goal){
        int a = start ^ goal;     

        // Now Count no. of set bits
        int count = 0;
        while(a != 0){
           a= a & (a-1);
           count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(minBitFlip1(10, 20));
        System.out.println(minBitFlip2(7, 10));
        
    }
}
