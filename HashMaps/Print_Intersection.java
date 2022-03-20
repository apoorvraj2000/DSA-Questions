package HashMaps;

import java.util.*;
public class Print_Intersection {

	public static void printIntersection(int[] arr1,int[] arr2){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.replace(arr1[i],map.get(arr1[i])+1);
            }else{
                map.put(arr1[i],1);
            }
        }
        
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                if(map.get(arr2[i])>0){
                     System.out.println(arr2[i]);
                     map.replace(arr2[i],map.get(arr2[i])-1);
                }           
            }
        }	
	}
}
