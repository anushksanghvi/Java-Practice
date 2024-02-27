public class InsertionSort {
    public static void insertionSort(int arr[]){

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];          // temp---> current element
            int prev = i-1;             // prev---> previous element                           
            
            //finding out the correct pos to insert
            while(prev>=0 && temp < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1] = temp;
        }
    }

    public static void printArray(int arr[]){    //Printing the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,10,1,6};
        insertionSort(arr);
        printArray(arr);

        
    }
}
