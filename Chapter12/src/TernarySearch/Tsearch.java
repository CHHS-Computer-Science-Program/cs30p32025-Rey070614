package TernarySearch;

import java.util.Scanner;

import java.util.Scanner;

/**
 * This class demonstrates array operations including:
 * - Creating and displaying arrays
 * - Sorting arrays using insertion sort
 * - Searching arrays using ternary search
 */
public class Tsearch {
    
    /**
     * Displays all elements of an integer array separated by spaces
     * @param array The array to be displayed
     */
    public static void displayArray(int[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    /**
     * Main demonstration method that:
     * 1. Creates an array with random numbers
     * 2. Sorts the array
     * 3. Allows interactive searching in the sorted array
     */
    public static void searchIntArray() {
        Search sorts = new Search();
        Scanner input = new Scanner(System.in);
        int numItems, searchNum, location;
        int[] test;
        
        System.out.println("Enter number of elements: ");
        numItems = input.nextInt();
        
        // Create and fill array with random numbers (0-100)
        test = new int[numItems];
        for(int i=0; i < test.length; i++) {
            test[i] = (int)(101 * Math.random());
        }
        
        // Show unsorted array
        System.out.println("Unsorted Array: ");
        displayArray(test);
        
        // Sort the array
        SortT.insertionSort(test);
        
        // Show sorted array
        System.out.println("Sorted Array: ");
        displayArray(test);
        
        // Interactive search loop
        System.out.print("Enter a number to search for (-1 to quit): ");
        searchNum = input.nextInt();
        
        while(searchNum != -1) {
            location = ((Search) sorts).ternarySearch(test, 0, test.length-1, searchNum);
            
            if(location >= 0) {
                System.out.println("Number at position: " + location);
            } else {
                System.out.println("Number not found");
            }
            
            System.out.print("Enter a number to search for (-1 to quit): ");
            searchNum = input.nextInt();
        }
        
        input.close();
    }

    /**
     * Program entry point
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        searchIntArray();
    }
}