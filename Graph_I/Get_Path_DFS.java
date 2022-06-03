package Graph_I;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Get_Path_DFS {

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
	        if(v1==v2){
               System.out.println(v1);
           }else{
                 boolean visited[]=new boolean[n];

	           ArrayList<Integer>path=check(edges,v1,v2,visited,new ArrayList<>());
               if(path==null)
                    System.out.println();
               else{
                    for(int i : path)
                    System.out.print(i+" ");
               }
           }    
	}
   private static ArrayList<Integer> check(int[][] edges, int v1, int v2, boolean[] visited,ArrayList<Integer>path) {
		if(v1==v2){
           path.add(v2);
           return path;
       }
       visited[v1]=true;
       for(int i=0;i<edges.length;i++){
           if(edges[v1][i]==1 && visited[i]==false){
               ArrayList<Integer>curr=check(edges,i,v2,visited,path);
               if(curr!=null){
                   path.add(v1);
                   return curr;
               }
                   
           }
               
       }
       return null;
	}
}
