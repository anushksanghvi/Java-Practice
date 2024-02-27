public class Largest_SmallestNumArray {

// I Method:

    public static void getlargestsmallestNum(int arr[]){
        int largest = Integer.MIN_VALUE;      //-infinity
        int smallest = Integer.MAX_VALUE;    // +infinity
        
        for (int i = 0; i<arr.length; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }

            if (smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Largest Number is: " + largest);
        System.out.println("Smallest Number is: " + smallest);
    }

    public static void main(String[] args) {
        int arr[] = {29, 25, 63, 96, 52, 85, 92, 75, 39, 49};
        getlargestsmallestNum(arr);
    }

/*  

// II Method:  

       public static int[] getlargestsmallestNum(int arr[]) {
        int result[] = new int[2];
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }

            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        result[0] = largest;
        result[1] = smallest;
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {29, 25, 63, 96, 52, 85, 92, 75, 39, 49};
        int result[] = getlargestsmallestNum(arr);

        System.out.println("largest num: " + result[0]);
        System.out.println("smallest num: " + result[1]);
    }

*/

 
}
