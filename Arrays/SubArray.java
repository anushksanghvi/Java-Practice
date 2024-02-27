public class SubArray {

    public static void printSubArray(int arr[]) {
        int total_subArray = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                
                total_subArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray= " + total_subArray);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        printSubArray(arr);
    }
}
