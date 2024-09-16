import java.util.Stack;
public class InsertAtBottom {

    // Ist Method   
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int data){
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){           // Transfer all elements from st to temp
            temp.push(st.pop());
        }

        // Now original stack st is empty. Push the new data at the bottom of the st
        st.push(data);

        while(!temp.isEmpty()){     // Push the elements back from temp to st
            st.push(temp.pop());
        }
        return st;
    }

    // IInd Method ->  Using Recursion
    public static void insertAtBottomII(Stack<Integer> st, int data){
        //baseCase
        if(st.isEmpty()){
            st.push(data);
            return;
        }

        int top = st.pop();
        insertAtBottomII(st, data);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        // System.out.println(insertAtBottom(st, 11));   

        insertAtBottomII(st, 11);
        System.out.println(st);
    }
}
