package Recursion2;

public class Return_Subset_Of_an_Array {
	public static int[][] subsets(int input[]) {
		// Write your code here
        return subsets(input,0);

	}
    public static int[][] subsets(int input[],int index) {
		if(index>=input.length){
            int ans[][]=new int[1][0];
            return ans;
        }
		int smallAns[][]=subsets(input,index+1);
        
        int ans[][]=new int[smallAns.length*2][];
        int row=0;
        //copy smallAns into ans
        for(int i=0;i<smallAns.length;i++){
            ans[i]=new int[smallAns[i].length];
            for(int j=0;j<smallAns[i].length;j++){
                ans[row][j]=smallAns[i][j];
            }
            row++;  
        }
        // append current index in main ans;
        for(int i=0;i<smallAns.length;i++){
            ans[row+i]=new int[smallAns[i].length+1];
            ans[row+i][0]=input[index];
            
            for(int j=1;j<=smallAns[i].length;j++){
                ans[row+i][j]=smallAns[i][j-1];
            }
          
        }
        
        return ans;
        
	}
}
