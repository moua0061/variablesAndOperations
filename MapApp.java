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

    public static void deleteContact() {
        // we want to delete by the key
        // therefore the key has to match
        System.out.println("enter phone number to delete: ");
        String phoneNumber = scan.next();

        // .remove() returns the value that was removed
        String phoneNumberToDelete = phoneBook.remove(phoneNumber);
        if (phoneNumberToDelete == null) {
            System.out.println("please enter a valid phone number that exists");
        } else {
            System.out.println("removed phone number: " + phoneNumber);
        }
    }

    public static void addContact() {
        // have user enter phone number for the key
        System.out.println("enter phone number: ");
        String phoneNumber = scan.next();

        // have user enter the name for the value
        System.out.println("enter name");
        String name = scan.next();

        // now add it to our phone book hashmap above using the .put() method
        // this method is the same as adding
        phoneBook.put(phoneNumber, name);
        System.out.println("added" + phoneNumber + " " + name);
    }

    // key = phone numbers
    // value = name
    // "123-123-1234": "Testing"
    public static void displayPhoneBook() {
        Set<String> phoneNumbers = phoneBook.keySet(); // all of our keys

        // with our keys, we need to grab all of our values:
        // for each key, i want to grab each value
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
        System.out.println("4) exit");
        System.out.println("-----------------------------");
    }
}
