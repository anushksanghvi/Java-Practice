import java.util.Scanner;

public class SearchingValues_2DArray {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key is found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }


    public static void printMatrix(int matrix[][]) {          //printing the matrix
        int rows = matrix.length, columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int rows = matrix.length, columns = matrix[0].length;

        System.out.println("Enter the values: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        printMatrix(matrix);
        search(matrix, key);
        
    }
}
