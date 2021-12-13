package example.RecursionExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Depth First Search (DFS) + Recursion 範例
 * 
 * Reference:
 *  - https://www.techiedelight.com/depth-first-search/
 * 
 */
public class DFSExample {
    public static void main(String[] args) {
        List<Edge> n = new ArrayList<>();
        n.add(new Edge(1, 10));
        n.add(new Edge(2, 13));
        n.add(new Edge(15, 24));
        n.add(new Edge(6, 28));

        n.forEach(s -> {
            System.out.println("Source: " + s.getSource() + "; Destination: " + s.getDest());
        });

        for (int i=0; i<n.size(); i++) {
            System.out.println("Source: " + n.get(i).getSource() + "; Destination: " + n.get(i).getDest());
        }
    }
}

class Edge {
    public int source, dest;

    public Edge(int source, int dest) {
        this.source = source;
        this.dest = dest;
    }

    public int getSource() {
        return this.source;
    }

    public int getDest() {
        return this.dest;
    }
}

class Graph {
    List<List<Integer>> adjList = null;

    Graph(List<Edge> edges, int n) {
        adjList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            adjList.add(new ArrayList<>());
        }

        // add edges to the undirected graph
        for (Edge edge: edges) {
            int src = edge.source;
            int dest = edge.dest;

            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}