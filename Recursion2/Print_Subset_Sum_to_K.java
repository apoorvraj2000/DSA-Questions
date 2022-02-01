package Recursion2;

public class Print_Subset_Sum_to_K {
	public static void printSubsetsSumTok(int input[], int k) {
		
        int output[]=new int[0];
        printSubsetsSumTok(input,k,0,output);
		
	}
    public static void printSubsetsSumTok(int input[], int k, int index, int outputSoFar[] ) {
		if(index==input.length){
            if(k==0){
                for(int i=0;i<outputSoFar.length;i++){
                    System.out.print(outputSoFar[i]+" ");
                }
               System.out.println();
                return;
            }else{
                return;
            }
        }
        int currOutput[]=new int[outputSoFar.length+1];
        
        for(int i=0;i<outputSoFar.length;i++){
            currOutput[i]=outputSoFar[i];
        }
        currOutput[currOutput.length-1]=input[index];
        //adding current index in output
        printSubsetsSumTok(input,k-input[index],index+1,currOutput);
        
        //not adding current index in output
        printSubsetsSumTok(input,k,index+1,outputSoFar);
		
	}
}
