import java.util.ArrayList;

public class ContainerWithMostWater {

    //Brute Force- O(n^2)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0; i<height.size(); i++){           // selecting line L1
            for(int j=i+1; j<height.size(); j++){     // selecting line L2
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // 2 Pointer Approach- O(n)
    public static int storeWater2(ArrayList<Integer> height){
        int maxWater = 0;
        int Lp = 0;
        int Rp = height.size()-1;

        while(Lp<Rp){
            // calculate the water area
            int ht = Math.min(height.get(Lp), height.get(Rp));
            int width = Rp-Lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //update the pointer
            if(height.get(Lp) < height.get(Rp)){
                Lp++;
            }
            else{
                Rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Maximum water = " + storeWater(height));
        
        System.out.println("Maximum water = " + storeWater2(height));
    }
}
