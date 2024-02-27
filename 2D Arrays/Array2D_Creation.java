import java.util.*;
public class Array2D_Creation{
    public static void main(String[] args) {

        int matrix [][] = new int [3][4];
        System.out.println("Total no. of Rows= " + matrix.length);   //Total no. of Rows (n)
        System.out.println("Total no. of Columns= " + matrix[0].length);  //Total no. of Columns(m)

        int n= matrix.length;  //rows
        int m= matrix[0].length; //columns


        matrix [0][0] = 1;
        matrix [0][1] = 2;
        matrix [0][2] = 3;
        matrix [0][3] = 4;
        matrix [1][0] = 5;
        matrix [1][1] = 6;
        matrix [1][2] = 7;
        matrix [1][3] = 8;
        matrix [2][0] = 9;
        matrix [2][1] = 10;
        matrix [2][2] = 11;
        matrix [2][3] = 12;


         //Printing the 2D Array OR Matrix
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                     System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            


        int mat[][] = {{2,3,4},
                       {4,5,6},
                       {7,8,9}};
        
        //Printing the  Mat
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


    }

}