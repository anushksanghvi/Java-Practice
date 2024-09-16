public class PalindromeDoublyLL {

    public static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static boolean isPalindrome(Node head){
        if(head == null){
            return true;
        }

        //Step1: find mid
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Step 2: Find the end of the list (tail)
        Node temp = slow;
        while(temp.next != null){
            temp = temp.next;
        }

        Node right = temp;
        Node left = head;

        // Step 3: Compare the left and right halves
        while(left != mid.next){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = null;

        display(a);
        System.out.println(isPalindrome(a));

    }
}
