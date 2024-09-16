import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {

    // I Method --> Brute Force Approach ----> TC = O(n^2)
    public static int[] nextGreater(int arr[]){
        int res[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            res[i] = -1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }

    // II Method --> Using Stack ----> TC = O(n)
    
    // Next greater Element to the RIGHT
    public static int[] nextGreaterStack_Right(int arr[]){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()) {
                res[i] = -1;
            }
            else{
                res[i] = s.peek();
            }

            s.push(arr[i]);
        }
        return res;
    }

    // III Method --> Using Stack ----> TC = O(n)
    // Next greater Element to the RIGHT  ---> instead of moving the element to the stack we can also track by index
    // JUST ANOTHER VERSION OF WRITING ABOVE CODE
    public static int[] nextGreaterStack_RightII(int arr[]){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()) {
                res[i] = -1;
            }
            else{
                res[i] = arr[s.peek()];
            }

            s.push(i);
        }
        return res;
    }

    // Next greater Element to the LEFT
    public static int[] nextGreaterStack_Left(int arr[]){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()) {
                res[i] = -1;
            }
            else{
                res[i] = s.peek();
            }

            s.push(arr[i]);
        }
        return res;
    }

    // Next Smaller Element to the RIGHT
    public static int[] nextSmallerStack_Right(int arr[]){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }

            if(s.isEmpty()) {
                res[i] = -1;
            }
            else{
                res[i] = s.peek();
            }

            s.push(arr[i]);
        }
        return res;
    }

    // Next Smaller Element to the LEFT
    public static int[] nextSmallerStack_Left(int arr[]){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }

            if(s.isEmpty()) {
                res[i] = -1;
            }
            else{
                res[i] = s.peek();
            }

            s.push(arr[i]);
        }
        return res;
    }



    public static void main(String[] args) {
        int arr[] = {1,3,2,1,8,6,3,4};
        
        int result[] = nextGreater(arr);

        int resultStack1[] = nextGreaterStack_Right(arr);
        int resultStack2[] = nextGreaterStack_RightII(arr);
        int resultStack3[] = nextGreaterStack_Left(arr);

        int resultStack4[] = nextSmallerStack_Right(arr);
        int resultStack5[] = nextSmallerStack_Left(arr);
        
        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(resultStack1));
        System.out.println(Arrays.toString(resultStack2));

        System.out.println(Arrays.toString(resultStack3));

        System.out.println(Arrays.toString(resultStack4));
        System.out.println(Arrays.toString(resultStack5));
    }
}
