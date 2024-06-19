public class upperboundWildcardDemo {

    public static Double sumOfList(ArrayList<? extends Number> al) {
        double sum = 0.0;
        for (Number n : al) {
            sum = sum + n.doubleValue(); // any sub class
        }
        return sum;
    }

}
