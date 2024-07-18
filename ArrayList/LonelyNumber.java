import java.util.ArrayList;
import java.util.Arrays;

public class LonelyNumber {
    
    public static ArrayList<Integer> findLonely(int nums[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=1; i<n-1; i++){
            if(nums[i-1]+1 < nums[i] && nums[i]+1 < nums[i+1]){
                list.add(nums[i]);
            }
        }
        if(n==1){
            list.add(nums[0]);
        }

        if(n>1){
            if(nums[0]+1 < nums[1]){
                list.add(nums[0]);
            }
            if(nums[n-2]+1 < nums[n-1]){
                list.add(nums[n-1]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {10, 6, 5, 8};  

        System.out.println(findLonely(nums));
    }
}
