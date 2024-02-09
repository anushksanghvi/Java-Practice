class Test{
    static int marks;
    void set_marks(int marks){
        this.marks = marks;
    }
}

public class OOPsPracticeQues9 {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(98);
        System.out.println(Test.marks);    //Since our marks variable is static, so we can also call directly by class name 
    }
}
