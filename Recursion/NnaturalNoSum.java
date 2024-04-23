public class NnaturalNoSum {

    public static int calcSum(int n){
        //BaseCase
        if(n == 1){
            return 1;
        }

        return n + calcSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcSum(5));
    }
}
