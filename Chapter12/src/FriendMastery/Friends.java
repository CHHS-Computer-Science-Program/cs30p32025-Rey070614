package FriendMastery;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Main application class for managing a friends database.
 * Provides a menu-driven interface for CRUD operations on friends.
 */
public class Friends {
    // Constants for menu options
    private static final int LIST_FRIENDS = 1;
    private static final int ADD_FRIEND = 2;
    private static final int REMOVE_FRIEND = 3;
    private static final int FIND_FRIEND = 4;
    private static final int EXIT = 0;
    
    // Constants for sort order
    private static final int SORT_BY_FIRST_NAME = 0;
    private static final int SORT_BY_LAST_NAME = 1;

    /**
     * Main method that runs the friends management application.
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Database friendsDatabase = new Database();
        Scanner input = new Scanner(System.in);
        int choice;
        
        // Display menu and process user input until they choose to exit
        do {
            displayMenu();
            choice = getValidIntegerInput(input);
            
            switch (choice) {
                case LIST_FRIENDS:
                    handleListFriends(friendsDatabase, input);
                    break;
                case ADD_FRIEND:
                    friendsDatabase.addFriend();
                    break;
                case REMOVE_FRIEND:
                    handleRemoveFriend(friendsDatabase, input);
                    break;
                case FIND_FRIEND:
                    handleFindFriend(friendsDatabase, input);
                    break;
                case EXIT:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != EXIT);
        
        // Save data before exiting
        friendsDatabase.update();
        input.close();
    }

    /**
     * Displays the main menu options to the user.
     */
    private static void displayMenu() {
        System.out.println("\n==== Friends Database Menu ====");
        System.out.println(LIST_FRIENDS + ". List Friends");
        System.out.println(ADD_FRIEND + ". Add a friend");
        System.out.println(REMOVE_FRIEND + ". Remove a friend");
        System.out.println(FIND_FRIEND + ". Find a friend");
        System.out.println(EXIT + ". Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     * Handles the list friends operation with sorting option.
     * @param database The friends database
     * @param input Scanner for user input
     */
    private static void handleListFriends(Database database, Scanner input) {
        System.out.println("\nSort by: ");
        System.out.println(SORT_BY_FIRST_NAME + ". First Name");
        System.out.println(SORT_BY_LAST_NAME + ". Last Name");
        System.out.print("Enter your choice: ");
        
        int sortOrder = getValidIntegerInput(input);
        database.displayFriends(sortOrder);
    }

    /**
     * Handles the remove friend operation by getting name input.
     * @param database The friends database
     * @param input Scanner for user input
     */
    private static void handleRemoveFriend(Database database, Scanner input) {
        System.out.println("Enter friend's details to remove:");
        String[] names = getFriendNames(input);
        database.deleteFriend(names[0], names[1]);
    }

    /**
     * Handles the find friend operation by getting name input.
     * @param database The friends database
     * @param input Scanner for user input
     */
    private static void handleFindFriend(Database database, Scanner input) {
        System.out.println("Enter friend's details to find:");
        String[] names = getFriendNames(input);
        database.findFriend(names[0], names[1]);
    }

    /**
     * Gets a friend's first and last name from user input.
     * @param input Scanner for user input
     * @return Array containing first name and last name
     */
    private static String[] getFriendNames(Scanner input) {
        System.out.print("First name: ");
        String firstName = input.nextLine().trim();
        
        System.out.print("Last name: ");
        String lastName = input.nextLine().trim();
        
        return new String[]{firstName, lastName};
    }

    /**
     * Gets and validates integer input from the user.
     * @param input Scanner for user input
     * @return Valid integer entered by the user
     */
    private static int getValidIntegerInput(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            input.next(); // consume the invalid input
        }
        int number = input.nextInt();
        input.nextLine(); // consume the leftover newline
        return number;
    }
}