public class StringAndStringBuilder {

    public static void main(String[] args) {
        // use a string object when you want it to be constant, without manipulating it
        // use a string builder when you want it to be dynamic such as below:

        StringBuilder testing = new StringBuilder("hello");
        testing.append(" world");

        System.out.println(testing);
        System.out.println(testing.charAt(3));
        testing.deleteCharAt(2);
        System.out.println(testing);
        testing.delete(2, 4);
        System.out.println(testing);
        System.out.println(testing.indexOf("o"));
        // System.out.println(testing);
        testing.replace(2, 4, "hi ");
        System.out.println(testing);

        testing.reverse();
        System.out.println(testing);

        Integer num = 3;
        // cannot invoke toString() on primitive data
        System.out.println(num.toString());

        StringBuilder results = new StringBuilder();
        for (int i = 0; i < num; i++) {
            results.append("nyob zoo, ");
        }
        System.out.println(results);

    }
}
