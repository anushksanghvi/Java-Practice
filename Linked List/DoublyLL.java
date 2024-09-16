public class DoublyLL {

    public class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Insertion at First --> Head
    public Node addFirst(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = tail = newNode;
            size = 1;
            return head;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
        return head;        
    }

    // Insertion at Last --> tail  ---> Case2--> when head is given
    public Node addLast(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = tail = newNode;
            size = 1;
            return head;
        }

        Node temp = head;
        // moving the temp to the last at tail
        while(temp.next != null){
            temp = temp.next;
        }
        // now temp is at last node i.e., tail
        temp.next = newNode;
        newNode.prev = temp;
        size++;
        return head;
    }

    // Insertion at any Index
    public Node addAnyIdx(int idx, int val){
        Node t = new Node(val);

        if(head == null){
            head = tail = t;
            size = 1;
            return head;
        }

        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }

        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;
        size++;
        return head;
    }

// ************************************************************************************

    // Deletion at First --> Head
    public int removeFirst(){
        if(head == null){
            System.out.println("Doubly LL is emply");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int value = head.val;
            head =tail = null;
            size--;
            return value;
        }
        int value = head.val;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

// **********************************************************************

    public Node reverse(){
        Node curr = head;
        Node prev = null;
        Node front = null;

        while(curr != null){
            front = curr.next;
            curr.next = prev;
            curr.prev = front;
            prev = curr;
            curr = front;
        }
        head = prev;
        return head;
    }

    public void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL Dll = new DoublyLL();
        Dll.addFirst(3);
        Dll.addFirst(2);
        Dll.addFirst(1);

        Dll.addLast(4);
        Dll.addLast(5);

        // Dll.display(head);
        // System.out.println(size);

        Dll.addAnyIdx(2, 50);
        Dll.display(head);
        System.out.println(size);

        Dll.removeFirst();
        Dll.display(head);
        // System.out.println(Dll.removeFirst());
        // System.out.println(size);

        Dll.reverse();
        Dll.display(head);
    }
}
