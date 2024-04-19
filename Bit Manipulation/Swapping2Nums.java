public class Swapping2Nums {

    //Ist Approach ---> using 3rd variable (temp)
    public static void Swap1(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("x= " + x);
        System.out.println("y= "+ y);
    }


    //IInd Approach ---->  Without using 3rd variable (temp) ---> Using XOR operator
    public static void Swap2(int x, int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("x= " + x);
        System.out.println("y= "+ y);
    }

    public static void main(String[] args) {

        int x=5, y=8;

        Swap1(x, y);
        Swap2(x, y);
    }
}
