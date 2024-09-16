import java.util.Stack;
public class LargestAreaHistogram {

    public static int largestRecArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;

        // Next Smaller Element (right) --> nsr
        Stack<Integer> st = new Stack<>();
        int nsr[] = new int [n];
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = st.peek();         // we wants only the index of nsr and not the element
            }

            st.push(i);
        }

        // Previous Smaller Element (left) --> nsl
        st = new Stack<>(); // clearing our stack
        int nsl[] = new int [n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = st.peek();     // we wants only the index of nsl and not the element
            }

            st.push(i);
        }

        // Calculate Area 
        for(int i=0; i<n; i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;    // (j-i-1)
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        int max = largestRecArea(heights);
        System.out.println(max);   
    }
}

