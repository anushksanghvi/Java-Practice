public class MergeSort{
    
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }

        //kaam

        int mid = si + (ei-si)/2;
        // Recursively sort the left and right halves
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        //eg., left(0,2)=3 elements and right(2,5)=4 elements --> 5-0+1=6 total elements
        int temp[] = new int [ei-si + 1];   //Creating temporary array

        int i = si;  //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0;   //iterator for temp arr

        // Merge the two subarrays into temp
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        // Copy any remaining elements from the left subarray
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        // Copy any remaining elements from the right subarray
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //Copy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }    
    }


    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}