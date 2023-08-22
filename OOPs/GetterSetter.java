public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen(); 
        
        p1.setColor("Blue");
        System.out.println(p1.getColor());  //we need to use getColor() bcoz we cannot print directly (by p1.color) as our string color is private

        p1.setQuantity(14);
        System.out.println(p1.quantity);

        p1.setColor ("Red");
        System.out.println(p1.getColor());

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

    void setColor(String newColor){
        this.color = newColor;
    } 
    void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

}
