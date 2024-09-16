class Main {
    public static void main(String[] args) {
      Student s1 = new Student();
      s1.name = "Anushk";
      s1.age = 21;

      Student s2 = new Student(s1);
      System.out.println(s2.name);
      System.out.println(s2.age);
    }
}

class Student{
  String name;
  int age;
  String pass;
  
  Student(Student s1){
    this.name = s1.name;
    this.age = s1.age;
  }


  Student(){
    System.out.println("Default constructor");
  }

}