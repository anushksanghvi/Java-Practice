public class Method_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(45,52));
        System.out.println(calc.sum(42.23f, 63.34f));
        System.out.println(calc.sum(15,48,39));
        
    }
}

class Calculator{

    int sum(int a, int b){
        return (a+b);
    }

    float sum(float a, float b){
        return (a+b);
    }

    int sum(int a, int b, int c){
        return (a+b+c);
    }
}