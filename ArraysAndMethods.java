public class ArraysAndMethods {

    public static void main(String[] args) {

        // create an array wth the following values: 1,5,2,8,13, 6
        // int[] arr = new int[6];
        // arr[0] = 1;
        // arr[1] = 5;
        // arr[2] = 2;
        // arr[3] = 8;
        // arr[4] = 13;
        // arr[5] = 6;
        int[] arr = { 1, 5, 2, 8, 13, 6 };

        // print out the first element in the array
        System.out.println(arr[0]);

        // print out the last element in the array without using the number 5
        System.out.println(arr[arr.length - 1]);

        // print out the element in the array at position 6, what happens?
        // System.out.println(arr[6]);
        // throws an exception: java.lang.ArrayIndexOutOfBoundsException: Index 6 out of
        // bounds for length 6

        // print out the element in the array at position -1. what happens?
        // System.out.println(arr[-1]);
        // throws an exception: java.lang.ArrayIndexOutOfBoundsException: Index -1 out
        // of bounds for length 6

        // write a traditional for loop that prints out each element in the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // write an enhanced for loop that prints out each element in the array
        for (int num : arr) {
            System.out.println(num);
        }

        // create a new variable called sum ,write a loop that adds each element in the
        // array to the sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);

        // create a new variable called average and assign the average value of the
        // array to it
        int average = sum / arr.length;
        System.out.println(average);

        // write an enhanced for loop that prints out each number in the array only if
        // the number is odd
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        // create an array that contains the values "sam, sally, thomas, and robert"
        String[] names = { "Sam", "Sally", "Thomas", "Robert" };

        // calculate the num of all the letters in the new array
        int sumOfChar = 0;
        for (String name : names) {
            sumOfChar += name.length();
        }
        System.out.println(sumOfChar);

        // write and test a method that takes a string name and prints out a greeting,
        // this method returns nothing
        greetings("lia");

        // write and test a method that takes a string name and returns a greeting, do
        // not print in the method
        System.out.println(greetings2("Jen"));

        // analyze the difference between these 2 methods - what do you find? how are
        // they different?
        // you do not need to print the method when called for greetings() but you do
        // have to print the method greetings2() since that method does not have a print
        // inside of it

        // write and test a method that takes a string and an int and returns true if
        // the num of letters in the string is greater than the int
        System.out.println(isNumOfLettersGreaterThanInt("hello", 5));

        // write and test a method that takes an array of string and a string and
        // returns true if the string passed in exists in the array
        String[] arr2 = { "dog", "do", "doggy" };
        System.out.println(isWordInTheArray(arr2, "dog"));

        // write and test a method that takes an array of int and returns the smallest
        // number in the array
        int[] arrOfNums = { 4, 7, 9, 10, 2 };
        System.out.println(smallestInt(arrOfNums));

        // write and test a method that takes an array of double and returns the average
        double[] doubleNums = { 4.5, 6.8, 2.3, 9.1 };
        System.out.println(averageDouble(doubleNums));

        // write and test a method that takes an array of strings and returns an array
        // of int where each element matches the length of the string at the position
        String[] wordsArr = { "hi", "hihi", "bye" };
        // [2, 5, 3]
        int[] testing = getIndexesOfArray(wordsArr);
        for (int num : testing) {
            System.out.println(num);
        }
        // write and test a method that takes an array of strings and returns true if
        // the sum of letters for all strings with an even amount of letters is greater
        // than the sum of those with an odd amount of letters
        System.out.println(isSumOfEvenLettersGreaterThanSumOfOddLetters(wordsArr));

        // write and test a method that takes a string and returns true if the string is
        // a palindrome
        String str3 = "racecar";
        System.out.println(isPalindrome(str3));
    }

    public static void greetings(String name) {
        System.out.println("hello " + name + " !");
    }

    public static String greetings2(String name) {
        return "hello " + name + " !";
    }

    public static Boolean isNumOfLettersGreaterThanInt(String str, int num) {
        // System.out.println(str.length());
        return str.length() > num;
    }

    public static Boolean isWordInTheArray(String[] arr, String theWord) {
        for (String word : arr) {
            if (word.equals(theWord)) {
                return true;
            }
        }
        return false;
    }

    public static Integer smallestInt(int[] arr) {
        int smallest = arr[0];
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static Double averageDouble(double[] arr) {
        double average = 0;
        for (Double num : arr) {
            average += num;
        }
        return average / arr.length;
    }

    public static int[] getIndexesOfArray(String[] arr) {
        int[] resultsArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultsArr[i] = arr[i].length();
        }
        return resultsArr;
    }

    public static Boolean isSumOfEvenLettersGreaterThanSumOfOddLetters(String[] arr) {
        int sumOfEvenLetters = 0;
        int sumOfOddLetters = 0;
        for (String word : arr) {
            if (word.length() % 2 == 0) {
                sumOfEvenLetters += word.length();
            } else {
                sumOfOddLetters += word.length();
            }
        }
        return sumOfEvenLetters > sumOfOddLetters;
    }

    public static Boolean isPalindrome(String str) {
        int pointer1 = 0;
        int pointer2 = str.length();
        while (pointer1 > pointer2) {
            if (str.charAt(pointer1) == str.charAt(pointer2)) {
                pointer1++;
                pointer2--;
            }
            return true;
        }
        return false;
    }
}
