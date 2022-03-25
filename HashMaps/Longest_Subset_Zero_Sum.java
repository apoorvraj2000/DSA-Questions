package HashMaps;

import java.util.*;

public class Longest_Subset_Zero_Sum {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		Map<Integer,Integer>map=new HashMap<>();
        int maxLen=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen=i+1;
            }
            else if(map.containsKey(sum)){
                int len=i-map.get(sum);
                maxLen=Math.max(len,maxLen);
            }else{
                map.put(sum,i);
            }
            
        }
        return maxLen;
	}
}
