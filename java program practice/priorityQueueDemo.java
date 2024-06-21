import java.util.*;

public class priorityQueueDemo {

    public static void main(String[] args) {

        Queue prior = new PriorityQueue();

        prior.add("Core Java");
        prior.add("C");
        prior.add("Python");
        prior.add("Advance java");

        System.out.println(prior);

        prior.remove("Advance java");
        System.out.println("After removing" + prior);

        System.out.println("poll Method " + prior.poll());
        System.out.println("poll Method " + prior.peek()); // <-- display head element

    }
}
