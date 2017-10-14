package com.graph.dfs;
import java.util.*;
import com.graph.adjacencylist.Graph;

public class GraphDFS extends Graph{
    
    public GraphDFS(int V){
        super(V);
    }
    public void DFS(int s)
    {
        boolean[] visited = new boolean[V];
        DFSRecur(s,visited);
    }
    public void DFSRecur(int s, boolean[] visited){
        visited[s] = true;
        System.out.print(s+" ");

        for(int i: this.adjListArray[s]){
            if(!visited[i]){
                DFSRecur(i,visited);
            }
        }
    }
}