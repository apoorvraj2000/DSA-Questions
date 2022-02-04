package practice_Question;
import java.util.*;

public class Array_Intersection {
	public static void intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
    	Arrays.sort(arr2);
        int i=0,j=0;
    	while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }    
	}
}
