public class LastOccurence {
    public static int lastOccurence(int arr[],int key, int i){
        //BaseCase
        if(i==arr.length){
            return -1;
        }

        //Look forward
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }

        //Compare with self
        if (arr[i] == key){
            return i;
        }
        return isFound;
    }

    
    public static int lastOccurenceSmart(int arr[],int key, int i){
        //BaseCase
        if(i==arr.length){
            return -1;
        }

        int isFound = lastOccurenceSmart(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;

    }


    public static void main(String[] args) {
        int arr[] ={8,3,6,9,5,10,2,5,3};
        int arr1[] ={5,5,5,5,5,5};

        System.out.println(lastOccurence(arr, 5, 0));
        System.out.println(lastOccurenceSmart(arr, 5, 0));

        
        System.out.println(lastOccurence(arr1, 5, 0));
        System.out.println(lastOccurenceSmart(arr1, 5, 0));
    }
}
