package FriendMastery;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to manage a database of Friend objects with CRUD operations
 * and persistent storage in a file.
 */
public class Database {
	
	Sort selectionSorter = new Sort();
    
    private ArrayList<ComparableNames> friends;  // List to store all Friend objects
    private int numFriends;            // Counter for number of friends
    private final File friendsFile;     // File for persistent storage
    
    // Hardcoded file path - consider making this configurable
    private static final String DEFAULT_FILE_PATH = 
        "C:\\Users\\27165005\\git\\cs30p32025-Rey070614\\Chapter12\\src\\friendstext";

    /**
     * Constructor initializes the database and loads existing friends from file.
     */
    public Database() {
        this.friends = new ArrayList<>();
        this.friendsFile = new File(DEFAULT_FILE_PATH);
        loadFriendsFromFile();
    }

    /**
     * Loads friend data from the storage file if it exists and is not empty.
     */
    private void loadFriendsFromFile() {
        if (!friendsFile.exists() || friendsFile.length() == 0) {
            System.out.println("There are no existing friend records in your database.");
            numFriends = 0;
            return;
        }

        try (FileInputStream in = new FileInputStream(friendsFile);
             ObjectInputStream readFriends = new ObjectInputStream(in)) {
            
            numFriends = readFriends.readInt();
            
            // Read all Friend objects from the file
            for (int i = 0; i < numFriends; i++) {
                Friend aFriend = (Friend) readFriends.readObject();
                friends.add(aFriend);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: Database file could not be found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: Problem with file input/output: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Friend class could not be found: " + e.getMessage());
        }
    }

    /**
     * Adds a new friend to the database by prompting user for information.
     */
    public void addFriend() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Friend you want to add and their information.");
        
        System.out.println("What is your friend's first name?");
        String fName = input.nextLine().trim();
        
        System.out.println("What is your friend's last name?");
        String lName = input.nextLine().trim();
        
        System.out.println("What is your friend's phone number?");
        String phone = input.nextLine().trim();
        
        System.out.println("What is your friend's email?");
        String email = input.nextLine().trim();
        
        // Create and add the new friend
        Friend newFriend = new Friend(lName, fName, phone, email);
        friends.add(newFriend);
        numFriends++;
        
        System.out.println("Friend added successfully.");
    }

    /**
     * Deletes a friend from the database by first and last name.
     * @param fName First name of friend to delete
     * @param lName Last name of friend to delete
     */
    public void deleteFriend(String fName,String lName) {
        Friend friendToDelete = new Friend(fName, lName);
        int index = friends.indexOf(friendToDelete);
        
        if (index >= 0) {
            friends.remove(index);
            numFriends--;
            System.out.println("Friend successfully removed from the database.");
        } else {
            System.out.println("Error: The specified friend does not exist in the database.");
        }
    }

    /**
     * Displays all friends sorted by either first or last name.
     * @param order 1 to sort by last name, any other value for first name
     */
    public void displayFriends(int order) 
    {
        
        Friend retriev;
        
        if (order == 1) 
        {
            selectionSorter.sortByLastName(friends);  // Sort by last name
            System.out.println("\nFriends sorted by last name:");
            for (int frD = 0; frD < friends.size(); frD++) 
            {
                retriev = (Friend) friends.get(frD);
                System.out.println(retriev);
            }
        } 
        else {
            selectionSorter.sortByFirstName(friends);  // Sort by first name
            System.out.println("\nFriends sorted by first name:");
            for (int frD = 0; frD < friends.size(); frD++) 
            {
                retriev = (Friend) friends.get(frD);
                System.out.println(retriev);
            }
        }
    }

    /**
     * Finds and displays a friend's information by name.
     * @param fName First name to search for
     * @param lName Last name to search for
     */
    public void findFriend(String fName, String lName) {
        Friend searchFriend = new Friend(fName, lName);
        int index = friends.indexOf(searchFriend);
        
        if (index >= 0) {
            Friend foundFriend = (Friend)friends.get(index);
            System.out.println("Friend found:\n" + foundFriend);
        } else {
            System.out.println("Error: The specified friend does not exist in the database.");
        }
    }

    /**
     * Saves all friends to the persistent storage file.
     */
    public void update() {
    	 
    	
        try (FileOutputStream out = new FileOutputStream(friendsFile);
             ObjectOutputStream writeFriends = new ObjectOutputStream(out)) { 
        	 Friend retriev = null;
            writeFriends.writeInt(numFriends);
            for (int frD = 0; frD < friends.size(); frD++) 
                retriev = (Friend) friends.get(frD);
            	writeFriends.writeObject(retriev);
            	
           
            
            System.out.println("Database successfully updated.");
            
    }	catch (FileNotFoundException e) {
            System.err.println("Error: Database file could not be created: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: Problem saving to database: " + e.getMessage());
        }
    }}
