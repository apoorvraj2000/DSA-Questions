package PriorityQueues;

public class Check_Max_Heap {

	public static boolean checkMaxHeap(int arr[]) {
		for(int i=0;i<arr.length;i++){
            int leftInd=(2*i)+1;
            int rightInd=(2*i)+1;
            if(leftInd<arr.length &&arr[i]<arr[leftInd]){
                return false;
            }
            if(rightInd<arr.length &&arr[i]<arr[rightInd]){
                return false;
            }
        }
        return true;
	}
}
