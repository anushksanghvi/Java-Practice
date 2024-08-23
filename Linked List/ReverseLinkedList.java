public class ReverseLinkedList {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    // ITERATIVE APPROACH -----------> TC = O(1)
    public Node itr_reverse(Node head){
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

    // RECURSIVE APPROACH -----------> TC = O(n)    
    public Node rec_reverse(Node head){
        if(head.next == null){
            return head;
        }
        Node newNode = rec_reverse(head.next);
        head.next.next = head;      // Interchanging the connections
        head.next = null;
        return newNode;
    }


    public void display(Node head){
        if(head ==null){
            System.out.println("null");
            return;
        }
        System.out.print(head.val + " ");
        display(head.next);
    }

    public void revdisplay(Node head){  // only print LL in reverse order and do not interchange the link   
        if(head ==null){
            System.out.println("null");
            return;
        }
        revdisplay(head.next);
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ReverseLinkedList ll = new ReverseLinkedList();
        ll.display(a);
        // ll.revdisplay(a);

        // Node x = ll.rec_reverse(a);
        Node x = ll.itr_reverse(a);
        ll.display(x);

    }
}
