
public class genericConstructor {

    private double v;

    public <T extends Number> genericConstructor(T t) {
        v = t.doubleValue();
    }

    void show() {
        System.out.println("Vlaue of v in double type is: " + v);
    }

    public static void main(String[] args) {

        genericConstructor g = new genericConstructor();
        g.show();
    }

}
