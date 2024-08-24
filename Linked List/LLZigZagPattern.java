public class LLZigZagPattern {

    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    
    public static void zigZagList(ListNode head) {
        //Finding the middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        
        // Reverse the 2nd Half
        ListNode curr = mid.next;
        mid.next = null;
        ListNode prev = null;
        ListNode front = null;

        while(curr != null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        ListNode right = prev;
        ListNode left = head;
        ListNode nextL, nextR;

        // Alternate merging--> Zig Zag merging
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            //updation
            left = nextL;
            right = nextR;
        }
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        display(head);

        zigZagList(head);
        display(head);
        
    }
}
