package Graph_I;

import java.util.*;

public class All_Connected_Components {

	public static void main(String[] args)  {
        
	       Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int e=sc.nextInt();
		        
		        int [][]edges=new int[n][n];
		        
		        for(int i=0;i<e;i++){
		            int sv=sc.nextInt();
		            int ev=sc.nextInt();
		            
		            edges[sv][ev]=1;
		            edges[ev][sv]=1;
		        }
	        	
	        	
	        boolean visited[]=new boolean[n];
	        for(int i=0;i<n;i++){
	            if(visited[i]==false){
	                check(edges,i,visited);
	            }
	        }
	           
		}
	     private static void check(int[][] edges, int s, boolean[] visited){
	        Queue<Integer>q=new LinkedList<>();
	         ArrayList<Integer>ans=new ArrayList<>();
	         q.add(s);
	    	visited[s]=true;
	         ans.add(s);
	        while(!q.isEmpty()){   
	            int curr=q.poll();
	           
	            for(int i=0;i<edges.length;i++){
	                if(edges[curr][i]==1 && visited[i]==false){
	                     q.add(i);
	                     ans.add(i);
	                    visited[i]=true;
	                }
	            }
	    
	        }
	         Collections.sort(ans);
	       for(int i=0;i<ans.size();i++)
	           System.out.print(ans.get(i)+" ");
	         
	         System.out.println();
	    }
}
