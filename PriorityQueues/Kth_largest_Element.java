package PriorityQueues;
import java.util.*;
public class Kth_largest_Element {
	public static ArrayList<Integer> kLargest(int input[], int k) {
        int n=input.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
		for(;i<k;i++){
            pq.add(input[i]);
        }
        for(;i<n;i++){
            if(input[i]>pq.peek()){
                pq.poll();
                pq.add(input[i]);
            }
        }
        
        for(int j=0;j<k;j++){
            ans.add(pq.poll());
        }
        return ans;
		
	}
}
