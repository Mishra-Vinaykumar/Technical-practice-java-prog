import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.add(i);
            System.out.println(q);
        }
        // remove head of the element
        int rem = q.remove();
        System.out.println(rem);
        System.out.println(q);

        // reteriving the head element
        int head = q.peek();
        System.out.println(q);

        int size = q.size();
        System.out.println(size);

    }
}
