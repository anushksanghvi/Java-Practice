public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Anushk");
        Student s3 = new Student("Rohan", 19);
       // System.out.println(s2);
        System.out.println(s2.name);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);
    }
}

class Student {
    String name;
    int age;

    Student(){                                              //Non-Parameterized Constructor
        System.out.println("Constructor is called...");
    }

    Student(String n){                //Parameterized Constructor
        this.name = n;
    }

    Student(String n, int a){         //Parameterized Constructor
        this.name = n;
        this.age = a;
    }
}

