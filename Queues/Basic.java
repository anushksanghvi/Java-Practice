import java.util.*;

public class Basic{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
        Queue<Integer> q2 = new ArrayDeque<>();

    }
}