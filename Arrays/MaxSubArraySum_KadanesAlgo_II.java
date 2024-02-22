/*
PROGRAM IF ALL THE ELEMENT OF ARRAY IS NEGATIVE:    ------>UPDATED KADANE'S ALGORITHM

BY USING KADANE'S ALGORITHM, IT WILL RETURN MaxSum = 0; But is should be smallest -ve number.
So, we have to apply special condition for it.

*/

public class MaxSubArraySum_KadanesAlgo_II {

    public static void printSubArraySumKadanes(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Variable to track if all elements are negative
        boolean allNegative = true;
        int maxNegative = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];

            if (currSum < 0) {
                currSum = 0;
            }

            // Update maxSum using Math.max
            maxSum = Math.max(currSum, maxSum);


            // Check for all negative elements
            if (arr[i] >= 0) {
                allNegative = false;
            } 
            else {
                maxNegative = Math.max(maxNegative, arr[i]);
            }
        }

        // If all elements are negative, maxSum will be the maximum negative number
        if (allNegative) {
            System.out.println("Max Sum = " + maxNegative);
        } 
        else {
            System.out.println("Max Sum = " + maxSum);
        }
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, -4, -7, -1, -5, -6};

        printSubArraySumKadanes(arr);
    }
}
