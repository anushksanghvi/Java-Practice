public class CallByValue {
    public static void changeA(int a){
        a = 10;
        // System.out.println(a);
    }

    
    public static void main(String[] args) {
        int a = 5;
        changeA(a);
        System.out.println(a);
    }
}
