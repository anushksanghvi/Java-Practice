public class Remove_Nth_From_End {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    //I Method- ITERATIVE APPROACH
    public static Node removeNthNodeI(Node head, int n){
        //Calculating size
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        // Special case: removing the head node (nth from end is the first node)
        if(n==size){
            head = head.next;
            return head;
        }

        Node prev = head;

        for(int i=1; i<size-n; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }

    //II Method- TWO POINTER APPROACH --> (In One Traversal)
    public static Node removeNthNodeII(Node head, int n){
        //Calculating size
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        Node slow = head;
        Node fast = head;

        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        // After iteration of fast if (fast == null)---> means Special Case i.e. removing head
        if(fast == null){
            head = head.next;
            return head;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    } 

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        // Node x= removeNthNodeI(a, 3);
        Node x= removeNthNodeII(a, 2);
        display(x);

    }
}
