public class ArrayImplementation {
    
    public static class Stack{
        int MAX = 5;
        public int arr[] = new int[MAX];
        int top = -1;

        public void push(int data){
            if(top == arr.length-1){
                System.out.println("Stack is full.");  //Overflow
                return;
            }
            top++;
            arr[top] = data;
        }

        public int pop(){
            if(top == -1){
                System.out.println("Stack is empty");    // Underflow
                return -1;
            }
            int poppedElement = arr[top];
            top--;
            return poppedElement;
        }

        public int peek(){
            if(top == -1){
                System.out.println("Stack is empty");
                return -1;
            }

            return arr[top];
        }

        public void display(){
            for(int i=0; i<top+1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public boolean isEmpty(){
            if(top==-1){
                return true;
            }
            return false;
        }

        public int size(){
            return top+1;
        }

        

        public boolean isFull(){
            if(top==arr.length-1){
                return true;
            }
            
            return false;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        System.out.println(s.isEmpty());

        s.push(3);
        s.push(5);
        s.push(7);
        s.push(9);

        s.display();    
        System.out.println(s.size());

        System.out.println(s.pop());
        s.display();
        System.out.println(s.size());

        System.out.println(s.peek());

        System.out.println(s.isEmpty());

        s.push(12);
        s.display();
        s.push(15);
        s.display();
        s.push(18);   // Stack Overflow --> 18 will not get added
        s.display();
        System.out.println(s.isFull());


        s.pop();
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
    }
}
