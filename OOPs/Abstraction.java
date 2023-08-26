public class Abstraction {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        
        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang m = new Mustang("Black");
        System.out.println(m.color);

    }
}

abstract class Animal{
    String color;

    void eat(){                            //Non-Abstract Method
        System.out.println("Eats food");
    }

    abstract void walk();                  //Abstract Method

    Animal(){                              //Constructor 
        color = "Brown";
    }

}


class Horse extends Animal{

    void walk(){
        System.out.println("Walks on 4 legs");
    }

    void changeColor(){
        color = "Dark Brown";
    }

}

class Mustang extends Horse{
    Mustang(String c){
        this.color = c;
    }
}


class Chicken extends Animal{

    void walk(){
        System.out.println("Walks on 2 legs");
    }

    void changeColor(){
        color = "Yellow";
    }

}

