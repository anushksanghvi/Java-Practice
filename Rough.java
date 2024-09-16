import java.util.ArrayList;
import java.util.Arrays;

public class Rough {

    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        int pos = 2;
        int ele = 25;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(pos, ele);
        arr = list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
