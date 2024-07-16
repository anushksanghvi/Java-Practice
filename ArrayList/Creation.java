import java.util.ArrayList;

public class Creation{
    public static void main(String[] args) {
        // OOPs => ClassName objectName = new ClassName();
        
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        ArrayList <Boolean> list3 = new ArrayList<>();

        //Adding element to ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        // to find size/length of ArrayList
        System.out.println(list.size());

        System.out.println(list);

        //Print ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        
        // Reverse the ArrayList            //===> TC = O(n)
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}