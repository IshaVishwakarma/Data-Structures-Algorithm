import java.util.*;

public class basicqueue {
    public static void main(String[] args) {
        /*Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(9);
        queue.add(12);
        queue.add(15);
        queue.add(78);

        System.out.println(queue.remove());*/

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(45);
        deque.addFirst(62);
        System.out.println(deque);
    }
}