package practice_Question;
import java.util.*;
public class Pair_Sum_in_Array {
	//Solution 1
	public static int pairSum1(int[] arr, int num) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num)
                    count++;
            }
        }
        return count;
	}
	//Solution 2
	public static int pairSum2(int[] arr, int num) {
		int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int req=num-arr[i];
            if(map.containsKey(req)){
                count+=map.get(req);
               
            }
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                if(!map.isEmpty())
                map.replace(arr[i],map.get(arr[i])+1);
            }
        }
        return count;
	}
}
