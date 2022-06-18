package WIA1002.DS.BestPathToKillTitan;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBestPathToKillTitan {
    public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter location of Titan: ");
			int dest = sc.nextInt();

			// Number of vertices
			int n = 16;

			// array of vectors is used
			// to store the graph
			// in the form of an adjacency list
			ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				adj.add(new ArrayList<>());
			}

            BestPathToKillTitan bestPath = new BestPathToKillTitan();

			// Given Graph
			bestPath.addEdge(adj, 0, 1);
			bestPath.addEdge(adj, 0, 5);
			bestPath.addEdge(adj, 0, 7);
			bestPath.addEdge(adj, 1, 2);
			bestPath.addEdge(adj, 1, 4);
			bestPath.addEdge(adj, 1, 6);
			bestPath.addEdge(adj, 2, 3);
			bestPath.addEdge(adj, 2, 11);
			bestPath.addEdge(adj, 2, 13);
			bestPath.addEdge(adj, 3, 10);
			bestPath.addEdge(adj, 4, 6);
			bestPath.addEdge(adj, 4, 10);
			bestPath.addEdge(adj, 5, 6);
			bestPath.addEdge(adj, 5, 7);
			bestPath.addEdge(adj, 5, 12);
			bestPath.addEdge(adj, 6, 8);
			bestPath.addEdge(adj, 6, 15);
			bestPath.addEdge(adj, 7, 9);
			bestPath.addEdge(adj, 8, 10);
			bestPath.addEdge(adj, 9, 12);
			bestPath.addEdge(adj, 9, 15);
			bestPath.addEdge(adj, 10, 14);
			bestPath.addEdge(adj, 11, 13);
			bestPath.addEdge(adj, 13, 14);
			bestPath.addEdge(adj, 14, 15);

			// Given source
			int src = 0;

			// Function Call
			bestPath.print_paths(adj, n, src, dest);
		}

	}
}
