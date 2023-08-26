public class Multi_Level_Inheritence {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.color = "Brown";
        System.out.println(dobby.color);
        dobby.legs = 4;
        System.out.println(dobby.legs);

        dobby.eat();
        dobby.speak();
        
        
    }
}

class Animals{
    String color;
    void eat(){
        System.out.println("Eats food");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class Mammal extends Animals{
    int legs;

}

class Dog extends Mammal{
    String breed;

    void speak(){
        System.out.println("Barks");
    }
}