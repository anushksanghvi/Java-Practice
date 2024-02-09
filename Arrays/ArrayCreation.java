public class ArrayCreation{
    public static void main(String[] args) {
        int marks[] = new int [50];
        int numbers[] = {1, 2, 3, 4, 5};
        int moreNumbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        String fruits[] = {"Apple", "Mango", "Banana", "Orange"};

        System.out.println(marks[5]);
        System.out.println(moreNumbers[8]);
        System.out.println(fruits[3]);


        System.out.println(marks.length);     //To get length of an Array
        System.out.println(numbers.length);
        System.out.println(fruits.length);
        
    }
}