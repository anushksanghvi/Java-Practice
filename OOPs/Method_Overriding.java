public class Method_Overriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();

        Animal a1 = new Animal();
        a1.eat();
        
    }
}

class Animal{

    void eat(){
        System.out.println("Eats");
    }
}

class Deer extends Animal{

    void eat(){
        System.out.println("Eats grass");
    }
}
