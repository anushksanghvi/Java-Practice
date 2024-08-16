public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen(); 
        
        p1.setColor("Blue");
        System.out.println(p1.color);   //we cannot print directly access/print by p1.color as our String color is private. We need getter and setter for this.
        System.out.println(p1.getColor());  //we need to use p1.getColor() --> getter to print color

        p1.setQuantity(14);     //here since our quantity is not private , so we can directly use p1.quantity
        System.out.println(p1.quantity);

        p1.setColor ("Red");
        System.out.println(p1.getColor());

        // p1.printInfo();
    }
}        

class Pen{
    private String color;
    int quantity;

    String getColor(){
        return this.color;
    }
    int getQuantity(){
        return this.quantity;
    }

    public void setColor(String newColor){
        this.color = newColor;
    } 
    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

    // void printInfo(){
    //     System.out.println(this.color);
    //     System.out.println(this.quantity);
    // }
}
