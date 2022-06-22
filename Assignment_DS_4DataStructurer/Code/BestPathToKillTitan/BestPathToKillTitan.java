package BestPathToKillTitan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BestPathToKillTitan {
    // Function to form edge between
    // two vertices src and dest

    public void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int dest) {
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    // Function which finds all the paths
    // and stores it in paths array
    public static void find_paths(ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path,
            ArrayList<ArrayList<Integer>> parent, int n, int u) {
        // Base Case
        if (u == -1) {
            paths.add(new ArrayList<>(path));
            return;
        }

        // Loop for all the parents
        // of the given vertex
        for (int par : parent.get(u)) {

            // Insert the current
            // vertex in path
            path.add(u);

            // Recursive call for its parent
            find_paths(paths, path, parent, n, par);

            // Remove the current vertex
            path.remove(path.size() - 1);
        }
    }

    // Function which performs bfs
    // from the given source vertex
    public static void bfs(ArrayList<ArrayList<Integer>> adj, ArrayList<ArrayList<Integer>> parent,
            int n, int start) {

        // dist will contain shortest distance
        // from start to every other vertex
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Queue<Integer> q = new LinkedList<>();

        // Insert source vertex in queue and make
        // its parent -1 and distance 0
        q.offer(start);

        parent.get(start).clear();
        parent.get(start).add(-1);

        dist[start] = 0;

        // Until Queue is empty
        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : adj.get(u)) {
                if (dist[v] > dist[u] + 1) {

                    // A shorter distance is found
                    // So erase all the previous parents
                    // and insert new parent u in parent[v]
                    dist[v] = dist[u] + 1;
                    q.offer(v);
                    parent.get(v).clear();
                    parent.get(v).add(u);
                } else if (dist[v] == dist[u] + 1) {

                    // Another candidate parent for
                    // shortes path found
                    parent.get(v).add(u);
                }
            }
        }
    }

    // Function which prints all the paths
    // from start to end
    public static void print_paths(ArrayList<ArrayList<Integer>> adj, int n, int start, int end) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<ArrayList<Integer>> parent = new ArrayList<>();

        System.out.println("\nBest path: ");
        for (int i = 0; i < n; i++) {
            parent.add(new ArrayList<>());
        }

        // Function call to bfs
        bfs(adj, parent, n, start);

        // Function call to find_paths
        find_paths(paths, path, parent, n, end);

        for (ArrayList<Integer> v : paths) {

            // Since paths contain each
            // path in reverse order,
            // so reverse it
            Collections.reverse(v);

            // Print node for the current path
            for (int u : v) {
                System.out.print(u + "  ");
            }

            System.out.println();
        }
    }
}
