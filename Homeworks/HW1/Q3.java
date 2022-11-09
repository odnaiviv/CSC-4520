package HW1;

// Reference: Lecture 3 PowerPoint (slides 6-9)
// I used these Lecture 3 Slides to help me understand recursion better
// I also used an old code I had in CSC 1302 to find the occurance of a number within an array to help me solve this

public class Q3 {
    // main method
    public static void main(String[] args) {
        // the given numbers from original file (HW1.java), printed
        // first test results should print 0
        System.out.println(countFives(123467890));
        // second test results should print 6
        System.out.println(countFives(555555));
        // third test results should print 2
        System.out.println(countFives(15354));
    }

    // countFives method
    public static int countFives(int num) {
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
}
