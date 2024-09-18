public class CircularQueueArrayImplementation {

    public static class CQueue{
        int arr[];
        int front;
        int rear;
        int maxSize;
        int size;

        CQueue(int n){
            arr = new int[n];
            front = -1;
            rear = -1;
            maxSize = n;
            size = 0;
        }

        public boolean isEmpty(){
            return (rear == -1);
        }

        public boolean isFull(){
            return (rear+1) % maxSize == front;
        }

        public void add(int val){       // TC = O(1)
            if(isFull()){
                System.out.println("Queue is full!");
                return;
            }
            if(rear == -1){       // adding the 1st element
                front = rear = 0;
                arr[0] = val;
                size = 1;
            }
            else{
                rear = (rear + 1) % maxSize;
                arr[rear] = val;
                size++;
            }
        }

        public int remove(){        // TC = O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int poppedElement = arr[front];
            if(size == 1){
                front = rear = -1;
            }
            front = (front + 1) % maxSize;
            size--;
            return poppedElement; 
        }

        public int peek(){      // TC = O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return;
            }
                
            else if(front <= rear){
                for(int i=front; i<=rear; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else{   //rear < front
                for(int i=front; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i=0; i<= rear; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        CQueue q = new CQueue(5);
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();

        System.out.println(q.size);

        System.out.println(q.isFull());

        q.remove();
        q.display();

        q.add(11);
        q.add(12);
        q.display();

        System.out.println(q.size);

        q.add(13);
        q.display();

        // while(!q.isEmpty()){
        //     System.out.print(q.peek() + " ");
        //     q.remove();
        // }    
    }
}
