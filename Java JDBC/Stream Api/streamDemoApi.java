import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamDemoApi {
    public static void main(String[] args) {

        // Create a Stream from set of values
        Stream<Integer> st = Stream.of(10, 20, 30);

        // Count the Vlaues
        System.out.println(st.count());
        // print the Values using ForEach loop
        // st.forEach(System.out::println);

        // Create Array
        Integer[] val = new Integer[] { 10, 20, 30, 40, 50, 10, 30, 23 };

        // Create the stream from arr
        st = Arrays.st(val);

        // MAP
        System.out.println("Square of " + Arrays.toString(val) + "Is as follo");
        st.map(num -> num * num).forEach(System.out::println);
        st = forEach(System.out::println);

        // Limit
        System.out.println("First 2 elements are :");
        Arrays.st(val).limit(2).forEach(System.out::println);

        // Skip
        System.out.println("Elements excepts first 4 are :");
        Arrays.st(val).skip(2).forEach(System.out::println);

        // DistDinct
        System.out.println("Distinct Elements are :");
        Arrays.st(val).distinct().forEach(System.out::println);

        // Use to retrive the array ->> It will fixed array we can not add new element
        List<String> words = Arrays.asList("Hellow", "Stream", "Learn and Writing");
        word.add("Happy"); // Immutable List

        // Create a Stream From List
        // --> toUpperCase
        // --> toLowerCase
        // --> collect -->Collectors ---> application in list and set

        Stream<String> st1 = words.stream();
        System.out.println(words);

    }
}
