package Recursion2;

public class Return_Subsets_Sum_to_K {
	public static int[][] subsetsSumK(int input[], int k) {
		
        return subsetsSumK(input,k,0);

	}
    public static int[][] subsetsSumK(int input[], int k,int index) {
		if(index==input.length){
             if(k==0){
           		int ans[][]=new int[1][0];
                 return ans;
        	}else{
                 int ans[][]=new int[0][0];
                 return ans;
             }
        }
       
        //adding the number
		int[][]smallAns1=subsetsSumK(input,k-input[index],index+1);
        
        //not adding the number
        int[][]smallAns2=subsetsSumK(input,k,index+1);
        
        int ans[][]=new int[smallAns1.length+smallAns2.length][];
        int row=0;
        //copy smallAns2 in main ans
        for(int i=0;i<smallAns2.length;i++){
            ans[row]= new int[smallAns2[i].length];
            for(int j=0;j<smallAns2[i].length;j++){
                ans[row][j]=smallAns2[i][j];
            }
            row++;
        }
        //add current element in ans ans copy smallAns1 in main ans
        for(int i=0;i<smallAns1.length;i++){
            ans[row+i]= new int[smallAns1[i].length+1];
            ans[row+i][0]=input[index];
            for(int j=1;j<=smallAns1[i].length;j++){
                ans[row+i][j]=smallAns1[i][j-1];
            }
        }
        return ans;
	}
}
