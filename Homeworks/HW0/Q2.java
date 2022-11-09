package HW0;

// Reference: LeetCode
// I solved a similar problem to Q2 on LeetCode and used it tools to help me better understand the problem
import java.util.*;

public class Q2 {
    // main method
    public static void main(String[] args) {
        // the given arrays from original file (HW0.java)
        int[] testResult3 = twoSum(new int[] {0, 2, 3, 4, 5}, 6);
        int[] testResult4 = twoSum(new int[] {1, 2, 3, 4, 5}, 10);

        // test results 3 should print {1, 3}
        System.out.println("Test Results 3: " + Arrays.toString(testResult3));
        // test results 4 should print {-1, -1}
        System.out.println("Test Restuls 4: " + Arrays.toString(testResult4));
    }
    
    // twoSum method
    public static int[] twoSum(int[] numbers, int targetSum) {
        // looping through array to point at first element
        for (int i = 0; i < numbers.length; i++) {
            // looping through array to point at second element
            // this ensures that the first and second element are not the same numbers
            for (int j = i + 1; j < numbers.length; j++) {
                // checking if the two numbers add up to the target number
                if (numbers[j] == targetSum - numbers[i]) {
                    // returns a new array with the first and second element
                    return new int[] {i, j};
                }
            }
        }
        // returning [-1, -1] when target sum cannot be found withing array
        return new int[] {-1, -1};
    }
}
