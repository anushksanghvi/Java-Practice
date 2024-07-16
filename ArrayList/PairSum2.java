import java.util.ArrayList;
public class PairSum2 {
    
    //Brute Force => TC= O(n^2)
    public static boolean isPairSum(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    } 

    // 2 Pointer Approach => TC= O(n)
    public static boolean isPairSum2(ArrayList<Integer> list, int target){
        //Calculate Breaking point(pivot) --> bp
        int bp = -1;
        int n = list.size();

        for(int i=0; i<list.size(); i++){
            if (list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int Lp = bp + 1;    //smallest
        int Rp = bp;       // largest
        
        while(Lp!=Rp){
            // Case1:
            if(list.get(Lp) + list.get(Rp) == target){
                return true;
            }

            //Case 2:
            else if(list.get(Lp) + list.get(Rp) < target){
                Lp = (Lp+1)%n;
            }
            // Case3:
            else{
                Rp = (n+Rp-1)%n;
            }
        }
        return false;

    } 

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10  ==> Sorted and Rotated Arraylist
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(isPairSum(list, 16));
        System.out.println(isPairSum2(list, 16));     
    }
}
