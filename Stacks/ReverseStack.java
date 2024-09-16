import java.util.Stack;

public class ReverseStack {

    // Iterative Method
    public static void reverseStack(Stack<Integer> st){
        Stack<Integer> gt = new Stack<>();
        while(!st.isEmpty()){
            gt.push(st.pop());
        }
        Stack<Integer> rt = new Stack<>();
        while(!gt.isEmpty()){
            rt.push(gt.pop());
        }

        while(!rt.isEmpty()){
            st.push(rt.pop());
        }
        System.out.println(st);
    }

    // Recursive Method
    public static void reverseStackII(Stack<Integer> st){
        //baseCase
        if(st.isEmpty()){
            return;
        }

        int top = st.pop();
        reverseStackII(st);
        insertAtBottom(st, top);
    }

    public static void insertAtBottom(Stack<Integer> st, int data){
        //baseCase
        if(st.isEmpty()){
            st.push(data);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, data);
        st.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        // reverseStack(st); 
        
        reverseStackII(st);
        System.out.println(st);
        
    }
}
