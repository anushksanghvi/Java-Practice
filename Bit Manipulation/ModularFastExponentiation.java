public class ModularFastExponentiation {

    public static int modfastExpo(int a, int n, int p){
        int ans = 1;

        while(n>0){
            if (n % 2 != 0){     //if n is odd
                ans = (ans * a) % p;
                n = n-1;
            }
            else{               // if n is even
                n = n/2;
                a = (a * a) % p;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(modfastExpo(5, 3, 5));
    }
}
