package HW1;

// Reference: LeetCode, Lecture 2 PowerPoint (slides 23-26)
// I solved a similar problem to Q1 on LeetCode; I modified that code to match the pseudocode requirements
// I also used these Lecture 2 Slides to help me write my Java code from the given pseudocode

public class Q1 {
    // main method
    public static void main(String[] args) {
        // the given arrays from original file (HW1.java)
        int testResult1 = findMissing(new int[] {0, 1, 2, 4, 5});
        int testResult2 = findMissing(new int[] {5, 0, 4, 3, 1});
        int testResult3 = findMissing(new int[] {});
        int testResult4 = findMissing(new int[] {9, 3, 5, 1, 4, 8, 2, 10, 0, 6});

        // test results 1 should print 3
        System.out.println("Test Results 1: " + testResult1);
        // test results 2 should print 2
        System.out.println("Test Results 2: " + testResult2);
        // test results 3 should print 0
        System.out.println("Test Results 3: " + testResult3);
        // test results 4 should print 7
        System.out.println("Test Results 4: " + testResult4);
    }

    // findMissing meethod
    public static int findMissing(int[] a) {
        // initializing given values
        // integer array a of length n 
        int n = a.length;
        // setting sum s to 0
        int s = 0;

        // loop through each element in array
        // each array element is distinct and within range [0, n]
        for (int i = 0; i < a.length; i++) {
            // initializing s as the sum of all numbers in array a
            s = s + a[i];
        }
        // outputs value x (missing element)
        // missing element is in range [0, n] but not in array a
        // returning (n(n + 1)) / 2 - s
        return (n * (n + 1)) / 2 - s;
    }
}
