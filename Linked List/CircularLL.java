public class CircularLL {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    // Printing in Circular LL
    public void display(Node head){
        Node temp  = head;
        do{
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        while(temp != head);
        System.out.println();
    }


    // Searching in Circular LL
    public int searching(Node head, int key){
        if(head == null){
            System.out.println("LL is empty");
            return -1;
        }
        Node temp = head;
        int i = 0;
        do{
            if(temp.val == key){        // Key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        while(temp != head);

        return -1;      // Key NOT found
    }
        
        
    public static void main(String[] args) {
        CircularLL Cll = new CircularLL();

        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(9);
        head.next.next.next = new Node(12);
        head.next.next.next.next = head;    // Making it circular

        Cll.display(head);
        System.out.println(Cll.searching(head, 9));



        
    }
}
