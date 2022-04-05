package PriorityQueues;

import java.util.*;

public class K_largest_Elements_Code {
	public static ArrayList<Integer> kLargest(int input[], int k) {
        int n=input.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<n;i++){
            pq.add(input[i]);
        }
        for(int i=0;i<k;i++){
            ans.add(pq.poll());
        }
        return ans;
		
	}
}
