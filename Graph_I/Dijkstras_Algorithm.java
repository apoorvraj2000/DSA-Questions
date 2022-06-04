package Graph_I;

import java.util.Scanner;

public class Dijkstras_Algorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
        int edges[][]=new int[v][v];
        
        for(int i=0;i<e;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int w=sc.nextInt();
            
            edges[v1][v2]=w;
            edges[v2][v1]=w;
        }
		
         Dijkstra(edges,v);
	}
    
    public static void Dijkstra(int edges[][], int v){
        boolean []visited=new boolean[v];
        int[] distance=new int[v];
        
        distance[0]=0;
        for(int i=1;i<v;i++)
            distance[i]=Integer.MAX_VALUE;
        
        for(int i=0;i<v;i++){
            //get the vertex which is not visited and have minimum distance
            int vertex=findMinimum(distance,visited); 
            visited[vertex]=true;
          //Explore unvisited neighbor of vertex
            for(int j=0;j<v;j++){
            	//Decide whether to update distance or not
                if(!visited[j] && edges[vertex][j]!=0 && distance[vertex]!= Integer.MAX_VALUE){
                	//calculate the new distance
                    int newDistance=distance[vertex]+edges[vertex][j];
                    
                    if(newDistance<distance[j]){
                        distance[j]=newDistance;
                    }
                }
            }
        }
        
        //print the distance 
        for(int i=0;i<v;i++){
            System.out.println(i+" "+distance[i]);
        }
    }
    //function to find unvisited vertex with minimum distance
    public static int findMinimum(int []distance, boolean []visited){
        int min=-1;
        
        for(int i=0;i<distance.length;i++){
            if(!visited[i] && (min==-1 || distance[i]<distance[min])){
                min=i;
            }
        }
        return min;
    }
}
