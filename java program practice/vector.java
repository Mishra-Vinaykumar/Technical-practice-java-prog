import java.util.Vector;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class vector {

    public static void main(String[] args) {

        Vector<String> animal = new Vector<>();

        animal.add("Cat");
        animal.add("Dog");
        animal.add("Tiger");
        System.out.println("Initail vector : " + animal);

        // using get method
        String ele = animal.get(2);
        System.out.println("Element of Index 2 : " + ele);

        // using iterator ()
        System.out.println("Vectors ");
        Iterator<String> i = animal.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            System.out.println(", ");

        }
        ele = animal.remove(1);
        System.out.println("removed element " + ele);
        System.out.println("New Vector s" + animal);

    }
}
