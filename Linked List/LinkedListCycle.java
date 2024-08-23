public class LinkedListCycle {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }


    //Leetcode 141
    public static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }


// *****************************************************************************    


    // Leetcode 142
    public static Node detectCycleStartNode(Node head) {
        //Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;       // +1
            fast = fast.next.next;   // +2

            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if (cycle == false){
            return null;
        }

        // Finding the meeting point again
        slow = head;
        while(slow != fast){       //When they meet again, it's the start of the cycle
            slow = slow.next;    // +1
            fast = fast.next;   // +1
        }

        return slow;
    }


// *****************************************************************************


    public static Node removeCycle(Node head){
        //Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;   // To track whether cycle exist or not

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return null;
        }

        // Finding the meeting point
        slow = head;
        Node prev = null;
        
        while(slow != fast){
            prev = fast;          // To store last node
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle  and   last.next == null
        prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        

        
        System.out.println(isCycle(head));

        Node res = detectCycleStartNode(head);
        System.out.println(res.val);

        removeCycle(head);
        System.out.println(isCycle(head));

    }
}
