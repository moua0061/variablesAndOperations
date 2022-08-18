import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentNamesMenuApp {
    static Scanner scan = new Scanner(System.in);
    static List<String> students = new ArrayList<>();

    public static void main(String[] args) {

        int choice = 0;
        while (choice != 4) {
            // do top down method to create your methods
            showMenu();
            choice = getUserChoice();
            if (choice == 1) {
                printStudentNames();
            } else if (choice == 2) {
                addNewStudent();
            } else if (choice == 3) {
                deleteStudent();
            } else if (choice == 4) {
                System.out.println("goodbye!");
            } else {
                System.out.println("please select valid option");
            }
        }

    }

    public static void deleteStudent() {
        System.out.println("enter the index of the student you wish to delete:");
        int index = getUserChoice();
        if (index > students.size() || index < 0) {
            System.out.println("please enter a valid index");
        } else {
            students.remove(index);
        }
    }

    public static void addNewStudent() {
        System.out.println("enter name you would like to add: ");
        String name = scan.next();
        students.add(name);
        System.out.println("student added: " + name);
    }

    public static void printStudentNames() {
        for (String student : students) {
            System.out.println(student);
        }
    }

    public static int getUserChoice() {
        return scan.nextInt();
    }

    public static void showMenu() {
        System.out.println("Please enter the option you wish to complete:");
        System.out.println("1) print student names");
        System.out.println("2) add new student");
        System.out.println("3) delete student at position");
        System.out.println("4) exit");
        System.out.println("--------------------------------------------------");
    }
}
