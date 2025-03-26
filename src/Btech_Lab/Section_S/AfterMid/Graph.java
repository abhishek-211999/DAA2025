package Btech_Lab.Section_S.AfterMid;
import java.util.*;

// BFS(Breath First Search)

public class Graph {
    private int V; // Number of vertices
    private Map<Integer, List<Integer>> adj; // Adjacency list using HashMap

    // Constructor
    public Graph(int v) {
        V = v;
        adj = new HashMap<>();
        for (int i = 0; i < v; i++) {
            adj.put(i, new ArrayList<>());
        }
    }

    // Add edge to the graph
    public void addEdge(int v, int w) {
        adj.get(v).add(w); // Directed graph
        adj.get(w).add(v); // For undirected graph, uncomment this line
    }

    // BFS traversal from a given source
    public void bfs(int start) {
        boolean[] visited = new boolean[V]; // Visited array
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        System.out.println("BFS Traversal starting from node 0:");
        g.bfs(0);
    }
}

