package path.bfs;

// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph
{
    private int nrOfVerices; // No. of vertices
    private LinkedList<Integer> adjacencyList[]; //Adjacency Lists

    // Constructor
    Graph(int nrOfVertices)
    {
        nrOfVerices = nrOfVertices;
        adjacencyList = new LinkedList[nrOfVertices];
        for (int i=0; i<nrOfVertices; ++i)
            adjacencyList[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int locationIndex,int value)
    {
        adjacencyList[locationIndex].add(value);
    }

    // prints BFS traversal from a given source s
    void traverse(int source)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[nrOfVerices];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>(); 	// when used with .poll() method, LinkedList has Queue behaviour

        // Mark the current node as visited and enqueue it
        visited[source]=true;
        queue.add(source);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            source = queue.poll();
            System.out.print(source+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adjacencyList[source].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }


}
// This code is contributed by Aakash Hasija
