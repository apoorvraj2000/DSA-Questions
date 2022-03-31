package PriorityQueues;
import java.util.*;
public class Kth_largest_Element {
	public static int kthLargest(int n, int[] input, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++){
            pq.add(input[i]);
        }
        for(int i=0;i<n;i++){
            input[i]=pq.poll();
        }
        return input[n-k];
	}
}
