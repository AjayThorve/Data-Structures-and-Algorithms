import com.graph.dfs.GraphDFS;

class DFS{

    public static void main(String args[]){
        GraphDFS g = new GraphDFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        g.DFS(0);
        System.out.println("");
    }
}