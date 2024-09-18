public class LLImplementation {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class QueueB{
        Node head = null;
        Node tail = null;
        int size = 0;

        public boolean isEmpty(){
            return (head == null && tail == null);
        }

        public void add(int val){
            Node newNode = new Node(val);

            if(head == null){           // Empty LL
                head = tail = newNode;
                size = 1;
                return;
            }

            tail.next = newNode;
            tail = newNode; 
            size++;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }

            int poppedElement = head.val;
            if(head == tail){        // single element condition
                head = tail = null;
                size = 0;
            }
            else{
                head = head.next;
                size--;
            }
            return poppedElement;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.val;
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        QueueB q = new QueueB();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.isEmpty());
        q.display();
        System.out.println(q.size);
        
        q.remove();
        q.remove();

        q.display();
        System.out.println(q.size);

        // while(!q.isEmpty()){
        //     System.out.print(q.peek()+ " ");
        //     q.remove();
        // }

        q.remove();
        System.out.println(q.size);
        q.remove();
        System.out.println(q.size);
        q.remove();
        System.out.println(q.isEmpty());
        System.out.println(q.size);
        q.remove();
        System.out.println(q.size);
        System.out.println(q.isEmpty());

    }
}
