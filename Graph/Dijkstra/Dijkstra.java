package Graph.Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {
    public int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        minHeap.add(new int[]{S, 0});

        while (!minHeap.isEmpty()) {
            int[] pair = minHeap.poll();
            int node = pair[0], weight = pair[1];

            for (ArrayList<Integer> edge : adj.get(node)) {
                int neighbor = edge.get(0), totalweight= edge.get(1) + dist[node];
                if (dist[neighbor] > totalweight) {
                    dist[neighbor] = totalweight;
                    minHeap.add(new int[]{neighbor, dist[neighbor]});
                }
            }
        }
        return dist;
    }
}
