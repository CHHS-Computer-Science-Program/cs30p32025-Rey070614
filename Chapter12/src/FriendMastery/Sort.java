package FriendMastery;
import java.util.ArrayList;

/**
 * Utility class for sorting Friend objects using selection sort algorithm.
 */
public class Sort {
    
    /**
     * Sorts a list of ComparableNames by first name in ascending order.
     * Uses selection sort algorithm.
     * 
     * @param friends List of items to sort (must implement ComparableNames)
     * @throws ClassCastException if items don't implement ComparableNames
     */
    public static void sortByFirstName(ArrayList<ComparableNames> friends) {
        if (friends == null || friends.size() <= 1) {
            return; // No sorting needed for empty or single-element lists
        }

        for (int i = 0; i < friends.size(); i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < friends.size(); j++) {
                ComparableNames current = friends.get(j);
                ComparableNames min = friends.get(minIndex);
                
                if (current.compareToFirstName(min) < 0) {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                swap(friends, i, minIndex);
            }
        }
    }

    /**
     * Sorts a list of ComparableNames by last name in ascending order.
     * Uses selection sort algorithm.
     * 
     * @param friends List of items to sort (must implement ComparableNames)
     * @throws ClassCastException if items don't implement ComparableNames
     */
    public static void sortByLastName(ArrayList<ComparableNames> friends) {
        if (friends == null || friends.size() <= 1) {
            return; // No sorting needed for empty or single-element lists
        }

        for (int i = 0; i < friends.size(); i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < friends.size(); j++) {
                ComparableNames current = friends.get(j);
                ComparableNames min = friends.get(minIndex);
                
                if (current.compareToLastName(min) < 0) {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                swap(friends, i, minIndex);
            }
        }
    }

    /**
     * Helper method to swap two elements in a list.
     * 
     * @param list The list containing elements to swap
     * @param index1 First index to swap
     * @param index2 Second index to swap
     */
    private static void swap(ArrayList<ComparableNames> list, int index1, int index2) {
        ComparableNames temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

	
}