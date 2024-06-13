public class MergeTwoSortedArray {
    public static int[] mergeSortedArray(int arr1[], int arr2[]){
        int res[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                res[k] = arr1[i];
                i++;
                k++;
            }
            else{
                res[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length){
            res[k] = arr1[i];
            i++;
            k++;

         // res[k++] = arr1[i++];
        }

        while(j<arr2.length){
            res[k] = arr2[j];
            j++;
            k++;
            
         // res[k++] = arr2[j++];
        }
        return res;

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]  + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = {2,5,7,9,11,21};
        int arr2[] = {4,6,10,12,16,18,22,25,35};
        int res[] = mergeSortedArray(arr1, arr2);
        printArr(res);
    }
}
