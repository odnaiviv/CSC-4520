package HW4;

// Reference: Lecture 14 PowerPoint (slides 8-16)
// I used these Lecture 14 Slides to help me build my DFS algorithm

public class Q3D {
    // main method
    public static void main(String[] args) {
        // creating new graph with 5 vertices/nodes
        Graph graph = new Graph(5);

        // adding edges to graph
        graph.addEdges(1, 0);
        graph.addEdges(1, 2);
        graph.addEdges(1, 4);
        graph.addEdges(2, 0);
        graph.addEdges(3, 0);
        graph.addEdges(4, 3);

        // calling dfs method to show all traversal orders
        // this is the traversal orders for all nodes
        System.out.print("DFS 0: ");
        DFS(graph, 0);

        System.out.print("DFS 1: ");
        DFS(graph, 1);

        System.out.print("DFS 2: ");
        DFS(graph, 2);

        System.out.print("DFS 3: ");
        DFS(graph, 3);

        System.out.print("DFS 4: ");
        DFS(graph, 4);
    }


    // depth first search method
    public static void DFS(Graph graph, int start) {
        // creating new array for visited vertices/nodes
        int[] visited = new int[graph.vertex];
        // loop to check verticies
        for (int i = 0; i < graph.vertex; i++) {
            visited[i] = 0;
        }
        
        // calling method to check for visited vertices/nodes
        checkVertices(graph, start, visited);
        for (int i = 0; i < graph.vertex; i++) {
            if (visited[i] != 1) {
                // recursivly calls method again to check for vertices/nodes
                // this also prints the traversal order of vertices/nodes
                checkVertices(graph, i, visited);
            }
        }
        System.out.println();
    }

    // method to check for visited vertices/nodes
    public static void checkVertices (Graph graph, int v, int[] visited) {
        // prints vertices/nodes
        System.out.print(v + " ");
        visited[v] = 1;
        // loop to go through vertices/nodes
        for (int i = 0; i < graph.vertex; i++) {
            // checking if current vertex has been visited or not
            if (graph.matrix[v][i] == 1 && visited[i] != 1) {
                // recursivly calls method again to check for vertices/nodes
                checkVertices(graph, v, visited);
            }
        }
    }
}
