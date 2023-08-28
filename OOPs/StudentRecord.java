import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        System.out.println("Enter student details:");
        Scanner sc = new Scanner (System.in);
        StudentData SD = new StudentData();
        
        System.out.print("Enter student Name: ");
        String name = sc.nextLine();
        SD.setName(name);

        System.out.print("Enter student SapId: ");
        int sapId = sc.nextInt();
        SD.setSapId(sapId);
        sc.nextLine();

        System.out.print("Enter student Roll No.: ");
        String rollNum = sc.nextLine();
        SD.setRollNum(rollNum);

        System.out.print("Enter student Age: ");
        int age = sc.nextInt();
        SD.setAge(age);

        // SD.printInfo();

        System.out.println("Student details are: ");
        System.out.println("--------------------------------------");
        System.out.println("Student name: " + SD.name);
        System.out.println("Student SAP ID: " + SD.getSapId());
        System.out.println("Student Roll No.: " + SD.getRollNum());
        System.out.println("Student Age: " + SD.age);
        
    }
}

class StudentData{
    String name;
    private long sapId;
    private String rollNum;
    int age;

    //Getter Method
    public String getName(){
        return this.name;
    }
    
    public long getSapId(){
        return this.sapId;
    }

    public String getRollNum(){
        return this.rollNum;
    }

    public int getAge(){
        return this.age;
    }

    //Setter Method
    public void setName(String name){
        this.name = name;
    }

    public void setSapId(long sapId){
        this.sapId = sapId;
    }

    public void setRollNum(String rollNum){
        this.rollNum = rollNum;
    }

    public void setAge(int age){
        this.age = age;
    }

    // public void printInfo(){
    //     System.out.println("--------------------------------------");
    //     System.out.println("Student details are: ");
    //     System.out.println("Student name: " + this.name);
    //     System.out.println("Student SAP ID: " + this.sapId);
    //     System.out.println("Student Roll No.: " + this.rollNum);
    //     System.out.println("Student Age: " + this.age);
    // }

}


