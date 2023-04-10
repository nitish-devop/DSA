import java.util.ArrayList;
import java.util.Arrays;

public class GraphDemo {
    public static class Edge {
        int source;
        int dest;

        public Edge(int s,int d){
            source = s;
            dest = d;
        }
        
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[5];

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        
        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
        
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.source+","+e.dest);
        }
        
    }
}