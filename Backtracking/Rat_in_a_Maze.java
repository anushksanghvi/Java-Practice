public class Rat_in_a_Maze {
    public static int mazePath(int x, int y, int n, int m){
        //BaseCase
        if((x==n-1) && (y==m-1)){
            return 1;
        }
        else if((x==n) && (y==m)){
            return 0;
        }
        
        //recursion
        int upPath = mazePath(x-1, y, n, m);
        int downPath = mazePath(x+1, y, n, m);
        int rightPath = mazePath(x, y+1, n, m);  
        int leftPath = mazePath(x, y-1, n, m);

        return upPath + downPath +  rightPath + leftPath;

    }

    public static void main(String[] args) {
        System.out.println(mazePath(0, 0, 3, 3));
        
    }
    
}
