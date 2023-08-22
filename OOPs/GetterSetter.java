public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "red";
        p1.quantity = 5;
        System.out.println(p1.color);
        System.out.println(p1.quantity);        
    }
}

class Pen{
    String color;
    String type;
    int quantity;

    String getColor(){
        return this.color;
    }
    String getType(){
        return this.type;
    }
    int getQuantity(){
        return this.quantity;
    }

    String setColor(){
        return this.color;
    } 
    int setQuantity(){
        return this.quantity;
    }

}
