import java.util.Scanner;

public class Rough {

    public static boolean SearchingArrays(int matrix[][], int key){
        for(int i=0;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==key){
                    System.out.println("key found at index " + i + "," + j);
                    return true;
                }
            }
        }
        System.out.println("key Not found");
        return false;
    }

    public static void printmatrix(int matrix[][]){
        for(int i=0;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        int matrix[][] = new int [3][3];
        System.out.println("Enter the matrix values:");
        for(int i=0;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
            matrix [i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the key that you wants to search: ");
        int key = sc.nextInt();

        printmatrix(matrix);        
        SearchingArrays(matrix, key);




        
    }
}
