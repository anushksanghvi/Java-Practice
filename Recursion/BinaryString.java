public class BinaryString {
    
    //Ist Method
    public static void printBinaryStrings(int n, String str, int lastPlace){
        //BaseCase
        if(n==0){
            System.out.println(str);
            return;
        }

        //Kaam
        if(lastPlace==0){
            printBinaryStrings(n-1, str+"0", 0);
            printBinaryStrings(n-1, str+"1", 1);
        }
        else{
            printBinaryStrings(n-1,str+"0", 0);
        }
    }

    //IInd Method
    public static void printBinaryStringSmart(int n, String str, int lastPlace){
        //Base Case
        if(n==0){
            System.out.println(str);
            return;
        }

        //Kaam
        printBinaryStringSmart(n-1, str+"0", 0);
        if(lastPlace==0){
            printBinaryStringSmart(n-1, str+"1", 1);
        }
    } 
    
    public static void main(String[] args) {
        printBinaryStrings(3, "", 0);  
        System.out.println();      
        printBinaryStringSmart(3, "", 0);        
    }
}
