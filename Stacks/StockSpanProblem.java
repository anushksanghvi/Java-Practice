import java.util.Arrays;
import java.util.Stack;
public class StockSpanProblem {

    public static int[] calculateSpan(int stock[]){
        Stack<Integer> st = new Stack<>();
        int span[] = new int [stock.length];
        span[0] = 1;
        st.push(0);

        for(int i=1; i<stock.length; i++){
            while(!st.isEmpty() && stock[i] >= stock[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                int preHigh = st.peek();
                span[i] = i-preHigh;
            }

            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int res[] = calculateSpan(stock);
        System.out.println(Arrays.toString(res)); 
    }
}
