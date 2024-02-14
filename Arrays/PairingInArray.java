public class PairingInArray {

    public static void ArrayPair(int arr[]){
        int totalpair = 0;

        for(int i=0; i<arr.length; i++){
            int current = arr[i];                 //2,4,6,8,10
            for (int j=i+1; j<arr.length; j++){
                System.out.print("(" + current + "," + arr[j] + ")");
                totalpair++;
            }   
            System.out.println();      
        }
        System.out.println("Total pairs = " + totalpair);

    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        ArrayPair(arr);
    }
}
