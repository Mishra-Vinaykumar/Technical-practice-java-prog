// - >..  Program of Stream API Function 

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunDemo {
	public static void main(String[] args) {

		List<String> strLi = Arrays.asList("Ahmedabad", "", "Mumbai", "", "Delhi", "Banglour", "Ayodhya"); // source
		System.out.println("List of Cities is " + strLi);

		// retrieve the stream
		Stream<String> stream = strLi.stream();

		// Count the empty strings
		long count = StreamFunctions.countEmptyStrings(stream);
		System.out.printf("List %s has %d empty strings \n", strLi, count);
		// System.out.println("List "+strLi+" has "+count+" empty strings"); //
		// Counting String with length more than 8*

		count = StreamFunctions.countStrings(strLi.stream(), 8);
		System.out.printf("List %s has %d strings of length more than 8 \n", strLi, count);

		// Remove all empty Strings from List*
		List<String> filteredList = StreamFunctions.nonEmptyStringList(strLi.stream());
		System.out.printf("Original List : %s, List without Empty Strings : %s \n", strLi, filteredList);

		// Strings with length more than 6
		filteredList = StreamFunctions.getStrings(strLi.stream(), 6);
		System.out.printf("Original List : %s, Cities length more than 6: %s %n", strLi, filteredList);

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		// Retrieve the stream
		Stream<Integer> stream1 = numbers.stream();

		// List of square of all distinct numbers
		List<Integer> filteredNumberList = StreamFunctions.getSquareList(stream1);
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, filteredNumberList);

		// Get count, min, max, sum, and average for numbers
		StreamFunctions.showStatistics(numbers.stream());

	}

}