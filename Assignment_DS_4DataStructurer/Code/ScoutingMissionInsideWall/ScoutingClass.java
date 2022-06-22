package ScoutingMissionInsideWall;

public class ScoutingClass {

    final int totalVertex = 16; // total number of nodes inside the map
    int[] path;

    /**
     * Utility function to check if the "int vertex" can be added to the index
     * "int position" that are stored in array "int[] path"
     */
    public boolean isGood(int vertex, int graph[][], int[] path, int position) {
        /**
         * First criteria: To check if the vertex is an adjacent vertex of the
         * previous vertex
         */
        if (graph[path[position - 1]][vertex] == 0) {
            return false;
        }

        /**
         * Second criteria: To check if the vertex already included
         */
        for (int i = 0; i < position; i++) {
            if (path[i] == vertex) {
                return false;
            }
        }

        return true;
    }

    /**
     * Recursive utility function to find hamiltonian cyle
     */
    public boolean hamiltonianCycleUtility(int[][] graph, int[] path, int position) {
        // if all vertex included in the hamiltonian cycle
        if (position == totalVertex) {
            // if there is vertex from last included vertex to the first vertex
            if (graph[path[position - 1]][path[0]] == 1) {
                return true;
            } else {
                return false;
            }
        }

        // trying different vertex
        for (int v = 0; v < totalVertex; v++) {
            // check if this vertex is good to be added into the hamiltonian cycle
            if (isGood(v, graph, path, position)) {
                path[position] = v;

                // continue to construct the rest of the path
                if (hamiltonianCycleUtility(graph, path, position + 1) == true) {
                    return true;
                }

                // if adding vertex v doesn't lead to a solution then need to remove it
                path[position] = -1;
            }
        }

        // if no vertex can be added so far
        return false;
    }

    public int hamiltonianCycle(int[][] graph, int startingPoint) {
        path = new int[totalVertex];
        for (int i = 0; i < totalVertex; i++) {
            path[i] = -1;
        }

        path[0] = startingPoint;
        if (hamiltonianCycleUtility(graph, path, 1) == false) {
            System.out.println("\nNo path found. ");
            return 0;
        }

        displaySolution(path);
        return 1;
    }

    /**
     * function to display the solution
     */
    public void displaySolution(int[] path) {
        System.out.println("\nPath found! ");
        for (int i = 0; i < totalVertex; i++) {
            System.out.print(path[i] + " => ");
        }

        // print first vertex again to show a complete cycle
        System.out.println(path[0] + " ");
    }
}
