import java.util.Arrays;
import java.util.Stack;
public class RemoveConsecutiveSubsequence {

    public static int[] remove(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i< arr.length; i++){
            if(st.isEmpty() || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek() == arr[i]){
                if(i== n-1 || arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }

        int res[] = new int[st.size()];
        for(int i=res.length-1; i>=0; i--){
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int result[] = remove(arr);
        
        // for(int i=0; i<result.length; i++){
        //     System.out.print(result[i] + " ");
        // }

        System.out.println(Arrays.toString(result));
    }
}
