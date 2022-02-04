package practice_Question;

public class Rotate_Array {
	//Solution 1
	public static void rotate1(int[] arr, int d) {
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        int k=0;
        for(int i=d;i<arr.length;i++){
            arr[k]=arr[i];
            k++;
        }
        for(int i=0;i<temp.length;i++){
            arr[k]=temp[i];
            k++;
        }  
    }
	
	//Solution 2
	public static void rotate2(int[] arr, int d) {
    	//reverse the whole array
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        //now reverse the first half of array from 0 to n-d
        int k=0,l=(arr.length-d)-1;
         while(k<l){
            swap(arr,k,l);
            k++;
            l--;
        }
         //now reverse the second half of array from n-d+1 to n
        int start=(arr.length-d), end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
