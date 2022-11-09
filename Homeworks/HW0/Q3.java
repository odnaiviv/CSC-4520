package HW0;

// Reference: LeetCode
// I solved a similar problem to Q3 on LeetCode and used it tools to help me better understand the problem
import java.util.*;

public class Q3 {
    // main method
    public static void main(String[] args) {
        List<Integer> testResult5 = add(Arrays.asList(1, 2, 3), Arrays.asList(2, 4, 2));
        List<Integer> testResult6 = add(Arrays.asList(9, 9, 9), Arrays.asList(1));
        //List<Integer> testResult7 = add(Arrays.asList(9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 7, 5, 8, 0, 7), Arrays.asList(1, 2, 3, 4, 5));

        // test results 5 should print [3, 6, 5]
        System.out.println("Test Results 5: " + testResult5);
        // test results 6 should print [1, 0, 0, 0]
        System.out.println("Test Results 6: " + testResult6);
        // test results 7 should print [9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 8, 8, 1, 5, 2]
        //System.out.println("Test Results 7: " + testResult7);
    }
    // add method
    public static List<Integer> add(List<Integer>list1, List<Integer> list2) {
        // initializing carry value
        int carry = 0;
        // creating new array list that stores current results of the calculations
        List<Integer> current = new ArrayList<Integer>();

        // getting the numeric length of each array/list
        int len1 = list1.size() - 1;
        int len2 = list2.size() - 1;

        // looping to check for zeroes in both array lengths
        while (len1 >= 0 && len2 >= 0) {
            // getting the sum of the array list
            // and putting it in current
            current.add(list1.get(len1) + list2.get(len2) + carry);
            // updating carry with sum / 10
            carry = (list1.get(len1) + list2.get(len2) + carry) / 10;
            // decrementing until both lists reaches zero
            len1--;
            len2--;
        }

        // checking if a number needed to be carry over
        if (carry != 0)
        // adding carry value into current sum
            current.add(carry);
            // creating new array list that stores new array
            // this will be the outputted array
            List<Integer> results = new ArrayList<Integer>();
            // looping through each element of current array list
            for (len1 = current.size() - 1; len1 >= 0; len1--) {
                // adding all current values into results array
                // this should put all the elements back in order
                results.add(current.get(len1));
            }
            // returning the results of carry added to current array list
        return results;
    }
}
