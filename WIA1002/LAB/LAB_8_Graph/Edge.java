package WIA1002.LAB.LAB_8_Graph;

public class Edge<T extends Comparable<T>, N extends Comparable<N>> {
    Vertex<T, N> toVertex;
    N weight;
    Edge<T, N> nextEdge;

    public Edge() {
        this.toVertex = null;
        this.weight = null;
        this.nextEdge = null;
    }

    public Edge(Vertex<T, N> toVertex, N weight, Edge<T, N> nextEdge) {
        this.toVertex = toVertex;
        this.weight = weight;
        this.nextEdge = nextEdge;
    }
}