import java.util.Stack;

public class MoveContentInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack<Integer> gt = new Stack<>();
        while(!st.isEmpty()){
            gt.push(st.pop());
        }
        System.out.println(gt);

        Stack<Integer> rt = new Stack<>();
        while(!gt.isEmpty()){
            rt.push(gt.pop());
        }
        System.out.println(rt);       
    }
}
