import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringBuilderListSetMap {

    public static void main(String[] args) {

        // why would we use a string builder instead of a string?
        // to manipulate a string and less memory taken

        // instantiate a new stringbuilder and append the characters 0-9 to it separated
        // by dashes
        // make sure no dashes at the end of the string builder
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                string.append(i + "-");
            } else {
                string.append(i);
            }
        }
        System.out.println(string);

        // create a list of strings and add 5 strings to it, each with a different
        // length
        List<String> listOfStrings = new ArrayList<String>();
        listOfStrings.add("r");
        listOfStrings.add("re");
        listOfStrings.add("redd");
        listOfStrings.add("redd m");
        listOfStrings.add("redd ma");
        System.out.println(listOfStrings);
        // or
        List<String> listOfStrings2 = Arrays.asList("t", "te", "tes", "test", "testing");
        System.out.println(listOfStrings2);

        // write and test a method that takes a list of strings & returns the shortest
        // string

        // write and test a method that takes a list of strings and returns the list
        // with the first and last element switched

        // write and test a method that takes a list of strings and returns a string
        // with all the list elements concatenated to each other, separated by a coma

        // write and test a method that takes a list of strings and a string and returns
        // a new list with all strings from the original list containing the second
        // string parameter (like the search method)

        // write and test a method that takes a list of integers and returns a
        // list<list<integer>> where the first list in the returned value

    }
}
