package WIA1002.LAB.LAB_8_Graph;

public class Graph<T extends Comparable<T>> extends WeightedGraph<T, Integer> {

    public boolean addEdge(T source, T destination) {
        return super.addEdge(source, destination, 1);
    }

    public boolean addUndirectedEdge(T source, T destination) {
        return addEdge(source, destination) && addEdge(destination, source);
    }
}