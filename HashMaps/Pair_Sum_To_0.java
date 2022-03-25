package HashMaps;
import java.util.*;
public class Pair_Sum_To_0 {
	public static int PairSum(int[] arr, int size) {
		Map<Integer,Integer>map=new HashMap<>();
        int ans=0;
        for(int i=0;i<size;i++){
            int req=0-arr[i];
            if(map.containsKey(req)){
                ans+=map.get(req);
            }
            if(map.containsKey(arr[i])){
                map.replace(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        return ans;
        
	}
}
