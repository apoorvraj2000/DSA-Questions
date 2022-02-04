package practice_Question;
import java.util.*;
public class Duplicate_in_Array {
	//Solution 1
	public static int findDuplicate1(int[] arr) {
        int totalSum=0;
        for(int i=0;i<arr.length;i++)
            totalSum+=arr[i];
        
        int sum=((arr.length-2)*(arr.length-1))/2;
        
        return totalSum-sum;
        
	}
	//Solution 2
	public static int findDuplicate2(int[] arr) {
		Map<Integer,Integer>map=new HashMap<>();
	        for(int i=0;i<arr.length;i++){
	            int currElement=arr[i];
	        if(map.containsKey(currElement)){
	                map.replace(currElement,map.get(currElement)+1);
	                
	           }else{
	            map.put(currElement,1);
	          }
	       }
        int ans=0;
        for(int i:arr){
            if(map.get(i)>1){
                ans= i;
                break;
            }
        }
        return ans;
    }
}
