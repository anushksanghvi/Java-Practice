public class GridWays {

    public static int gridWays(int i, int j, int n, int m){
        //BaseCase
        if((i==n-1) || (j==m-1)){
            return 1;
        }
        else if ((i==n) || (j==m)) {
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);   //down ways
        int w2 = gridWays(i, j+1, n, m);   //right ways
        return w1 + w2;
    }

    public static void main(String[] args) {
        System.out.println("Total ways = " + gridWays(0, 0, 3, 3));
        
    }
}
