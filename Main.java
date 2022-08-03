import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        String parsedStringToInteger = "75";
        int y = Integer.parseInt(parsedStringToInteger);
        // System.out.println(parsedStringToInteger);
        // System.out.println(y);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        for (int i = 1; i < list.size(); i++) {
            int sum = i % 2;
            // String parsedSum = Integer.toString(sum);
            // System.out.println(parsedSum);
            list.add(i);
        }
        System.out.println(list);

        try {
            Scanner in = new Scanner(new File("input.txt"));
            while (in.hasNext()) {
                String name = in.nextLine();
                // System.out.println("what is name: " + name);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found. Please enter a correct file name.");
        } finally {
            System.exit(0);
        }
    }

    // JFrame.setLookAndFeelDecorated(false);
    JPanel panel1 = new JPanel();
    JFrame frame = new JFrame();

}