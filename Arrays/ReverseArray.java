public class ReverseArray {

    public static int[] reverseNum1(int arr[]) {        // TC = O(n)   SC = O(n) ---> using extra space
        int reverseArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length-1-i];
        }
        return reverseArr;
    }

    public static int[] reverseNum2(int arr[]){      // TC = O(n)   SC = O(1) ---> no extra space
        int first=0, last=arr.length-1;
        while(first < last){
            //SWAP
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
    
            first++;
            last--;
        }
        return arr;
    }

    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,16};

        int ans[] = reverseNum1(arr);
        printArr(ans);


        int ans1[] = reverseNum2(arr);
        printArr(ans1);
        
    }
}
