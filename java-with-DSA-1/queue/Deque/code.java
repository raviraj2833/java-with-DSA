
import java.util.*;
public class code {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);

        // removelast
        deque.removeLast();
        System.out.println(deque);
        System.out.println("first element:"+ deque.getFirst());
        System.out.println("Last element:"+ deque.getLast());

    }

    
}