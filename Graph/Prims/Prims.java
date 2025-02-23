package Graph.Prims;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;


class Triplet implements Comparable<Triplet> {
    int node, parent, dist;

    Triplet(int node, int parent, int dist) {
        this.node = node;
        this.parent = parent;
        this.dist = dist;
    }

    @Override
    public int compareTo(Triplet other) {
        return this.dist - other.dist;
    }
}

public class Prims {

    public int minCostConnectPoints(int[][] points) {
        int n = points.length; // Number of points
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0, -1, 0));

        int sum = 0;
        boolean[] vis = new boolean[n];

        while (pq.size() > 0) {
            Triplet top = pq.remove();
            int node = top.node, parent = top.parent, dist = top.dist;

            // If node is already visited, skip it
            if (vis[node]) continue;

            sum += dist;
            vis[node] = true;

            // Explore neighbors
            for (int i = 0; i < n; i++) {
                if (i == node || i == parent || vis[i]) continue;

                int x1 = points[node][0], y1 = points[node][1];
                int x2 = points[i][0], y2 = points[i][1];
                int mDis = Math.abs(x2 - x1) + Math.abs(y2 - y1);

                pq.add(new Triplet(i, node, mDis));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Prims obj = new Prims();
        int[][] points = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        System.out.println("Minimum Cost to Connect All Points: " + obj.minCostConnectPoints(points));
    }
}
