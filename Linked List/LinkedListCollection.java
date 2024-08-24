import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(15);
        ll.addFirst(25);

        System.out.println(ll);   //25->15->1->2

        //remove
        ll.removeLast();
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

        System.out.println(ll.getLast());
    }
    
}
