public class StaticKeyword {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.schoolName = "St. Paul's Sr. Sec. School";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "SD Public School";
        System.out.println(s3.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}

class Student{
    String name;
    int rollNum;

    static String schoolName;              //static variable

    static int calcPercentage(int math, int phy, int chem){       //Static function
        return ((math + phy + chem)/3)*100;
    }

    void setName(String n){
        this.name = n;
    }

    String getName(){
        return this.name;
    }
    
}
