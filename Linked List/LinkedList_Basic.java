public class LinkedList_Basic{

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


    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Methods
    // add()
    // remove()
    // print()
    // search()


    public static void main(String[] args) {


        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(7);
        Node e = new Node(2);

        // System.out.println(a);
        // System.out.println(a.data);
        // System.out.println(a.next);
        // System.out.println(b);

        // 5 3 9 7 2
        // connecting the linked List
        a.next = b;     // 5 -> 3 9 7 2 
        b.next = c;     // 5 -> 3 -> 9 7 2
        c.next = d;     // 5 -> 3 -> 9 -> 7 2
        d.next = e;     // 5 -> 3 -> 9 -> 7 -> 2 -> null   

        // System.out.println(a.next.data);   // b = 3
        // System.out.println(b.data);        // 3

        print(a);
        print(c);
    }
}