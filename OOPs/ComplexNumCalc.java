import java.util.Scanner;

public class ComplexNumCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of Complex Number C1: ");
        int realNum1 = sc.nextInt();

        System.out.print("Enter imagimary part of Complex Number C1: ");
        int imgNum1 = sc.nextInt();

        System.out.print("Enter real part of Complex Number C2: ");
        int realNum2 = sc.nextInt();

        System.out.print("Enter imagimary part of Complex Number C2: ");
        int imgNum2 = sc.nextInt();

        ComplexNum A = new ComplexNum(realNum1, imgNum1);
        ComplexNum B = new ComplexNum(realNum2, imgNum2);

        System.out.println("Complex Number are: ");
        A.printComplexNum();
        B.printComplexNum();

        ComplexNum C = ComplexNum.add(A, B);
        ComplexNum D = ComplexNum.sub(A, B);
        ComplexNum E = ComplexNum.mul(A, B);

        System.out.print("Addition: ");
        C.printComplexNum();
        System.out.print("Subtraction: ");
        D.printComplexNum();
        System.out.print("Multiplication: ");
        E.printComplexNum();

    }
}

class ComplexNum{
    int realNum;
    int imgNum;

    ComplexNum(int r, int i){
        this.realNum = r;
        this.imgNum = i;
    }

    public static ComplexNum add(ComplexNum C1, ComplexNum C2){
        return new ComplexNum ((C1.realNum + C2.realNum), (C1.imgNum + C2.imgNum));
    }

    public static ComplexNum sub(ComplexNum C1, ComplexNum C2){
        return new ComplexNum ((C1.realNum - C2.realNum), (C1.imgNum - C2.imgNum));
    }

    public static ComplexNum mul(ComplexNum C1, ComplexNum C2){
        return new ComplexNum (((C1.realNum * C2.realNum)-(C1.imgNum * C2.imgNum)), ((C1.realNum * C2.imgNum)+(C1.imgNum * C2.realNum)));
    }

    public void printComplexNum(){
        if(realNum==0 && imgNum!=0){
            System.out.println(imgNum + "i");
        }
        else if(realNum!=0 && imgNum==0){
            System.out.println(realNum);
        }
        else{
        System.out.println(realNum + " + " + imgNum + "i");
        }
    }

}    
