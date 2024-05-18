public class FirstOccurence {

    //I Method
    public static int firstOccurence(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    //II Method ----> USING RECURSION
    public static int firstOccurence2(int arr[], int key, int i){
        //BaseCase
        if (i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return firstOccurence2(arr, key, i+1);
    }    

    public static void main(String[] args) {
        int arr[]= {1,9,3,4,5,1,6,8,5,9,7};
        System.out.println(firstOccurence(arr, 5));
        System.out.println(firstOccurence2(arr, 5,0));
    }
}




