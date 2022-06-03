package Graph_I;

import java.util.*;

public class Implementation {
	
	//for printing of graph [DFS Printing]
	private static void printHelperDFS(int[][] edges, int sv, boolean[] visited) {
		System.out.println(sv);
		visited[sv]=true;
		
		int n=edges.length;
		
		for(int i=0;i<n;i++) {
			if(edges[sv][i]==1 && visited[i]==false)
				printHelperDFS(edges, i, visited);
		}
		
	}
	
	private static void printDFS(int[][] edges) {
		int n=edges.length;
		boolean []visited=new boolean[n];
		
		for(int i=0;i<n;i++) {
			if(visited[i]==false)
			printHelperDFS(edges,i,visited);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//number of vertices
		int n=sc.nextInt();
		//number of edges
		int e=sc.nextInt();
		
		int edges[][]=new int[n][n];
		
		for(int i=0;i<e;i++) {
			//starting vertex
			int sv=sc.nextInt();
			//ending vertex
			int ev=sc.nextInt();
			edges[sv][ev]=1;
			
			edges[ev][sv]=1;
		}
		printDFS(edges);
		
		printBFS(edges);
	}
	
	//for printing of graph [BFS Printing]
	 private static void printBFS(int [][]edges){
	        int n=edges.length;
	        boolean []visited=new boolean[n];
	        
	        for(int i=0;i<n;i++){
	            if(visited[i]==false)
	                printHelperBFS(edges,i,visited);
	        }
	    }
	    
	    private static void printHelperBFS(int [][]edges, int sv, boolean visited[]){
	        Queue<Integer> q= new LinkedList<>();
	        q.add(sv);
	        visited[sv]=true;
	        while(!q.isEmpty()){
	            int curr=q.poll();
	            System.out.print(curr+" ");
	            for(int i=0;i<edges.length;i++){
	                if(edges[curr][i]==1 && visited[i]==false){
	                    q.add(i);
	                    visited[i]=true;
	                }
	            }
	        }
	    }

}
