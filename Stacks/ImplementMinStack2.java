import java.util.Stack;
public class ImplementMinStack2 {

    public static class MinStack{                         // TC= O(1)  SC= O(N)
        Stack<Long> st = new Stack<>();
        long min = Long.MAX_VALUE;
  
        public void push(int val) {
            long curr = (long)val;
            if(st.isEmpty()){
                st.push(curr);
                min = curr;
            }
            else{
                if(curr > min){
                    st.push(curr);
                }
                else{
                    st.push(2*curr-min);
                    min = curr;
                }
            }
        }
        
        public void pop() {
            if(st.isEmpty()) {
                return;
            }
            
            long curr = st.peek();
            if(curr > min){
                st.pop();
            }
            else{
                long prevMin = 2*min-curr;      // restoring the previous min
                min = prevMin;
                st.pop();
            }
        }
        
        public int top() {
            if(st.isEmpty()) {
                return -1;
            }
            
            long curr = st.peek();
            if(curr > min){
                return (int)curr;
            }
            else{
                return (int)min;
            }
        }
        
        public int getMin() {
            return (int)min;
        }    
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(7);        
        ms.push(8);        
        ms.push(5);        
        ms.push(6);        
        ms.push(3);        
        ms.push(4);
        System.out.println(ms.getMin()); 
        ms.pop();
        ms.pop();
        System.out.println(ms.getMin()); 
        ms.pop();
        System.out.println(ms.getMin()); 
    }
}
