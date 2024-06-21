import java.util.*;

public class listDemo {
    public static void main(String[] args) {

        List l = new ArrayList();

        System.out.println("SIze of the array : " + l.size());
        System.out.println("List is empty or not : " + l.isEmpty());

        l.add(10);
        l.add(30);
        l.add(70);
        l.add(false);
        l.add(true);
        l.add("Hello");
        l.add(90.7);
        l.add("i");
        // l.add(9, "binod");

        System.out.println("List is " + l);
        System.out.println("List contain " + l);

        l.remove(false); // remove ele
        System.out.println("Lis is " + l);

        l.get(5); // getElement of i
        System.out.println("ele in 5 th : " + l);

        l.indexOf(20); // find particular ele index
        l.lastIndexOf(20); // lst ele

        Collections.sort(l); // Sort ele but we have same datatype other wise it throws error

        l.clear(); // It will empty list

    }
}
