public class Interface_MultipleInheritence {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.hunt();
        
    }
}


interface Herbivores{
    void eat();
}

interface Carnivores{
    void hunt();
}

class Bear implements Herbivores, Carnivores{

    public void eat(){
        System.out.println("Eats grass");
    }

    public void hunt(){
        System.out.println("Hunt small animals");
    }

}
