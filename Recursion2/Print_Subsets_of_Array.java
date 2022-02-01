package Recursion2;

public class Print_Subsets_of_Array {
	public static void printSubsets(int input[]) {
		
        	int[]outputSoFar={};
         printSubsets(input,0,outputSoFar);
	}
    public static void printSubsets(int input[],int index,int[]outputSoFar) {
		if(index==input.length){
			for(int i=0;i<outputSoFar.length;i++){
                System.out.print(outputSoFar[i]+" ");
            }
            System.out.println();
            return;
        }	
		int[]currAns=new int[outputSoFar.length+1];
        int k=0;
        for(int i=0;i<outputSoFar.length;i++){
            currAns[k]=outputSoFar[i];
            k++;
        }
        currAns[k]=input[index];
        
        //in case of adding
        printSubsets(input,index+1,currAns);
        
        //in case of not adding
        printSubsets(input,index+1,outputSoFar);
        
	}	
}
