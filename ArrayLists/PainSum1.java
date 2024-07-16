import java.util.ArrayList;

public class PainSum1 {

    //Brute Force- O(n^2)
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

    // 2 Pointer Approach - O(n)
    public static boolean isPairSum2(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            //Case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //Case 2
            else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            //Case 3
            else{
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(isPairSum(list, 5));
        System.out.println(isPairSum(list, 15));

        
        System.out.println(isPairSum2(list, 5));
        System.out.println(isPairSum2(list, 15));
    }
}
