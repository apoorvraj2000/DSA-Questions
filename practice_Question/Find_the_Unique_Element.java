package practice_Question;
import java.util.*;
public class Find_the_Unique_Element {
	//Solution 1
	public static int findUnique1(int[] arr) {
		 int ans=0;
        for(int i=0;i<arr.length;i++)
        ans=ans^arr[i];
       
        return ans;    
	}
	//Solution 2
	public static int findUnique2(int[] arr) {
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
	            if(map.get(i)==1){
	                ans=i;
	                break;
	            }
	        }
		      
	        return ans;
		}
}
