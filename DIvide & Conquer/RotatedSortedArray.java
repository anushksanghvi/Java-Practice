public class RotatedSortedArray {
    public static int search(int arr[], int tar, int si, int ei){
        //BaseCase
        if(si>ei){
            return -1;
        }

        // kaam

        int mid = (si + (ei-si)/2);      // (si+ei)/2

// 1-->// case FOUND
        if (arr[mid] == tar){
            return mid;
        }

// 2-->// mid on L1
        if(arr[si] <= arr[mid]){

            // case a: L1 left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);            
            }
            else{
                // case b: mid Right
                return search(arr, tar, mid+1, ei);
            }
        }
        
// 3-->// mid on L2
        else{

            // case c: L2 Right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                // case d: mid Left
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tarIdx = search(arr, 0, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
