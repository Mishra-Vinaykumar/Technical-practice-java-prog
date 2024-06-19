import java.util.ArrayDeque;
import java.util.Deque;

public class AarrayDequeDemo {

    public static void main(String[] args) {

        Deque<String> arrDeque = new ArrayDeque<>();

        arrDeque.add("A");
        arrDeque.add("X");
        arrDeque.add("Y");
        arrDeque.add("Z");

        arrDeque.offer("O");
        arrDeque.offerFirst("F");
        arrDeque.offerLast("L");

        System.out.println(arrDeque);

        // Poll Method

    }
}
