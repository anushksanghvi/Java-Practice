public class ArrayFunction {
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 2;
        } 
        // System.out.println(nonChangable);
    }
    public static void main(String[] args) {
        int marks[] = {94, 95, 96};
        int nonChangable = 5;
        
        update(marks, nonChangable);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println(nonChangable);

    }
}
