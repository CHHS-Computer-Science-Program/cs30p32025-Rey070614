package Mastery;


import java.io.*;

public class CountVowels {
    public static void main(String[] args) {
        File textFile;
        FileReader in;
        BufferedReader readFile;
        String fileName;
        String lineInFile, lowercaseText;
        int vowelSum = 0;
        
        // Prompt the user for the name of the file
        System.out.print("Enter the file name, relative to the project directery (cap sensitve): ");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileName = userInput.readLine();
            textFile = new File("../Chapter11/src/Mastery/" + fileName);
            
            // Check if the file exists before proceeding
            if (!textFile.exists()) {
                System.out.println("File does not exist.");
                return;
            }
            
            // Initialize the FileReader and BufferedReader to read the file
            in = new FileReader(textFile);
            readFile = new BufferedReader(in);
            
            // Read each line of the file
            while ((lineInFile = readFile.readLine()) != null) {
                // Convert line to lowercase
                lowercaseText = lineInFile.toLowerCase();
                
                // Iterate through each character in the line
                for (int i = 0; i < lowercaseText.length(); i++) {
                    String letter = String.valueOf(lowercaseText.charAt(i));
                    
                    // Check if the character is a vowel
                    if ("aeiou".contains(letter)) {
                        vowelSum++;
                    }
                }
            }
            
            // Print the total number of vowels found
            System.out.println("Total vowels in the file: " + vowelSum);
            
            // Close the BufferedReader and FileReader objects
            readFile.close();
            in.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } 
        catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
