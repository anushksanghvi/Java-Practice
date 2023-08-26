public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.name = "Blue Shark";
        System.out.println(shark.name);

        shark.eat();
        shark.breathe();
        shark.swims();

    }
}

//Parent class OR Base class 
class Animals{
    String name;
    void eat(){
        System.out.println("Eats food");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

//Child class OR Derived class OR subclass
class Fish extends Animals{
    int fins;

    void swims(){
        System.out.println("Swims in water");
    }
}
