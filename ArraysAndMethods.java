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
        // System.out.println(arr[0]);

        // print out the last element in the array without using the number 5
        // System.out.println(arr[arr.length - 1]);

        // print out the element in the array at position 6, what happens?
        // System.out.println(arr[6]);
        // throws an exception: java.lang.ArrayIndexOutOfBoundsException: Index 6 out of
        // bounds for length 6

        // print out the element in the array at position -1. what happens?
        // System.out.println(arr[-1]);
        // throws an exception: java.lang.ArrayIndexOutOfBoundsException: Index -1 out
        // of bounds for length 6

        // write a traditional for loop that prints out each element in the array
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // write an enhanced for loop that prints out each element in the array
        // for (int num : arr) {
        // System.out.println(num);
        // }

        // create a new variable called sum ,write a loop that adds each element in the
        // array to the sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        // System.out.println(sum);

        // create a new variable called average and assign the average value of the
        // array to it
        int average = sum / arr.length;
        // System.out.println(average);

        // write an enhanced for loop that prints out each number in the array only if
        // the number is odd
        for (int num : arr) {
            if (num % 2 != 0) {
                // System.out.println(num);
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

    }
}
