public class FunctionOverloading {

// //OVERLOADING USING PARAMETERS

//     public static int sum (int a, int b){
//         return(a+b);
//     }

//     public static int sum (int a, int b, int c){
//         return(a+b+c);
//     }

//     public static void main(String[] args) {
//     System.out.println(sum(4,8));
//     System.out.println(sum(41, 86, 53));
//     }
// }

//------------------------------------------------------------------------------------

// //OVERLOADING USING DATA TYPES

    //func to calc int sum
    public static int sum (int a, int b){
        return(a+b);
    }

    //func to calc float sum
    public static float sum(float a, float b){
        return(a+b);
    }


    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(8.5f, 5.2f));
    } 
}
