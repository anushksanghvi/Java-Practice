public class MazePath {


    //Ist Approach ---> we are moving 0,0---> m,n
    public static int countPath(int i, int j, int m, int n){
        //BaseCase
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 || j==n-1){
            return 1;
        }

        int rightPath = countPath(i, j+1, m, n);
        int downPath = countPath(i+1, j, m, n);

        int totalPaths = rightPath + downPath;
        return totalPaths;
    }

    // IInd Approach ---> we are moving m,n---> 0,0
    public static int countPathII(int m, int n){
        //baseCase
        if(m==1 || n==1){
            return 1;
        }

        int hor = countPathII(m, n-1);
        int ver = countPathII(m-1, n);
        int totalPaths = hor + ver;
        return totalPaths;
    }
    
    public static void main(String[] args) {
        System.out.println(countPath(0, 0, 3, 3));
        System.out.println(countPathII(4,4));
    }
}
