public class XtoPowerN {

    //Ist Approach ---------> TC = O(n)
    public static int power(int x, int n){
        //BaseCase
        if(n == 0) return 1;

        return x * power(x, n-1);
    }

    //IInd Approach -------> Fast Exponentiation BUT using RECURSION ---> TC = O(log(n))
    public static int optimizedPower(int a, int n){   
        // int ans = 1;

        // while(n>0){
        //     if (n % 2 != 0){   //if n is odd
        //         ans = ans * a;
        //         n = n-1;
        //     }
        //     else{            // if n is even
        //         n = n/2;
        //         a = a * a;
        //     }
        // }
        // return ans;

           //Base Case
           if(n == 0) return 1;
           
           int halfPower = optimizedPower(a, n/2);

           int halfPowerSq = halfPower * halfPower;

           //n is odd
           if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
           }
           return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 10));
    }
}
