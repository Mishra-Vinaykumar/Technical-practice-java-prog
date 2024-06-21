public class lembdaExpWithParameter {

    public static void main(String[] args) {
        Message m1 = (name) -> {
            System.out.println("Hello" + name);
        };
        m1.greet("Vinay");

        Cube c = (a) -> {
            return (a * a * a);
        };
        System.out.println("Cube of 5 is " + c.Calculate(5));

        Cube c1 = (a) -> {
            return (a * a * a);
        };
        System.out.println("Cube of 4 is " + c1.Calculate(4));

        // Is Odd
        Isodd odd = (a) -> a % 2 != 0 ? true : false;
        System.out.println("Is 7 odd number? :" + odd.chekOdd(7));
        System.out.println("Is 8 odd number? :" + odd.chekOdd(8));
    }
}
