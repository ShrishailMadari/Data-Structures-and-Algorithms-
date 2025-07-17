package bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        adjList.add(new ArrayList<>(Arrays.asList(2, 3, 1))); // node 0
        adjList.add(new ArrayList<>(Arrays.asList(0)));       // node 1
        adjList.add(new ArrayList<>(Arrays.asList(0, 4)));    // node 2
        adjList.add(new ArrayList<>(Arrays.asList(0)));       // node 3
        adjList.add(new ArrayList<>(Arrays.asList(2)));       // node 4

        // Print the adjacency list
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println("Node " + i + ": " + adjList.get(i));
        }
        ArrayList<Integer> bfsOfGraph = bfsOfGraph(adjList);
        System.out.println("BFS of the graph: " + bfsOfGraph);
    }

    private static ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();
        visited[0] = true;
        queue.offer(0);
        while (!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);
            for (int neighbour : adjList.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
        return result;
    }
}
