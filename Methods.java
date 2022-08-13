public class Methods {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        int start = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start * 3;
            start++;
        }
        // 3, 6, 9, 12, 15 = 45
        // System.out.println(sumOfAllIntegers(numbers));

        double[] numbers2 = new double[5];
        numbers2[0] = 4.32;
        numbers2[1] = 34.2;
        numbers2[2] = 0.45;
        numbers2[3] = 66.77;
        numbers2[4] = 4.11;
        // System.out.println(averageOfNums(numbers2));

        System.out.println(magicWithNumAndString("hello", 3));
    }

    // takes an array of ints and returns the sum of all ints
    public static int sumOfAllIntegers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

    // takes an array of double and returns the average of all elements in the array
    public static double averageOfNums(double[] nums) {
        int length = nums.length;
        double total = 0;
        for (double num : nums) {
            total += num / length;

        }
        return total;
    }

    // takes a string and an int and returns the string concatenated with itself int
    // number of times
    public static String magicWithNumAndString(String aString, int anInt) {
        String resultString = aString;
        for (int i = 1; i < anInt; i++) {
            resultString = aString + " ";
        }
        return resultString;
    }
}
