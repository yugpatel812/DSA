package Graph.Topo;

import java.util.ArrayList;
import java.util.Stack;

public class DfsTopo {
    public int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, stack, adj);
            }
        }
        int[] topo = new int[V];
        int idx = 0;
        while (!stack.isEmpty()) {
            topo[idx++] = stack.pop();
        }
        return topo;
    }

    public void dfs(int node, boolean[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, stack, adj);
            }
        }
        stack.push(node);
    }

    // cycle detection in directed graph DFS
    public void  cycledetect(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[V];
        boolean[] path= new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfsCycle(i, visited, path, adj)) {
                    System.out.println("Cycle detected");
                    return;
                }
            }
        }
        System.out.println("No cycle detected");
    }

   public boolean dfsCycle(int node, boolean[] visited, boolean[] path, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        path[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfsCycle(neighbor, visited, path, adj)) {
                    return true;
                }
            } else if (path[neighbor]) {
                return true;
            }
        }
        path[node] = false;
        return false;
    }

}
