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

        // remove       TC = O(n)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            size--;
            return front;
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
        QueueA q = new QueueA(5);
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();

        System.out.println(q.size);

        q.remove();
        q.display();

        q.add(11);
        q.display();

        q.add(12);
        q.display();
        
        q.add(13);
        q.display();
        
        System.out.println(q.size);


        // while(!q.isEmpty()){
        //     System.out.print(q.peek()+ " ");
        //     q.remove();
        // }
    }
}
