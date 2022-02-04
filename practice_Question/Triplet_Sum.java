package practice_Question;
import java.util.*;
public class Triplet_Sum {
	public static int tripletSum(int[] arr, int num) {
		int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int req=num-a;
            int low=i+1;
            int high=arr.length-1;
            while(low<high){
                int b=arr[low];
                int c=arr[high];
             
                if(b+c<req){
                    low++;
                }
                else if(b+c>req){
                    high--;
                }
                else{
              		if(arr[low]==arr[high]){
              		int numm=(high-low)+1;
                    count+=(numm*(numm-1))/2;
                        break;
              		}
                    int tempLow=low+1;

                    int tempHigh=high-1;

                    while(arr[low]==arr[tempLow] && tempLow<=tempHigh){
                        tempLow++;
                    }
                     while(arr[high]==arr[tempHigh] && tempHigh>=tempLow){
                         tempHigh--;
                    } 
                    int totalSameLow=tempLow-low;
                    int totalSameHigh=high-tempHigh;
                    count+=totalSameLow*totalSameHigh;
                    low=tempLow;
                    high=tempHigh;
                }   
            }
        }
        return count;
	}
}
