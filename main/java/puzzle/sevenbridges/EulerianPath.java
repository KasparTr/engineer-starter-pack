package puzzle.sevenbridges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EulerianPath {
    private final int nrOfNodesInGraph;
    private int edgeCount;	// nr of edges in graph (calc dynamically)
    private int[] in, out;	// track in and out degree of each nodes
    private LinkedList<Integer> path;	// eulerian path SOLUTION
    private List<List<Integer>> graph;	// reference to input graph

    public EulerianPath(List<List<Integer>> graph){
        if(graph == null)
            throw new IllegalArgumentException("Graph cannot be null");

        nrOfNodesInGraph = graph.size();
        this.graph = graph;
        path = new LinkedList<>();
    }

    public void addDirectedEdge(List<List<Integer>> g, int from, int to){
        g.get(from).add(to);
    }

    // Returns a list of edgeCount +1 node ids that give the Eluerian path or
    // null if no path exists or the graph is disconnected.
    public int[] getEulerianPath(){
        setup();
        if(edgeCount == 0) return null;

        if(!graphHasEulerianPath()) return null;
        dfs(findStartNode());

        // Make sure all edges of the graph were traversed.
        // Can be a case that the graph is disconnected
        if(path.size() != edgeCount+1) return null;

        // (OPTIONAL)
        // 	Instead of returning 'path' as a linked list
        // 	return solution as primitive array for convenience (easier to index array than LL)
        int[] soln = new int[edgeCount+1];
        for(int i=0; !path.isEmpty(); i++)
            soln[i] = path.removeFirst();

        return soln;
    }

    /**
     *	Loop through edges and incerement the in/out array degrees
     * 	Compute the nr of edges in the graph (tracked by the edgeCount variable).
     * 	The degree of a node is the number of edges for which it is one of the endpoints.
     **/
    private void setup(){
        // Arrays the track the in degree and out degree of each node.
        in = new int[nrOfNodesInGraph];
        out = new int[nrOfNodesInGraph];
        edgeCount = 0;

        // Compute in and out node degree
        for(int from = 0; from < nrOfNodesInGraph; from++){
            for(int to: graph.get(from)){
                in[to]++;
                out[from]++;
                edgeCount++;
            }
        }
    }

    /**
     * Check if no node has too many incoming or outgoing edges;
     * Ensure there is correct amount of start and end nodes for a Eulerian path to exists ()
     * 	A graph has an Euler circuit if and only if the degree of every vertex is even.
     *	A graph has an Euler path if and only if there are at most two vertices with odd degree.
     **/
    private boolean graphHasEulerianPath(){
        int startNodes = 0, endNodes = 0;

        // count start and end nodes
        for(int i = 0; i < nrOfNodesInGraph; i++){
            if(out[i] - in[i] > 1 || in[i] - out[i] > 1) return false;	// too many in/out edges: check if the difference between node degrees is creater then 1
            else if (out[i] - in[i] == 1) startNodes++;	// if node is a start node
            else if (in[i] - out[i] == 1) endNodes++;		// if node is an end node
        }

        // there has to be at most 1 start and end node
        return ((endNodes == 0 && startNodes == 0) || (endNodes == 1 && startNodes == 1));
    }

    /**
     * 	Select the correct node to start the path, as compleatly random selection doesn't bring valid results.
     **/
    private int findStartNode(){
        int start = 0;
        for(int i = 0; i < nrOfNodesInGraph; i++){
            if(out[i] - in[i] == 1) return i;	// unique starting node w/ 1 extra outgoing edge
            if(out[i] > 0) start = i;			// node with an outgoing edge
        }
        return start;
    }

    /**
     *	Find Eulerian path using Depth-First search.
     **/
    private void dfs(int at){
        // out is used for 1) tracking visited edges and 2) index for reaching the adjacency list for next node
        while(out[at] != 0){
            int next = graph.get(at).get(--out[at]);
            dfs(next);
        }
        path.addFirst(at);
    }

    public static List<List<Integer>> initializeEmptyGraph(int n){
        List<List<Integer>> graph = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        return graph;
    }



}
