// IInd Method of Merge Sort

public class MergeSort2 {

    public static int[] mergeSort(int arr[], int si, int ei){
        //baseCase
        if (si == ei){
            int baseArr[] = new int [1];
            baseArr[0] = arr[si];
            return baseArr;
        }


        int mid = si + ((ei-si)/2);
        int arr1[] = mergeSort(arr, si, mid);
        int arr2[] = mergeSort(arr, mid+1, ei);
        int finalRes[] = mergeSortedArray(arr1, arr2);
        return finalRes;
    }


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

        // Copy remaining elements of arr1, if any
        while(i<arr1.length){
            res[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2, if any
        while(j<arr2.length){
            res[k] = arr2[j];
            j++;
            k++;
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
        int arr[] = {13,4,16,10,22,16,8,12,25,15};
        int result[] = mergeSort(arr, 0, arr.length-1);
        printArr(result);
    }
}
