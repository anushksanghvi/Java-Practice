import java.util.Stack;
public class Stacks_Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2); // add element at the top of stack
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);

        st.pop();       // remove element from the top of stack
        System.out.println(st);

        System.out.println(st.peek());  // return the top element of the stack
        System.out.println(st.size());  // return the size of the stack

        System.out.println(st.isEmpty());



        // To get 1st element
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);           // this will permanently changes the stack

    }
}


