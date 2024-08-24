public class LLIntersection {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    // Ist Method- Brute Force   --->  TC = O(m * n)
    public static Node intersectionNodeI(Node headA, Node headB){
        while(headB != null){
            Node temp = headA;
            while(temp != null){
                if(temp == headB){
                    return headB;
                }
                temp = temp.next;
            }
            headB = headB.next;
        }
        return null;
    }

    // II Method- Difference in Length of List  --->  TC = O(m + n)
    public static Node intersectionNodeII(Node headA, Node headB){
        Node temp1 = headA;
        Node temp2 = headB;

        int length1 = size(headA);
        int length2 = size(headB);

        if(length1 > length2){
            int steps = length1 - length2;
            for(int i=0; i<steps; i++){
                temp1 = temp1.next;
            }
        }
        else{
            int steps = length2 - length1;
            for(int i=0; i<steps; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
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
        Node List1 = new Node(4);
        List1.next = new Node(1);
        List1.next.next = new Node(8);
        List1.next.next.next = new Node(4);
        List1.next.next.next.next = new Node(5);

        Node List2 = new Node(5);
        List2.next = new Node(6);
        List2.next.next = List1.next.next;

        display(List1);
        display(List2);

        // Node inteNode = intersectionNodeI(List1, List2);
        Node inteNode = intersectionNodeII(List1, List2);
        System.out.println(inteNode.val);

    }
}
