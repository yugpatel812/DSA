package Graph.DFS;

import java.util.ArrayList;

class cycle {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int vertices = adj.size();
        // Code here
        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) { // Handle disconnected components
                if (dfs(i, -1, visited,adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int node, int parent, boolean[] visited,ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited,adj)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

}
