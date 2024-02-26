import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort { 

    public static void main(String[] args) {

        int arr[] = {5,4,10,6,2,14,11};
        Arrays.sort(arr);
        // Arrays.sort(arr, 0,4);
        
        for (int i=0; i<arr.length; i++){        //Printing Array
            System.out.print(arr[i] + " ");
        }
        System.out.println();


/*---------------------------------------------------------------------------*/


        Integer arr1[] = {5,4,10,6,2,14,11};     //reverseOrder function is applicable to objects. So, we use "Interger" instead of "int"
        Arrays.sort(arr1, Collections.reverseOrder());
        // Arrays.sort(arr1, 0, 4, Collections.reverseOrder());

        for (int i=0; i<arr1.length; i++){       //Printing Array
            System.out.print(arr1[i] + " ");
        }
        
    }
}
