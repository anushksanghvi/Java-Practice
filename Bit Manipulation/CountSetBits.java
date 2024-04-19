public class CountSetBits {

    //Ist Approach ----> Brute Force
    public static int countsetBit1(int n){
        int count = 0;
        while(n>1){
            if(n % 2 == 1){
                count++;
            }
            n= n/2;
        }
        if(n==1){
            count++;
        }

        return count;
    }

    // IInd Approach
    public static int countsetBit2(int n){
        int count = 0;
        while(n != 0){
           n = n & (n-1);
            count++;
        }
        return count;
    }

    // IIIrd Approach  ---> Using Inbuilt function to code set bit
    public static int countsetBit3(int n){
        return Integer.bitCount(n);
    }

    //IVth Approach
    public static int countsetBit4(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){    //Checking the LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countsetBit1(84));
        System.out.println(countsetBit2(84));
        System.out.println(countsetBit3(84));
        System.out.println(countsetBit4(84));
    }
}
