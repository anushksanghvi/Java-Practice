public class TilingProblem{

    public static int tilingproblem(int n){
        //BaseCase
        if(n == 0 || n == 1){
            return 1;
        }

        //kaam(make choice)
        //Vertical
        int f1 = tilingproblem(n-1);
        //Horizontal 
        int f2 = tilingproblem(n-2);
        
        int totalways = f1 + f2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
        
    }
}