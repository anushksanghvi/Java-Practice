public class FastExponentiation {
    // Ist Approach ---> Using Bit Manipulation [Optimised]
    public static int fastExpo(int a, int n){       // TC = O(log n)  
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;          
        }
        return ans;
    }

        // IInd Approach ---> Optimised 
        public static int fastExpo2(int a, int n){       //Tc = O(log n)
            int ans = 1;

            while(n>0){
                if (n % 2 != 0){   //if n is odd
                    ans = ans * a;
                    n = n-1;
                }
                else{            // if n is even
                    n = n/2;
                    a = a * a;
                }
            }
            return ans;
        }
    
    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3));
        System.out.println(fastExpo2(8, 3));
    }
}
