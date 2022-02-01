package Recursion2;

public class Binary_Search_Recursive {
	public static int binarySearch(int input[], int element) {
		
		return binarySearch(input,element,0,input.length-1);
	}
    public static int binarySearch(int input[], int element, int start, int end) {
        
		if(start<=end){
        int mid=start+(end-start)/2;
       
        if(input[mid]==element){
			return mid;            
        }
       	if(element<input[mid]){
            return binarySearch(input,element,start,mid-1);
        }
        if(element>input[mid]){
            return binarySearch(input,element,mid+1,end);
        	}
        }
		return -1;
	}
}
