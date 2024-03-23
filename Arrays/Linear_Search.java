import java.util.Scanner;

public class Linear_Search {

    public static int linearSearch(int numbers[], int key){

        for (int i=0; i<=numbers.length-1; i++){
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the key that you wants to search = ");
        int key = sc.nextInt();

        int index = linearSearch(numbers, key);

        if (index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Key is at index " + index);
        }

    }
    
}
