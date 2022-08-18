import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        ArrayList<String> sports = new ArrayList<>();
        sports.add("football");
        sports.add("basketball");
        sports.add("volleyball");
        sports.remove(0);

        System.out.println(sports);

        // for (int i = 0; i < sports.size(); i++) {
        // System.out.println(sports.get(i));
        // }

        // for (String sport : sports) {
        // System.out.println(sport);
        // }

        // don't forget to import List from java.util
        List<Integer> test = new ArrayList<Integer>();
        test.add(3);
        test.add(5);

        System.out.println(test);
        System.out.println(test.isEmpty());
    }
}
