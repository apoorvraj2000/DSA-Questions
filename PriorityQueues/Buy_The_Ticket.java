package PriorityQueues;

import java.util.*;

public class Buy_The_Ticket {
	public static int buyTicket(int input[], int k) {
		PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
	    Queue<Integer>index = new LinkedList<>();
		
	        for(int i=0;i<input.length;i++){
	        	pq.add(input[i]);
	        	index.add(i);
	    	}
	        int time=0;
	        while(!index.isEmpty()){
	            int currInd=index.poll();
	            
	            if(input[currInd]!=pq.peek()){
	              index.add(currInd);
	            }
	            if(input[currInd]==pq.peek()){
	                time++;
	                pq.poll();
	                if(currInd==k){
	                    break;
	                }
	            }
	        }
	        return time;
		}
}
