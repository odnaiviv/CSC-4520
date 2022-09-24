package HW0;

// Reference: Lecture 2 PowerPoint (slides 18-22)
// I used these Lecture 2 Slides which guided me with finding the maximum number

public class Q1 {
    // main method
    public static void main(String[] args) {
        // the given arrays from original file (HW0.java)
        int testResult1 = maxOfArray(new int[] {1, 3, 4, 5, 2});
        int testResult2 = maxOfArray(new int[] {-1, -3, -4, -5, -2});

        // test results 1 should print 5
        System.out.println("Test Results 1: " + testResult1);
        // test results 2 should print -1
        System.out.println("Test Restuls 2: " + testResult2);
    }

    // maxOfArray method
    public static int maxOfArray(int[] array) {
        // initializing an element in array
        // this points to the max number
        int max = array[0];

        // looping through every element
        for (int i = 1; i < array.length; i++) {
            // comparing every element with max number
            if (array[i] > max) {
                // setting max as the highest number
                // which is pointed to its array element
                max = array[i];
            }
        }
        // returns max number
        return max;
    }
}
