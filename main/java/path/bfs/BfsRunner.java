package path.bfs;

public class BfsRunner {
    // Driver method to
    public static void main(String args[])
    {
        Graph bfsGraph = new Graph(4);

        bfsGraph.addEdge(0, 1);
        bfsGraph.addEdge(0, 2);
        bfsGraph.addEdge(1, 2);
        bfsGraph.addEdge(2, 0);
        bfsGraph.addEdge(2, 3);
        bfsGraph.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        bfsGraph.traverse(2);
    }
}
