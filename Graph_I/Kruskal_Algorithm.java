package Graph_I;
import java.util.*;
class Edge implements Comparable<Edge>{
    int source;
    int desti;
    int weight;
    public Edge(int source,int desti,int weight){
        this.source=source;
        this.desti=desti;
        this.weight=weight;
    }
    //used to sort the array according to the class property
    @Override
    public int compareTo(Edge e){
        return this.weight-e.weight;
    }
}
public class Kruskal_Algorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
        
		Edge[] edges=new Edge[E];
        for(int i=0;i<E;i++){
            int source=sc.nextInt();
            int desti=sc.nextInt();
            int weight=sc.nextInt();
            edges[i]=new Edge(source,desti,weight);
        }
        
       kruskal(edges,V);
	}
    
    public static void kruskal(Edge[]edges, int V){
        Arrays.sort(edges);
       
        Edge[] output=new Edge[V-1];
        
        int []parent=new int[V];
        for(int i=0;i<V;i++){
            parent[i]=i;
        }
        int countEdges=0;
        int i=0;
        while(countEdges!=V-1){
            Edge currEdge=edges[i];
            
            int sourceParent=findParent(currEdge.source,parent);
            
            int destiParent=findParent(currEdge.desti,parent);
            
            if(sourceParent!=destiParent){
                output[countEdges]=currEdge;
                countEdges++;
                parent[sourceParent]=destiParent;
            }
            i++;
        }
        
        for(Edge e:output){
            if(e.source<e.desti){
                System.out.println(e.source+" "+e.desti+" "+e.weight);
            }else{
                System.out.println(e.desti+" "+e.source+" "+e.weight);
            }
            
        }
    }
    
    public static int findParent(int v,int[]parent){
        if(parent[v]==v)
            return v;
        
        return findParent(parent[v],parent);
    }
}
