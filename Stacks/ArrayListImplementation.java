import java.util.ArrayList;
public class ArrayListImplementation {

    public static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            if(list.size() == 0){
                return true;
            }
            return false;
        }

        public void push(int data){
            list.add(data); 
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = list.get(list.size()-1);              
            list.remove(list.size()-1);              // list.size()-1 ----> is index of top element
            return top;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = list.get(list.size()-1); 
            return top; 
        }

        public void display(){
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(4);
        s.push(7);
        s.push(11);
        s.push(13);

        s.display();
        System.out.println(s.list.size());
        // System.out.println(s.pop());
        // s.display();
        // System.out.println(s.peek());
        // s.pop();
        // s.display();
        // s.pop();
        // s.display();
        // s.pop();
        // s.display();
        // s.pop();
        // s.display();
        // s.pop();
        // s.display();
        // System.out.println(s.isEmpty());

        while(s.isEmpty() != true){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
