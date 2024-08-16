public class MaxSubArraySum_KadanesAlgo_I {

    public static void printSubArraySumKadanes(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];

            maxSum = Math.max(currSum,maxSum); 

            if(currSum<0){
                currSum = 0;
        }
    }

        System.out.println("Max Sum =" + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        printSubArraySumKadanes(arr);
    }
}
