public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        // int totalSwaps = 0;

        for (int turn=0; turn<arr.length-1; turn++) {
            boolean swapped =false;
            // int swapsInTurn = 0;

            for (int j=0; j<arr.length-1-turn; j++) {

                if (arr[j] > arr[j+1]) {
                    // SWAP
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                    // swapsInTurn++;
                    // totalSwaps++;
                }
            }

            if(swapped==false){
                break;
            }
            // System.out.println("Swaps in turn " + (turn) + ": " + swapsInTurn);
        }

        // System.out.println("Total number of swaps: " + totalSwaps);
    }

    public static void printArray(int arr[]) {      //For printing the Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 45, 23, 51, 19, 8};
        // int arr[] = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        printArray(arr);
    }
}
