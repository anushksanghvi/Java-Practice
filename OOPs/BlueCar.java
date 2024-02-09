abstract class Car {
    static {
        System.out.print("1");
    }

    public Car(String name) {
        // super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }

}

public class BlueCar extends Car {
    {
        System.out.print("4");
    }

    public BlueCar() {
        super("blue");          //Here we have to write super("name") in order to assess immediate parent class constructor  
        System.out.print("5");
    }

public static void main(String[] args) {
        new BlueCar();
    }
}