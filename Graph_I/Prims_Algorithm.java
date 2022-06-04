package Graph_I;

import java.util.Scanner;

public class Prims_Algorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();

		int edges[][]=new int[v][v];
        
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            int w=sc.nextInt();
            
            edges[s][d]=w;
            
            edges[d][s]=w;
        }
        
    	prism(edges,v);
	}
    public static void prism(int[][]edges,int v){
        boolean visited[]=new boolean[v];
        int weight[]=new int[v];
        int parent[]=new int[v];

        weight[0]=0;
        
        for(int i=1;i<v;i++)
            weight[i]=Integer.MAX_VALUE;
        
        for(int i=0;i<v;i++){
            //pick vertex with minimum weight
            int vertex=findMinVertex(weight,visited);
            visited[vertex]=true;
            //Explore unvisited neighbor of vertex
            for(int j=0;j<v;j++){
            	//Decide whether to update weight and parent or not
                if(edges[vertex][j]!=0 && !visited[j]){
                    if(edges[vertex][j]<weight[j]){
                        weight[j]=edges[vertex][j];
                        parent[j]=vertex;
                    }
                }
            }
        }
        //Print MST
         for(int i=1;i<v;i++){
                if(parent[i]<i){
                    System.out.println(parent[i]+" "+i+" "+weight[i]);
                }else{
                     System.out.println(i+" "+parent[i]+" "+weight[i]);
                }
         }
        
    }
    
    public static int findMinVertex(int[]weight,boolean visited[]){
        int vertex=-1;
        
        for(int i=0;i<weight.length;i++){
            if(!visited[i] && (vertex==-1 || weight[i]<weight[vertex])){
                vertex=i;
            }
        }
        return vertex;
    }
}
