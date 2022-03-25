package HashMaps;

import java.util.*;

public class Pairs_With_Difference_K {
	public static int getPairsWithDifferenceK(int arr[], int k) {
		Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.replace(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int count=0;
        if(k==0){
            for(int i=0;i<arr.length;i++){
                int freq=map.get(arr[i]);
                if(freq>1){
                    count+=freq*(freq-1)/2;
                }
                 map.put(arr[i],0);
            }
        }else{
            for(int i=0;i<arr.length;i++){
            int req=arr[i]-k;
            if(map.containsKey(req)){
               count+=map.get(arr[i])*map.get(req);
            }
            
            req=arr[i]+k;
            if(map.containsKey(req)){
                count+=map.get(arr[i])*map.get(req);
            }
            map.put(arr[i],0);
          }
        }
        
        return count;
	}
}
