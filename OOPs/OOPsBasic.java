public class OOPsBasic {
    public static void main(String[] args) {
        Pen p1 = new Pen();   // Created a pen object p1
        p1.color = "Blue";
        p1.quantity = 5;
        p1.tip = 10;

        Pen p2 = new Pen();  // Created a pen object p2
        p2.color = "Black";
        p2.quantity = 8;


        System.out.println(p1.color);
        System.out.println(p2.quantity);

        p1.setColor("Red");
        System.out.println(p1.color);

    }
}

class Pen{
    String color;
    int tip;
    int quantity;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

