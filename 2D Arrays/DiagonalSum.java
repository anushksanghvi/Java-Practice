public class DiagonalSum {
    
    // // BRUTE FORCE METHOD
    // public static int diagonalSum1(int matrix[][]){
    //     int sum = 0;

    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             //PD
    //             if(i==j){
    //                 sum += matrix[i][j];
    //             }

    //             //SD
    //             else if(i+j==matrix.length-1){
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }


    //OPTIMISED CODE:
    public static int diagonalSum2(int matrix[][]){
        int sum =0;
        
        for (int i=0; i<matrix.length; i++){
            //PD
            sum += matrix[i][i];

            //SD
            if(i != matrix.length-1-i)         //removing the overlapping element
            sum += matrix[i][matrix.length-1-i];
        }
        return sum; 
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        int matrix1[][] = {{9,1,2},
                          {3,4,5},
                          {6,7,8}};

                          

        // System.out.println("Sum is = " + diagonalSum1(matrix));                 
        // System.out.println("Sum is = " + diagonalSum1(matrix1)); 

        System.out.println("Sum is = " + diagonalSum2(matrix));                 
        System.out.println("Sum is = " + diagonalSum2(matrix1));                 
    }
}
