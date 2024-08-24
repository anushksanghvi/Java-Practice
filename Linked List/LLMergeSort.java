public class LLMergeSort {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static Node mergeSort(Node head){
        // baseCase
        if(head == null || head.next == null){
            return head;
        }
        //Finding the mid
        Node mid = getMiddle(head);

        Node rightHead = mid.next;
        mid.next = null;
        
        // Calling mergeSort() for left half and right half
        Node leftHalf = mergeSort(head);
        Node rightHalf = mergeSort(rightHead);

        // Merging left half and right half
        Node result = merge(leftHalf, rightHalf);
        return result;
    }

    public static Node getMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;   // mid node
    }

    public static Node merge(Node head1, Node head2){
        Node dummyNode = new Node(-1);   // Dummy Node to store value of merged LL
        Node temp = dummyNode;

        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        // If any list still has remaining elements, append them to the merged list
        if(head1 != null){
            temp.next = head1; 
        }
        else{
            temp.next = head2;
        }

        return dummyNode.next;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(12);
        head.next.next = new Node(9);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(3);

        System.out.print("Linked List is: ");
        display(head);

        Node SortedLL = mergeSort(head);
        System.out.print("Sorted Linked List is: ");
        display(SortedLL);
    }
}
