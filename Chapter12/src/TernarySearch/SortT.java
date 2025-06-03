package TernarySearch;

import java.util.ArrayList;

import java.util.ArrayList;


public class SortT {

    /**
     * Sorts an ArrayList of Doubles using selection sort algorithm.
     * Selection sort works by repeatedly finding the minimum element from the
     * unsorted part and putting it at the beginning.
     * 
     * @param items The ArrayList of Doubles to be sorted
     */
    public static void selectionSort(ArrayList<Double> items) {
        // Early return if list is empty or has only one element
        if (items == null || items.size() <= 1) {
            return;
        }

        for (int i = 0; i < items.size() - 1; i++) {
            // Assume current position is the minimum
            int minIndex = i;
            
            // Find the index of the minimum element in remaining unsorted array
            for (int j = i + 1; j < items.size(); j++) {
                if (items.get(j) < items.get(minIndex)) {
                    minIndex = j;
                }
            }
            
            // Swap if we found a smaller element
            if (minIndex != i) {
                Double temp = items.get(i);
                items.set(i, items.get(minIndex));
                items.set(minIndex, temp);
            }
        }
    }

    /**
     * Sorts an integer array using merge sort algorithm (recursive implementation).
     * Merge sort divides the array into halves, sorts them, and then merges them.
     * 
     * @param items The array to be sorted
     * @param start The starting index of the subarray to sort
     * @param end The ending index of the subarray to sort
     */
    public static void mergeSort(int[] items, int start, int end) {
        if (start < end) {
            // Find middle point
            int mid = start + (end - start) / 2;

            // Sort first and second halves
            mergeSort(items, start, mid);
            mergeSort(items, mid + 1, end);

            // Merge the sorted halves
            merge(items, start, mid, end);
        }
    }

    /**
     * Helper method to merge two sorted subarrays into one sorted array.
     * 
     * @param items The array containing subarrays to merge
     * @param start Start index of first subarray
     * @param mid End index of first subarray and start-1 of second
     * @param end End index of second subarray
     */
    private static void merge(int[] items, int start, int mid, int end) {
        // Create temporary array for merging
        int[] temp = new int[end - start + 1];
        int i = start;    // Initial index of first subarray
        int j = mid + 1;   // Initial index of second subarray
        int k = 0;         // Initial index of merged temp array

        // Merge by comparing elements from both subarrays
        while (i <= mid && j <= end) {
            if (items[i] <= items[j]) {
                temp[k++] = items[i++];
            } else {
                temp[k++] = items[j++];
            }
        }

        // Copy remaining elements from first subarray if any
        while (i <= mid) {
            temp[k++] = items[i++];
        }

        // Copy remaining elements from second subarray if any
        while (j <= end) {
            temp[k++] = items[j++];
        }

        // Copy merged elements back to original array
        System.arraycopy(temp, 0, items, start, temp.length);
    }

    /**
     * Sorts an integer array using insertion sort algorithm.
     * Insertion sort builds the final sorted array one item at a time.
     * 
     * @param items The array to be sorted
     */
    public static void insertionSort(int[] items) {
        if (items == null || items.length <= 1) {
            return;
        }

        for (int i = 1; i < items.length; i++) {
            int current = items[i];
            int j = i - 1;

            // Shift elements greater than current to the right
            while (j >= 0 && items[j] > current) {
                items[j + 1] = items[j];
                j--;
            }
            
            // Insert current in its correct position
            items[j + 1] = current;
        }
    }
}
