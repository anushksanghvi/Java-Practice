import java.util.ArrayList;

public class MonotoneArrayList {
    public static boolean isMonotone(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) >= list.get(i+1)){
                    inc = false;
                }

            else if(list.get(i) <= list.get(i+1)){
                dec = false;
            }
        } 
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);        
        list.add(3);        
        list.add(2);        
        
        System.out.println(isMonotone(list));
    }
}
