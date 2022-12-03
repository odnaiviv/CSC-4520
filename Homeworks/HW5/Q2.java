package HW5;

// Reference: LeetCode
// I solved a similar problem on LeetCode with finding the minimum cost of connecting all points on a 2D-plane

public class Q2 {
    // main method
    public static void main(String[] args) {
        // using the given coordinate points from the 2D-plane
        int points = minCost(new int[][] {{1, 3}, {2, 1}, {3, 2}, {4, 3}, {4, 5}});

        // printing minimum cost results
        System.out.println("Minimum Cost: " + points);
    }

    // minCost method
    public static int minCost(int[][] points) {
        // setting current results/cost to 0
        int cost = 0;
        // getting distance from array length
        int len = points.length;
        int[] distance = new int[len];
        // initializing variable as counter for number of steps
        int next = 0;

        // setting all distances between points to infinity
        for (int i = 1; i < len; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        // looping through array
        for (int i = 1; i < len; i++) {
            // pointing towards current point
            int current = -1;
            // initializing minimum value
            int min = Integer.MAX_VALUE;

            for (int j = 1; j < len; j++) {
                // checking if distance is greater than 0
                if (distance[j] > 0) {
                    // using the manhattan distance formula to calculate the distance between two points
                    distance[j] = Math.min(distance[j], Math.abs(points[j][0] - points[next][0]) + Math.abs(points[j][1] - points[next][1]));
                    // comparing values of minimum number & value of current distance
                    if (min > distance[j]) {
                        min = distance[j];
                        // swapping current point value with distance j
                        current = j;
                    }
                }
            }
            // replacing next point with current point
            next = current;
            // resetting distance value for next point
            distance[current] = 0;
            // adding distance values to total cost
            cost += min;
        }
        // returning results
        return cost;
    }
}
