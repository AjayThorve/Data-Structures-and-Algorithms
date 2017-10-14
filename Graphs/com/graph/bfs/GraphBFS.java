package com.graph.bfs;
import java.util.*;
import com.graph.adjacencylist.Graph;

public class GraphBFS extends Graph{
    
    public GraphBFS(int V){
        super(V);
    }
     public void BFS(int s)
        {
            // Mark all the vertices as not visited(By default
            // set as false)
            boolean visited[] = new boolean[V];
    
            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();
    
            // Mark the current node as visited and enqueue it
            visited[s]=true;
            queue.add(s);
    
            while (queue.size() != 0)
            {
                // Dequeue a vertex from queue and print it
                s = queue.poll();
                System.out.print(s+" ");
    
                // Get all adjacent vertices of the dequeued vertex s
                // If a adjacent has not been visited, then mark it
                // visited and enqueue it
                for(int i: this.adjListArray[s]){
                    if(!visited[i]){
                        visited[i] = true;
                        queue.add(i);
                    }
                }
            }
        }
}