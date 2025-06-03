package TernarySearch;

public class Search {
    
    /**
     * Performs ternary search on a sorted array to find the goal value.
     * 
     * @param items The sorted array to search through (must be in ascending order)
     * @param start The starting index of the search range
     * @param end The ending index of the search range
     * @param goal The value to search for
     * @return Index of the goal value if found, -1 otherwise
     */
    public static int ternarySearch(int[] items, int start, int end, int goal) {
        // Base case: search range is invalid (value not found)
        if (start > end) {
            return -1;
        }

        // Calculate the two midpoints that divide the range into thirds
        int mid1 = start + (end - start) / 3;
        int mid2 = end - (end - start) / 3;
        
        // Debug output to show search progress
        System.out.println("Examining range [" + start + "-" + end + "]");
        System.out.println("Midpoints: " + mid1 + ", " + mid2);

        if (goal == items[mid1]) {
            return mid1;  // Found at first midpoint
        } 
        else if (goal == items[mid2]) {
            return mid2;  // Found at second midpoint
        }
        // Determine which third to search next
        else if (goal < items[mid1]) {
            // Search left third (before mid1)
            return ternarySearch(items, start, mid1 - 1, goal);
        } 
        else if (goal > items[mid2]) {
            // Search right third (after mid2)
            return ternarySearch(items, mid2 + 1, end, goal);
        }
        else {
            // Search middle third (between mid1 and mid2)
            return ternarySearch(items, mid1 + 1, mid2 - 1, goal);
        }
    }

    /**
     * Helper method to perform ternary search on the entire array.
     * 
     * @param items The sorted array to search
     * @param goal The value to find
     * @return Index of the goal value if found, -1 otherwise
     */
    public static int search(int[] items, int goal) {
        return ternarySearch(items, 0, items.length - 1, goal);
    }
}