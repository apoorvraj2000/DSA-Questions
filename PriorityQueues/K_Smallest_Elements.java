package PriorityQueues;

import java.util.*;

public class K_Smallest_Elements {
	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
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
