import java.util.Stack;
public class QueueUsingTwoStacks {

    public static class QueueS{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void add(int val){       // TC = O(N)
            while(!s1 .isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(val);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){        // TC = O(1)
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.pop();
        }

        public int peek(){      // TC = O(1)
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        QueueS q = new QueueS();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
