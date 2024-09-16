public class LLImplementation {

    public static class Node{          // user defined data type
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class Stack{     // user defined data structures
        Node head = null;
        int size = 0;

        public boolean isEmpty(){
            return (head == null);
        }

        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int poppedData = head.val;
            head = head.next;
            size--;
            return poppedData;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            return head.val;
        }

        public int size(){
            return size;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(6);
        s.push(7);
        s.push(9);

        System.out.println(s.size());

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
