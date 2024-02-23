import java.util.*;
public class TrappingRainWater {

    public static int trappedRainWater(int height[], int width){
        int n = height.length;       //let height.length ---> n

        //calculate leftMax boundary- array
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate rightMax boundary- array
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //loop
            //water level = min(leftMax bound, rightMax bound)
            //TrappedWater = water level - height[i]

        int TrappedWater = 0;
        for (int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            TrappedWater += (waterlevel - height[i])*width;
        }
        return TrappedWater;

    }
    
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped rain water = " + trappedRainWater(height, 1));
        
    }
}
