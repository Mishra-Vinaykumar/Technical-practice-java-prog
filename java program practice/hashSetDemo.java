import java.util.HashSet;

public class hashSetDemo {

    static void addElement(HashSet<Integer> numberHashSet) {
        numberHashSet.add(21);
        numberHashSet.add(61);
        numberHashSet.add(51);
        numberHashSet.add(41);
        numberHashSet.add(71);
        numberHashSet.add(61);
        System.out.println(numberHashSet.add(30));
    }

    public static void main(String[] args) {

        HashSet<Integer> num = new HashSet<>();
        addElement(num);

        HashSet<Integer> num1 = new HashSet<>();
        num1.add(20);
        num1.add(10);
        num1.add(40);
        num1.add(50);
        num1.add(21);
        System.out.println("Set 1 : " + num);
        System.out.println("Set 1 : " + num1);

    }
}
