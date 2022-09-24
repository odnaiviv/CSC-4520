package HW1;

// Reference: LeetCode
// I solved a similar problem on LeetCode; I changed the for-loops and iterations into recursive

public class Q4 {    
    // main method
    public static void main(String[] args) {
        // the given arrays from original file (HW1.java)
        int testResult5 = pickTrees(new int[] {1, 2, 3, 4, 5});
        int testResult6 = pickTrees(new int[] {1, 3, 4, 3});
        int testResult7 = pickTrees(new int[] {5, 1, 4, 9});

        // test results 5 should print 9
        System.out.println("Test Results 5: " + testResult5);
        // test results 6 should print 6
        System.out.println("Test Results 6: " + testResult6);
        // test results 7 should print 14
        System.out.println("Test Results 7: " + testResult7);
    }

    // pickTrees method
    public static int pickTrees(int[] array) {
        // calling recursive function based on given array
        // num is initialized as int pointing to the first element in array (0)
        return recursive(array, 0);
    }
    // recursive function
    public static int recursive(int[] array, int num) {
        // checking if array is empty
        if (num >= array.length) {
            // returning 0 when array is empty
            return 0;
        }
        else {
            // initializing separate variables
            // mainly for better organization and cleaner code

            // deadTree is the tree number and its sum of wood obtained from harvesting
            int deadTree = array[num] + recursive(array, num + 2);
            // aliveTree is the tree that was skipped (neighboring trees)
            int aliveTree = recursive(array, num + 1);

            // using Math.max() compare the two values (# of wood vs # of skipped trees)
            // should return the number of wood from harvested trees
            return Math.max(deadTree, aliveTree);
        }
    }
}
