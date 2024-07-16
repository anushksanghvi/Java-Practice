import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add element
        list.add(1);              // TC=> O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(2,10);    // TC=> O(n)
        System.out.println(list);


        //get element
        int element = list.get(3);      // TC=> O(1)
        System.out.println(element);


        // Remove element
        list.remove(1);                // TC=> O(n)
        System.out.println(list);


        // Set element at index
        list.set(3, 12);       // TC=> O(n)  
        System.out.println(list);


        //Contain element
        System.out.println(list.contains(10));    // TC=> O(n)
        System.out.println(list.contains(15));
        
    }
}
