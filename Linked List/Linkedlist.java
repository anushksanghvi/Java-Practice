public class Linkedlist {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size = 0;


    // Printing the linked List
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

/************************************** INSERTION **************************************/

    // Add Elements at FIRST            TC = O(1)
    public void addFirst(int data){
        // Step-1: Create a newNode
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step-2: newNode next = head
        newNode.next = head;   //link
        // Step-3: head = newNode
        head = newNode;
    }



    // Add Elements at LAST             TC = O(1)
    public void addLast(int data){
        // Step-1: Create a newNode
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step-2: tail's next = newNode
        tail.next = newNode;
        // Step-3: tail = newNode
        tail = newNode;
    }


    
    // Add Elements at the MIDDLE (At any specific index)       TC = O(n)
    public void addMiddle(int idx, int data){
        
        if(idx == 0){     // Special case: Insert at the beginning
            addFirst(data);
            return;
        }
        else if(idx == size){     // Special case: Insert at the end
            addLast(data);
            return;
        }        
        else if(idx < 0 || idx > size){           // Check for invalid index
            System.out.println("invalid index");
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1 ; temp is at -> prev node
        newNode.next = temp.next;
        temp.next = newNode;
    }


// To get size / length of linkedList
    // public int size(){                // NOT TO BE USE --> TC = O(n)
    //     Node temp = head;
    //     int count = 0;
    //     while(temp != null){
    //         temp = temp.next;
    //         count++;
    //     }
    //     return count;
    // }

/**************************************** DELETION *****************************************/

    // REMOVE element from FIRST
    public int removeFirst(){

        if(size==0){        //If LL is Empty
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){   
            int val = head.data;    //value that is to be remove
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;     //value that is to be remove
        head = head.next;
        size--;
        return val;
    }

    // REMOVE Element from LAST
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        //we are at prev index
        int val = tail.data;    
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

// ********************************* SEARCHING ***************************************
    // Iterative Search
    public int iterativeSearch(int key){        // TC = O(n)
        Node temp = head;
        int i = 0;
        
        while(temp != null){
            if(temp.data == key){       // Key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;          // Key not found
    }


    // Recursive Search
    public int recursiveSearch(int key){
        return helper(head, key);
    }

    public int helper(Node head, int key){
        //baseCase
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;           // index of head is 0
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    
    // Get Element of any Index
    public int getElement(int idx){
        if(idx<0 || idx>size){
            return -1;
        }
        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        return temp.data;
    }


    // ********************************* Reverse the Linkedlist **************************************
    // ITERATIVE APPROACH -----------> TC = O(1)
    public Node reverse(){
        Node curr = head;
        Node prev = null; 
        Node front = null;
        
        while(curr != null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        head = prev;
        return head;
    }

       
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(4);
        // ll.print();
        ll.addLast(5);
        // ll.print();

        ll.addMiddle(2, 3);
        ll.print();

        // System.out.println(ll.tail.data);
        // System.out.println(ll.head.data);

        // System.out.println(ll.size());
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.removeLast());

        // System.out.println(ll.iterativeSearch(4));
        // System.out.println(ll.iterativeSearch(10));
        
        // System.out.println(ll.recursiveSearch(4));
        // System.out.println(ll.recursiveSearch(10));

        // System.out.println(ll.getElement(3));

        ll.reverse();
        ll.print();
        



    }
}
