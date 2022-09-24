package HW1;

/*
Vivian Do
CSC 4520
Sep 15 2022
HW 1
*/

public class HW1 {

    public static void main(String[] args) {
      // Q1
      int testResult1 = findMissing(new int[] {0, 1, 2, 4, 5});
      System.out.println(testResult1); // should output 3
  
      int testResult2 = findMissing(new int[] {5, 0, 4, 3, 1});
      System.out.println(testResult2); // should output 2
  
      int testResult3 = findMissing(new int[] {});
      System.out.println(testResult3); // should output 0
  
      int testResult4 = findMissing(new int[] {9, 3, 5, 1, 4, 8, 2, 10, 0, 6});
      System.out.println(testResult4); // should output 7
  
  
      // Q3
      System.out.println(countFives(123467890)); // should output 0
      System.out.println(countFives(555555));    // should output 6
      System.out.println(countFives(15354));     // should output 2
  
  
      // Q4
      int testResult5 = pickTrees(new int[] {1, 2, 3, 4, 5});
      System.out.println(testResult5); // should output 9
  
      int testResult6 = pickTrees(new int[] {1, 3, 4, 3});
      System.out.println(testResult6); // should output 6
  
      int testResult7 = pickTrees(new int[] {5, 1, 4, 9});
      System.out.println(testResult7); // should output 14 
    }
    
    /**
     * Add your key ideas to this comment.
     * How did you approach the problem?
     * Why does your code work?
     */

    
    // Reference: LeetCode, Lecture 2 PowerPoint (slides 23-26)
    // I solved a similar problem to Q1 on LeetCode; I modified that code to match the pseudocode requirements
    // I also used these Lecture 2 Slides to help me write my Java code from the given pseudocode

    public static int findMissing(int[] arr) {
      //throw new UnsupportedOperationException("findMissing not yet written");

        // initializing given values
        // integer array a of length n 
        int n = arr.length;
        // setting sum s to 0
        int s = 0;

        // loop through each element in array
        // each array element is distinct and within range [0, n]
        for (int i = 0; i < arr.length; i++) {
            // initializing s as the sum of all numbers in array a
            s = s + arr[i];
        }
        // outputs value x (missing element)
        // missing element is in range [0, n] but not in array a
        // returning (n(n + 1)) / 2 - s
        return (n * (n + 1)) / 2 - s;
    }
  
    /**
     * Add your key ideas to this comment.
     * How did you approach the problem?
     * Why does your code work?
     */


    // Reference: Lecture 3 PowerPoint (slides 6-9)
    // I used these Lecture 3 Slides to help me understand recursion better
    // I also used an old code I had in CSC 1302 to find the occurance of a number within an array to help me solve this
    
    public static int countFives(int num) {
      //throw new UnsupportedOperationException("countFives not yet written");

      // initializing variable as given digit 5
      // this is set as the digit to find in num
      int five = 5;

        // checking if num is empty (base case)
        if (num == 0) {
            // returning 0 when num is empty
            return 0;
        }
        else {
            // checking if the num modulus of 10 equals digit 5
            if ((num % 10) == five) {
                // returning 1 added to the remaining digits left in recursive call
                return 1 + countFives(num / 10);
            }
        }
        // returning remaining digits left in recursive call
        return countFives(num / 10);
    }
  
    /**
     * Add your key ideas to this comment.
     * How did you approach the problem?
     * Why does your code work?
     */

    
    // Reference: LeetCode
    // I solved a similar problem on LeetCode; I changed the for-loops and iterations into recursive

    public static int pickTrees(int[] arr) {
      //throw new UnsupportedOperationException("pickTrees not yet written");
      // calling recursive function based on given array
      // num is initialized as int pointing to the first element in array (0)
      return recursive(arr, 0);
    }
    // recursive function
    public static int recursive(int[] arr, int num) {
      // checking if array is empty
      if (num >= arr.length) {
        // returning 0 when array is empty
        return 0;
      }
      else {
        // initializing separate variables
        // mainly for better organization and cleaner code

        // deadTree is the tree number and its sum of wood obtained from harvesting
        int deadTree = arr[num] + recursive(arr, num + 2);
        // aliveTree is the tree that was skipped (neighboring trees)
        int aliveTree = recursive(arr, num + 1);

        // using Math.max() compare the two values (# of wood vs # of skipped trees)
        // should return the number of wood from harvested trees
        return Math.max(deadTree, aliveTree);
      }
    }
}
