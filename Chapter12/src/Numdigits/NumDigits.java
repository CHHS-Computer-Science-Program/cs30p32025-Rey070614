package Numdigits;
import java.util.Scanner;
import TernarySearch.SortT;
import TernarySearch.Search;
import java.util.Scanner;


public class NumDigits {

    /**
     * Displays all elements of an integer array, one per line
     * @param array The array to be displayed
     */
    public static void displayArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");  // print each element
        }
        System.out.println("\n");
    }

    /**
     * Main demonstration method that:
     * 1. Creates an array with random numbers (-999 to 999)
     * 2. Sorts and displays the array
     * 3. Converts numbers to absolute values
     * 4. Counts total digits in all numbers
     */
    public static void digitAmt() {
        Scanner input = new Scanner(System.in);
        int amt;
        int[] numbs;
        
        // Get array size from user
        System.out.println("Enter number of elements: ");
        amt = input.nextInt();  // get number of elements from user
        
        // Create and fill array with random numbers (-999 to 999)
        numbs = new int[amt];
        for(int i = 0; i < numbs.length; i++) {
            numbs[i] = (int)(Math.random() * 1999) - 999;
        }
        
        // Display unsorted array
        System.out.println("Unsorted Array: ");
        displayArray(numbs);
        
        // Sort the array
        SortT.insertionSort(numbs);
        
        // Display sorted array
        System.out.println("Sorted Array: ");
        displayArray(numbs);
        
        // Convert to absolute values
        RecursiveMethod.AbsValue(numbs);
        
        // Count total digits
        amt = RecursiveMethod.numDigits(numbs, 0, numbs[0], 0);
        System.out.println("Total digits: " + amt);
        
        input.close();
    }

    /**
     * Program entry point
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        digitAmt();  // run the program
    }
}