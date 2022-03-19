package HashMaps;

import java.util.*;
public class Maximum_Frequency_Number {

	public static int maxFrequencyNumber(int[] arr){ 
		Map<Integer,Integer>map=new HashMap<>();
	       for(int i=0;i<arr.length;i++){
	            if(map.containsKey(arr[i])){
	                map.replace(arr[i],map.get(arr[i])+1);
	            }else {
	            	map.put(arr[i],1);
	            }
	        }
	        int max=map.get(arr[0]);
	        int ans=arr[0];
	        for(int i=1;i<arr.length;i++){
	               if(map.get(arr[i])>max){
	                   max=map.get(arr[i]);
	                   ans=arr[i];
	               }
	        }
	        return ans;
    }
}
