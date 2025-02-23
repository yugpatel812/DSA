package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// BFS
class cycle {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adjList) {
        int vertices = adjList.size();
        boolean[] visited = new boolean[vertices];
        Queue<int[]> queue = new LinkedList<>();

        for (int start = 0; start < vertices; start++) {
            if (!visited[start]) {
                queue.add(new int[]{start, -1}); // {node, parent}
                visited[start] = true;

                while (!queue.isEmpty()) {
                    int[] pair = queue.poll();
                    int node = pair[0], parent = pair[1];

                    for (int neighbor : adjList.get(node)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            queue.add(new int[]{neighbor, node});
                        } else if (neighbor != parent) {
                            return true; // Cycle detected
                        }
                    }
                }
            }
        }
        return false;}}


