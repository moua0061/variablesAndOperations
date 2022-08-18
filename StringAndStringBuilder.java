public class StringAndStringBuilder {

    public static void main(String[] args) {

        StringBuilder testing = new StringBuilder("hello");
        testing.append(" world");

        System.out.println(testing);
        System.out.println(testing.charAt(3));
        testing.deleteCharAt(2);
        System.out.println(testing);

    }
}
