import java.util.Stack;
public class ImplementMinStack1 {

    public static class MinStack{                         // TC= O(1)  SC= O(2N)
        Stack<Integer> st = new Stack<>();
        Stack<Integer> minSt = new Stack<>();
    
        public void push(int val) {
            if(st.isEmpty()){
                st.push(val);
                minSt.push(val);
            }
            else{
                st.push(val);

                if(minSt.peek() < val){
                    minSt.push(minSt.peek());
                }
                else{
                    minSt.push(val);
                }
            }
        }
    
        public void pop() {
            st.pop();
            minSt.pop();
        }
        
        public int top() {
            return st.peek();
        }
        
        public int getMin() {
            return minSt.peek();
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
