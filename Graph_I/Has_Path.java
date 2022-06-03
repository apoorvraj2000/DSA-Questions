package Graph_I;

import java.io.IOException;
import java.util.*;

public class Has_Path {

	public static void main(String[] args) throws NumberFormatException, IOException {
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
	        //Source
	        int v1=sc.nextInt();
	        //Destination
	        int v2=sc.nextInt();
	      
	        boolean visited[]=new boolean[n];
	       
	        System.out.print(check(edges,v1,v2,visited));
	               
	         
		}
	    
	    public static boolean check(int[][]edges, int v1, int v2, boolean visited[]){
	       int n=edges.length;
	        
	        if(v1==v2)
	            return true;
	        
	        visited[v1]=true;
	        
	        for(int i=0;i<n;i++){
	            if(edges[v1][i]==1 && visited[i]==false){
	                if(check(edges,i,v2,visited))
	                  return true;
	            }
	        }
	        
	        return false;
	    }
}
