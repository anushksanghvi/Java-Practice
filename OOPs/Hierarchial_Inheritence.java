public class Hierarchial_Inheritence{
    public static void main(String[] args) {
        Mammal Dog = new Mammal();
        Fish Shark = new Fish();
        Bird Parrot = new Bird(); 

        Dog.eat();
        Dog.walk();

        Parrot.breathe(); 
        
    }
}

class Animals{
    String name;
    void eat(){
        System.out.println("Eats food");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class Mammal extends Animals{

    void walk(){
        System.out.println("Walks");
    }

}

class Fish extends Animals{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}

class Bird extends Animals{

    void fly(){
        System.out.println("Flys");
    }
}