package puzzle.sevenbridges;

import java.util.List;

public class ChallengeRunner {
    public static void main(String[] args){
        int n = 7;
        List<List<Integer>> graph = EulerianPath.initializeEmptyGraph(n);
        EulerianPath ep = new EulerianPath(graph);

        ep.addDirectedEdge(graph, 1, 2);
        ep.addDirectedEdge(graph, 1, 3);
        ep.addDirectedEdge(graph, 2, 2);
        ep.addDirectedEdge(graph, 2, 4);
        ep.addDirectedEdge(graph, 2, 4);
        ep.addDirectedEdge(graph, 3, 1);
        ep.addDirectedEdge(graph, 3, 2);
        ep.addDirectedEdge(graph, 3, 5);
        ep.addDirectedEdge(graph, 4, 3);
        ep.addDirectedEdge(graph, 4, 6);
        ep.addDirectedEdge(graph, 5, 6);
        ep.addDirectedEdge(graph, 6, 3);
    }
}
