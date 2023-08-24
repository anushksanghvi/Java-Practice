public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anushk";
        s1.rollNum = 215;
        s1.password = "abcd";
        s1.marks[0] = 86;
        s1.marks[1] = 99;
        s1.marks[2] = 75;

        Student s2 = new Student(s1);   //Copy
        s2.password = "xyz";

        s1.marks[2] = 100;
        
        for (int i=0; i<3; i++ ){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int rollNum;
    String password;
    int marks[];

    // //SHALLOW COPY CONSTRUCTOR
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNum = s1.rollNum;
    //     this.marks = s1.marks;
    // }

    // //DEEP COPY CONSTRUCTOR
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNum = s1.rollNum;
        for (int i=0; i<marks.length; i++){
            this.marks[i]=s1.marks[i];
        }  
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(String n){
        marks = new int[3];
        this.name = n;
    }

    Student(int r){
        this.rollNum = r;
    }

}