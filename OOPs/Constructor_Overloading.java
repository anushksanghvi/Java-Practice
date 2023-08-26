public class Constructor_Overloading {
    public static void main(String[] args) {
        Sum s = new Sum();
        Sum s1 = new Sum(10,20);       
        Sum s2 = new Sum(10,20,30);       
        s1.Add();
        s2.Add();
    }
}

class Sum{
    int num1, num2, num3;

    Sum(){
        System.out.println("Default constructor...");
    }

    Sum(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;        
    }

    Sum(int n1, int n2, int n3){
        this.num1 = n1;
        this.num2 = n2; 
        this.num3 = n3;
    }

    void Add(){
            System.out.println((num1 + num2 + num3));
    }

}