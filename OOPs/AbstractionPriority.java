public class AbstractionPriority {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        // Animal-> Horse-> Mustang 
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor is called");
    }
}


class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor is called");
    }
}


 class Mustang extends Horse{
    Mustang(){
        System.out.println("Mastang constructor is called");
    }
}

