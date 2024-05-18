public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String helper, String dest){          //n----> no. of disks

        //baseCase
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        //kaam
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, "A", "B", "C");
    }
}
