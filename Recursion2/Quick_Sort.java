package Recursion2;

public class Quick_Sort {
	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length - 1);
	
}
	public static void quickSort(int[] input, int si, int ei) {
		if(si>=ei){
            return ;
        }
    	int pivotPos=getPivot(input,si,ei);
    	quickSort(input,si,pivotPos-1);
    	quickSort(input,pivotPos+1,ei);
	}
	public static int getPivot(int[] input, int si, int ei){
    int pivot=input[si];
    int countSmaller=0;
    for(int i=si;i<=ei;i++){
        if(input[i]<pivot){
            countSmaller++;
        }
    }
    int pivotPos=si+countSmaller;
    //Swap
    int value=input[pivotPos];
    input[pivotPos]=pivot;
    input[si]=value;
    
    int i=si;
    int j=ei;
    while(i<pivotPos && j>pivotPos){
        if(input[i]<pivot){
            i++;
        }
        else if(input[j]>=pivot){
            j--;
        }
        else{
            //Swap
            int temp=input[i];
            input[i]=input[j];
            input[j]=temp;
            i++;
            j--;
        }
    }
    
    return pivotPos;
}
}
