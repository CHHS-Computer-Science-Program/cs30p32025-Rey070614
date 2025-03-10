package Mastery;
import java.io.*;
import java.util.*;

public class WordGuessing {
    public static void main(String[] args) {
        // Declare necessary objects and variables
        
    	File file = new File("../Chapter11/src/Mastery/Words");  // File path for the list of words
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        Random random = new Random();  // Random object to generate random numbers
        int numWords, wordToGuess;  // numWords holds the number of words in the file, wordToGuess will hold the index of the chosen word
        String secretWord = "";  // To store the word to be guessed
        String wordSoFar = "", updatedWord = "";  // wordSoFar stores the partially guessed word, updatedWord is used for building the new word state
        String letterGuess, wordGuess = "";  // letterGuess is for each letter input by the user, wordGuess is for full word guesses (not used here)
        int numGuesses = 0;  // Counter to track the number of guesses made
        final String FLAG = "QUIT";  // A flag used to exit the game when the player types 'QUIT'

        // Try to read words from the file and select a random word
        try {
            // Initialize file reader and buffered reader objects to read from the file
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            // Get the number of words in the file
            List<String> words = new ArrayList<>();  // List to store the words read from the file
            while ((secretWord = bufferedReader.readLine()) != null) {
                words.add(secretWord.trim());  // Add each word to the list, trimming any leading/trailing spaces
            }
            numWords = words.size();  // Set the number of words

            // Select a random word from the list
            wordToGuess = random.nextInt(numWords);  // Randomly pick an index from the list of words

            // Set the secret word from the list
            secretWord = words.get(wordToGuess).toUpperCase();  // Convert the secret word to uppercase for consistency

            // Close the bufferedReader and fileReader
            bufferedReader.close();
            fileReader.close();
            
        } catch (IOException e) {
            // If there is an error reading the file, print the error message and exit
            System.out.println("Error reading the file.");
            e.printStackTrace();
            return;  // Exit if there's an error
        }

        // Begin the game
        System.out.println("WordGuess game.\n");

        // Initialize wordSoFar with dashes based on the length of the secret word
        for (int i = 0; i < secretWord.length(); i++) {
            wordSoFar += "-";  // Represent the hidden word with dashes
        }
        System.out.println("Word to guess: " + wordSoFar);  // Display the initial hidden word

        // Allow player to make guesses
        Scanner scanner = new Scanner(System.in);  // Scanner object to read user input

        // Start the game loop
        do {
            // Ask the user to guess a letter or type 'quit' to exit
            System.out.print("Guess a letter or type 'quit' to exit: ");
            letterGuess = scanner.nextLine().trim().toUpperCase();  // Read input, trim spaces, and convert to uppercase

            if (letterGuess.equals(FLAG)) {
                break;  // Exit the game if the user types 'quit'
            }

            if (letterGuess.length() == 1) {  // Check if the input is a single character
                numGuesses++;  // Increment the number of guesses made

                // Check if the guessed letter is in the secret word
                updatedWord = "";  // Reset the updatedWord for this guess
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == letterGuess.charAt(0)) {
                        updatedWord += letterGuess;  // Correct letter guessed, reveal it in the updated word
                    } else {
                        updatedWord += wordSoFar.charAt(i);  // Keep previous letters unchanged
                    }
                }

                wordSoFar = updatedWord;  // Update the wordSoFar to reflect the guessed letters
                System.out.println("Current word: " + wordSoFar);  // Display the current state of the word

            } else {
                System.out.println("Please enter only one letter.");  // If the input is not a single letter, prompt the user to try again
            }

        } while (!wordSoFar.equals(secretWord));  // Continue the loop until the word is fully guessed

        // Finish the game
        if (wordSoFar.equals(secretWord)) {
            System.out.println("Congratulations! You've guessed the word!");  // Player won, reveal success message
        } else {
            System.out.println("Game Over. The word was: " + secretWord);  // If the loop ends, the player failed to guess the word in time
        }

        System.out.println("Total guesses: " + numGuesses);  // Display the total number of guesses made
        scanner.close();  // Close the scanner object to prevent memory leaks
    }
}
