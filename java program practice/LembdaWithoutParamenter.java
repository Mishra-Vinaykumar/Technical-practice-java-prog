public class LembdaWithoutParamenter {
    /*
     * *lambda expression is treated as a function (@functionalinterface)
     * Lambda expression provides implementation of functional interface
     * Less coding
     * Java 8 feature
     * 
     * Syntax: () -> { }
     * Argument-list ()
     * Arrow-token ->
     * body {}
     */
    interface IStatement {
        String show();
    }

    public static void main(String[] args) {
        IStatement s = () -> {
            return "Hello";
        };
        System.out.println(s.show());
    }

}
