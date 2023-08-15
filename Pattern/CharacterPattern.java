import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        char ch = 'A';

        for(int line=1; line<=n; line++){
            for (int word=1; word<=line; word++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
