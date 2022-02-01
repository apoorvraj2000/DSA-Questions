package Recursion2;

public class Merge_Sort {
	public static void mergeSort(int[] input){
	
		getSorted(input,0,input.length-1);
	}
    public static void getSorted(int[] input,int startInd,int endInd){
		
        if(startInd>=endInd){
            return;
        }
        int mid=(startInd+endInd)/2;
        getSorted(input,startInd,mid);
        getSorted(input,mid+1,endInd);
        
        getMerge(input,startInd,mid,endInd);
        
       
	}
    public static void getMerge(int[] input,int startInd,int mid,int endInd){
        int[]tempArray=new int[endInd-startInd+1];
        int s1=startInd;
        int s2=mid+1;
        int i=0;
        while(s1<=mid && s2<=endInd){
            if(input[s1]<=input[s2]){
                tempArray[i]=input[s1];
                s1++;
                i++;
            }else{
                tempArray[i]=input[s2];
                s2++;
                i++;
            }
            
        }
        while(s1<=mid){
               tempArray[i]=input[s1];
                s1++;
                i++;
           } 
        
        while(s2<=endInd){
            tempArray[i]=input[s2];
            s2++;
            i++;
        }
        for(int j=0;j<tempArray.length;j++){
            input[startInd+j]=tempArray[j];
        }
        
    }
}
