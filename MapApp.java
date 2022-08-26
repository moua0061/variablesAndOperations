import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapApp {
    static Scanner scan = new Scanner(System.in);
    static Map<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 4) {
            printMenu();
            choice = getUserChoice();
            if (choice == 1) {
                displayPhoneBook();
            } else if (choice == 2) {
                addContact();
            } else if (choice == 3) {
                deleteContact();
            } else if (choice == 4) {
                System.out.println("goodbye!");
            } else {
                System.out.println("please pick a valid option");
            }
        }

    }

    public static void displayPhoneBook() {
        Set<String> phoneNumbers = phoneBook.keySet();
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber + " " + phoneBook.get(phoneNumber));
        }
    }

    public static int getUserChoice() {
        return scan.nextInt();
    }

    public static void printMenu() {
        System.out.println("1) display phone book");
        System.out.println("2) add new contact");
        System.out.println("3) delete contact");
        System.out.println("-----------------------------");
    }
}
