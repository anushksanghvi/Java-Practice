public class ArrayImplementation {

    public static class QueueA{
        int arr[];
        int size;
        int front;
        int rear;

        QueueA(int n){            //Constructor
            arr = new int[n];
            size = 0;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            else{
                return false;
            }
        }

        // add        TC = O(1)
        public void add(int val){
            if(rear == arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if(rear == -1){
                front = rear = 0;
                arr[0] = val;
                size = 1;
            }
            else{
                rear = rear + 1;
                arr[rear] = val;
                size++;
            }
        }

        // remove       TC = O(1)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int poppedElement = arr[front];
            if(size == 1){
                front = rear = -1;
            }
            front = front + 1;
            size--;
            return poppedElement;
        }

        // peek         TC = O(1)
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }

            return arr[front];
        }

        public void display(){
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        QueueA q = new QueueA(10);
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
