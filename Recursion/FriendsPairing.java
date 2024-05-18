public class FriendsPairing {

    public static int friendsPair(int n){
        //BaseCase
        if(n==1 || n==2){
            return n;
        }

        //kaam---->choice
        //Single
        int f1 = friendsPair(n-1);
        
        //Pair
        int f2 = (n-1) * friendsPair(n-2);

        return f1 + f2;
    }
    public static void main(String[] args) {
        System.out.println(friendsPair(4));
    }
}
