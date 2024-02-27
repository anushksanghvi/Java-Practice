import java.util.*;
public class Array2D_UserInput {
    public static void main(String[] args) {

        int matrix [][] = new int [3][3];
        int n= matrix.length;  //rows
        int m= matrix[0].length; //columns

        System.out.println("Enter the values: ");
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix [i][j] = sc.nextInt();
            }
        }

         //Printing the 2D Array OR Matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
  
}
