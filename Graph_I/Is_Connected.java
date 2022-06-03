package Graph_I;

import java.util.*;

public class Is_Connected {

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
        if(edges.length==0){
             System.out.println("true");
        }else{
            boolean []visited=new boolean[edges.length];
        
            System.out.println(isConnected(edges,0,visited));
        }
        
	}
    
    public static boolean isConnected(int[][]edges,int s,boolean []visited){
        Queue<Integer>q=new LinkedList<>();
        q.add(s);
        visited[s]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
    
            for(int i=0;i<edges.length;i++){
                if(edges[curr][i]==1 && visited[i]==false){
                    q.add(i);
                    visited[i]=true;
                }
            }
            
        }
        
        for(boolean a:visited){
            if(a==false)
                return false;
        }
        
        return true;
    }
}
