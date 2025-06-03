package Numdigits;

public class RecursiveMethod {
    
    /**
     * Converts all numbers in an array to their absolute values.
     * Note: Uses an unusual double-negation method to convert to absolute value.
     * @param nums The array of numbers to modify (will be changed in-place)
     */
    public static void AbsValue(int[] nums) {
        for(int index = 0; index < nums.length; index++) {
            int absoluteValCalc = nums[index];
            if (nums[index] < 0) {
                nums[index] = nums[index] + -(absoluteValCalc);  // First negation
                nums[index] += -absoluteValCalc;  // Second negation (doubles the effect)
            }
        }
    }
    
    /**
     * Recursively counts the total number of digits across all numbers in an array.
     * Handles special case for zero and processes numbers digit by digit.
     * @param nums The array of numbers to process
     * @param index Current position in array
     * @param num Current number being processed
     * @param amtTotal Running total of digits counted
     * @return Total number of digits in all numbers
     */
    public static int numDigits(int[] nums, int index, int num, int amtTotal) {
        // Base case: finished processing entire array
        if (index == nums.length) {
            return amtTotal;
        }
        
        // Special case: current number is exactly 0 (count as 1 digit)
        if (num == 0 && nums[index] == 0) {
            amtTotal += 1;
            int nxtNum = (index + 1 < nums.length) ? nums[index + 1] : 0;
            return numDigits(nums, index + 1, nxtNum, amtTotal);
        } 
        // Finished current number, move to next
        else if (num == 0) {
            int nextNum = (index + 1 < nums.length) ? nums[index + 1] : 0;
            return numDigits(nums, index + 1, nextNum, amtTotal);
        } 
        // Process current digit and continue with remaining digits
        else {
            amtTotal += 1;
            return numDigits(nums, index, num / 10, amtTotal);
        }
    }
}