package Graph_I;

import java.util.*;

public class Get_Path_BFS {

	public static void main(String[] args) {
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

	           ArrayList<Integer>path=check(edges,v1,v2,visited);
               if(path==null)
                    System.out.println();
               else{
                    for(int i : path)
                    System.out.print(i+" ");
               }
           }    
	}
    
    private static ArrayList<Integer> check(int[][] edges, int v1, int v2, boolean[] visited){
        Map<Integer,Integer>map=new HashMap<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(v1);
        boolean find=false;
        
        while(!q.isEmpty()){
            
            int curr=q.poll();
            
            for(int i=0;i<edges.length;i++){
                if(edges[curr][i]==1 && visited[i]==false){
                    q.add(i);
                    map.put(i,curr);
                    visited[i]=true;
                    if(i==v2){
                        find=true;
                        break;
                    }
                }
            }
            if(find)
                break;
        }
        if(!find)
            return null;
        
        ArrayList<Integer>path=new ArrayList<>();
        int curr=v2;
        path.add(curr);
        while(true){
            int temp=map.get(curr);
            path.add(temp);
            curr=temp;
            if(curr==v1)
                break;
        }
        return path;
    }
}
