import java.util.Scanner;

public class BinaryToDecimal {
    
    public static void binToDec(int binNum){
        int MyNum = binNum;
        int pow = 0;
        int decNum = 0;
        
        while (binNum > 0){
            int lastDight = binNum % 10; 
            decNum = (decNum + lastDight * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.print("Decimal of " + MyNum + " = " + decNum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter binary number: ");
        int binNum = sc.nextInt();

        binToDec(binNum);

    }
}
