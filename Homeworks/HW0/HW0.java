package HW0;

/*
Vivian Do
CSC 4520
Sep 06 2022
HW 0
*/

import java.util.*;

public class HW0 {

  public static void main(String[] args) {
    // Q1
    int testResult1 = maxOfArray(new int[] {1, 3, 4, 5, 2});
    int testResult2 = maxOfArray(new int[] {-1, -3, -4, -5, -2});

    System.out.println(testResult1); // should output 5
    System.out.println(testResult2); // should output -1
    boolean emptyCaseCorrect = false;
    try {
      maxOfArray(new int[] {});
    } catch (IllegalArgumentException e) {
      emptyCaseCorrect = true;
    }
    if (emptyCaseCorrect) {
      System.out.println("maxOfArray appears to work for the empty array case");
    } else {
      System.out.println("maxOfArray appears to be incorrect for the empty array case");
    }


    // Q2
    int[] testResult3 = twoSum(new int[] {0, 2, 3, 4, 5}, 6);
    int[] testResult4 = twoSum(new int[] {1, 2, 3, 4, 5}, 10);

    System.out.println(Arrays.toString(testResult3)); // should output [1, 3]
    System.out.println(Arrays.toString(testResult4)); // should output [-1, -1]


    // Q3
    List<Integer> testResult5 = add(Arrays.asList(1, 2, 3), Arrays.asList(2, 4, 2));
    List<Integer> testResult6 = add(Arrays.asList(9, 9, 9), Arrays.asList(1));
    List<Integer> testResult7 = add(Arrays.asList(9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 7, 5, 8, 0, 7), Arrays.asList(1, 2, 3, 4, 5));

    System.out.println(testResult5); // should output [3, 6, 5]
    System.out.println(testResult6); // should output [1, 0, 0, 0]
    System.out.println(testResult7); // should output [9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 8, 8, 1, 5, 2]
  }

  /**
   * Add your key ideas to this comment.
   * How did you approach the problem?
   * Why does your code work?
   */


  // Reference: Lecture 2 PowerPoint (slides 18-22)
  // I used the Lecture 2 Slides which guided me with finding the maximum number

  public static int maxOfArray(int[] arr) {
    //throw new UnsupportedOperationException("maxOfArray not yet written");

        // initializing an element in array
        // this points to the max number
        int max = arr[0];
        // looping through every element
        for (int i = 1; i < arr.length; i++) {
            // comparing every element with max number
            if (arr[i] > max) {
                // setting max as the highest number
                // which is pointed to its array element
                max = arr[i];
            }
        }
        // returns max number
        return max;
  }

  /**
   * Add your key ideas to this comment.
   * How did you approach the problem?
   * Why does your code work?
   */


  // Reference: LeetCode
  // I solved a similar problem to Q2 on LeetCode and used it tools to help me better understand the problem
  public static int[] twoSum(int[] arr, int targetSum) {
    //throw new UnsupportedOperationException("twoSum not yet written");

    // looping through array to point at first element
    for (int i = 0; i < arr.length; i++) {
      // looping through array to point at second element
      // this ensures that the first and second element are not the same numbers
      for (int j = i + 1; j < arr.length; j++) {
          // checking if the two numbers add up to the target number
          if (arr[j] == targetSum - arr[i]) {
              // returns a new array with the first and second element
              return new int[] {i, j};
          }
      }
  }
  // returning [-1, -1] when target sum cannot be found withing array
  return new int[] {-1, -1};
  }

  /**
   * Add your key ideas to this comment.
   * How did you approach the problem?
   * Why does your code work?
   */

  
   // Reference: LeetCode
   // I solved a similar problem to Q3 on LeetCode and used it tools to help me better understand the problem

  public static List<Integer> add(List<Integer> lst1, List<Integer> lst2) {
    //throw new UnsupportedOperationException("add not yet written");

    // initializing carry value
    int carry = 0;
    // creating new array list that stores current results of the calculations
    List<Integer> current = new ArrayList<Integer>();

    // getting the numeric length of each array/list
    int len1 = lst1.size() - 1;
    int len2 = lst2.size() - 1;

    // looping to check for zeroes in both array lengths
    while (len1 >= 0 && len2 >= 0) {
        // getting the sum of the array list
        // and putting it in current
        current.add(lst1.get(len1) + lst2.get(len2) + carry);
        // updating carry with sum / 10
        carry = (lst1.get(len1) + lst2.get(len2) + carry) / 10;
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
