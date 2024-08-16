public class BinarySearch {

    public static int binary_search(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(numbers[mid]==key){             // FOUND
                return mid;
            }

            else if (numbers[mid]<key){          //  RIGHT / 2nd Half
                start = mid + 1;
            }

            else{             //  LEFT / 1st Half
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 18;

        System.out.println("Index for key is " + binary_search(numbers, key));

    }    
}
