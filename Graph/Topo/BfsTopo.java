package Graph.Topo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsTopo {
    //kahn's algorithm
    // cycle detection in directed graph
    public int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        int idx = 0;
        int[] topo = new int[V];
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topo[idx++] = node;
            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        //cycle detection
//        if(topo.length!=V){
//            return -1;
//        }
        return topo;
    }
}
