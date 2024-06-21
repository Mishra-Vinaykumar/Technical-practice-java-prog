public class genericMethod {

    public <E> void dispalyArrayElements(E[] elements) {
        for (E elements : elements) {
            System.out.println("elements are " + elements);
        }
    }

}
