package HW4;

// Reference: LeetCode
// I solved a similar problem on LeetCode with Trees and Binary Search Trees, and this help me build my Graph

public class Graph {
    // initializing variables
    public int[][] matrix;
    public int vertex;

    // creating the graph
    public Graph(int v) {
        // putting variables in matrix graph
        vertex = v;
        matrix = new int[v][v];
        
        // loops to put variables in matrix graph
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    // adding edges to graph
    public void addEdges(int u, int v) {
        matrix[u][v] = 1;
    }
}
