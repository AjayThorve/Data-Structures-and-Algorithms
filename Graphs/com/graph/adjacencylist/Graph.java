package com.graph.adjacencylist;
import java.util.LinkedList;

public class Graph{
    int V;
    LinkedList<Integer> adjListArray[];
    
    public Graph(int V){// V is the number of vertices/nodes in the graph
      this.V = V;
      adjListArray = new LinkedList[V];
      
      for(int i =0; i<V;i++)
        adjListArray[i] = new LinkedList<>();
      
    }
  
   public void addEdge(int src, int dest){
    this.adjListArray[src].addFirst(dest);
    
    //since graph is undirected, add to dest as well:
    this.adjListArray[dest].addFirst(src);
    
  }
  
  public void printGraph(){
    for(int v = 0; v < this.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: this.adjListArray[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
  }
}