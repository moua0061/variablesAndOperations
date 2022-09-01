import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        List<String> listOfStrings2 = Arrays.asList("tt", "te", "tes", "test", "testing", "t");
        System.out.println(listOfStrings2);

        // write and test a method that takes a list of strings & returns the shortest
        // string
        System.out.println(getShortestString(listOfStrings2));

        // write and test a method that takes a list of strings and returns the list
        // with the first and last element switched
        System.out.println(switchFirstAndLastElement(listOfStrings));

        // write and test a method that takes a list of strings and returns a string
        // with all the list elements concatenated to each other, separated by a coma
        System.out.println(combinedStrings(listOfStrings2));

        // write and test a method that takes a list of strings and a string and returns
        // a new list with all strings from the original list containing the second
        // string parameter (like the search method)
        List<String> listOfStrings3 = Arrays.asList("robin", "car", "grass", "color", "reedd", "blue");
        System.out.println(searchingForAstring(listOfStrings3, "red"));

        // write and test a method that takes a list of integers and returns a
        // list<list<integer>> where the first list in the returned value contains any
        // number from the input list that is divisible by 2, the second list contains
        // values from the input list that are divisible by 3, and the third divisible
        // by 5, and the fourth all numbers from that input list not divisible by 2,3 or
        // 5
        List<Integer> numbers = Arrays.asList(1, 45, 8, 5, 23, 89, 23);
        System.out.println(listsOfDivibleIntegers(numbers));
        // [[8], [45], [5], [1, 23, 89, 23]]

        // write and test a method that takes a list of strings and return a list of
        // integers that contains the length of each string
        System.out.println(getLengthOfEachString(listOfStrings));

        // create a set of strings and add 5 values
        Set<String> setOfStrings = new HashSet<String>();
        setOfStrings.add("one");
        setOfStrings.add("two");
        setOfStrings.add("three");
        setOfStrings.add("four");
        setOfStrings.add("five");
        System.out.println(setOfStrings);

        // write and test a method that takes a set of strings and a character and
        // returns a set of strings consisting of all the strings in the input set that
        // start with the character parameter
        System.out.println(findSetsThatStartsWithChar(setOfStrings, 'f'));

        // write and test a method that takes a set of strings and returns a list of the
        // same strings
        System.out.println(returnsAListFromASet(setOfStrings));

        // write and test a method that takes a set of integers and returns a new set of
        // integers containing only even numbers from the original set
        Set<Integer> setOfNums = new HashSet<Integer>();
        setOfNums.add(3);
        setOfNums.add(5);
        setOfNums.add(8);
        setOfNums.add(37);
        setOfNums.add(22);
        setOfNums.add(1);
        setOfNums.add(102);
        System.out.println(setOnlyContainingEvenNums(setOfNums));

        // create a map of string and string and add 3 items to it where the key of each
        // is a word and the value is the definition of the word
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Watermelon", "da best fruit EVER");
        myMap.put("Java", "This is an OOP programming language");
        myMap.put("JavaScript", "REACT and TS!");
        System.out.println(myMap);

        // write and test a method that takes a Map<String, String> and a string and
        // returns the value for a key in the map that matches the string parameter (ie
        // like a language dictionary lookup)
        System.out.println(keyLookUp(myMap, "Watermelon"));

        // write and test a method that takes a List<String> and returns a
        // Map<Character, Integer> containing a count of all the strings that start with
        // a given character
        System.out.println(findCountOfCharInStrings(listOfStrings3));

    }

    public static Map<Character, Integer> findCountOfCharInStrings(List<String> listOfStrings) {
        Map<Character, Integer> results = new HashMap<>();
        // int counter = 0;
        for (String string : listOfStrings) {
            char firstChar = string.charAt(0);
            // ask steven why this keeps adding: this is not keeping count of each
            // individual character => it's only increasing when I add the character as a
            // key
            // results.put(firstChar, counter++);
            // System.out.println("first char: " + firstChar);
            // System.out.println(results);

            // if the character does not exist in our results map, add it to & add 1
            if (results.get(firstChar) == null) {
                results.put(firstChar, 1);
                // else if the key already exists, add 1 to it every time
            } else {
                results.put(firstChar, results.get(firstChar) + 1);
            }
        }
        return results;
    }

    public static String keyLookUp(Map<String, String> map, String str) {
        // String results = "";
        // looping through a map, needs to call the .keySet() method
        for (String key : map.keySet()) {
            // System.out.println("what keySet looks like: " + map.keySet());
            if (key.equals(str)) {
                // System.out.println("what get.(key) looks like: " + map.get(key));
                return map.get(key);
            }
        }
        return "";
    }

    public static Set<Integer> setOnlyContainingEvenNums(Set<Integer> set) {
        Set<Integer> results = new HashSet<Integer>();
        for (Integer num : set) {
            if (num % 2 == 0) {
                results.add(num);
            }

        }

        return results;
    }

    public static List<String> returnsAListFromASet(Set<String> set) {
        List<String> results = new ArrayList<String>();
        for (String string : set) {
            results.add(string);
        }

        return results;
    }

    public static Set<String> findSetsThatStartsWithChar(Set<String> set, char c) {
        Set<String> results = new HashSet<String>();
        for (String string : set) {
            if (string.charAt(0) == c) {
                results.add(string);
            }
        }
        return results;

    }

    public static List<Integer> getLengthOfEachString(List<String> list) {
        List<Integer> results = new ArrayList<>();
        for (String string : list) {
            results.add(string.length());
        }

        return results;
    }

    public static List<List<Integer>> listsOfDivibleIntegers(List<Integer> listOfNumbers) {

        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> divisibleBy2List = new ArrayList<Integer>();
        List<Integer> divisibleBy3List = new ArrayList<Integer>();
        List<Integer> divisibleBy5List = new ArrayList<Integer>();
        List<Integer> remainingList = new ArrayList<Integer>();
        results.add(divisibleBy2List);
        results.add(divisibleBy3List);
        results.add(divisibleBy5List);
        results.add(remainingList);

        // or you can do this way too:
        // List<List<Integer>> results = new ArrayList<List<Integer>>();
        // results.add(new ArrayList<Integer>());
        // results.add(new ArrayList<Integer>());
        // results.add(new ArrayList<Integer>());
        // results.add(new ArrayList<Integer>());

        // for (Integer number : listOfNumbers) {
        // if (number % 2 == 0) {
        // results.get(0).add(number);
        // } else if (number % 3 == 0) {
        // results.get(1).add(number);
        // } else if (number % 5 == 0) {
        // results.get(2).add(number);
        // } else {
        // results.get(3).add(number);
        // }
        // }

        for (Integer number : listOfNumbers) {
            if (number % 2 == 0) {
                divisibleBy2List.add(number);
            } else if (number % 3 == 0) {
                divisibleBy3List.add(number);
            } else if (number % 5 == 0) {
                divisibleBy5List.add(number);
            } else {
                remainingList.add(number);
            }
        }
        return results;
    }

    public static List<String> searchingForAstring(List<String> list, String theWord) {
        List<String> results = new ArrayList<String>();
        for (String string : list) {
            if (string.contains(theWord)) {
                // .equals() is different than .contains()
                // better usage of contains() than equals()
                results.add(string);
            }
        }
        return results;
    }

    public static String combinedStrings(List<String> list) {
        StringBuilder newString = new StringBuilder();
        for (String string : list) {
            newString.append(string + ", ");
        }
        return newString.toString();
    }

    public static List<String> switchFirstAndLastElement(List<String> listOfStrings) {
        String temp = listOfStrings.get(0);
        int lastElement = listOfStrings.size() - 1;
        listOfStrings.set(0, listOfStrings.get(lastElement));
        listOfStrings.set(lastElement, temp);

        return listOfStrings;
    }

    public static String getShortestString(List<String> arrayOfStrings) {
        String shortestString = arrayOfStrings.get(0);

        for (String string : arrayOfStrings) {
            if (string.length() < shortestString.length()) {
                shortestString = string;
            }
        }
        return shortestString;
    }
}
