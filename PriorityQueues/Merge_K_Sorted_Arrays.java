package PriorityQueues;

import java.util.*;

public class Merge_K_Sorted_Arrays {
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<input.size();i++){
            ArrayList<Integer>list=input.get(i);
            for(int j=0;j<list.size();j++){
                pq.add(list.get(j));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
		return ans;
	}
}
