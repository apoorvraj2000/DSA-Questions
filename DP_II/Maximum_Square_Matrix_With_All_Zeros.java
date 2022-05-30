package DP_II;

public class Maximum_Square_Matrix_With_All_Zeros {
	public static int findMaxSquareWithAllZeros(int[][] input){
        int row=input.length;
        if(row==0)
            return 0;
        int col=input[0].length;
        
        
		//this array contains length of largest square ending at an index
        int [][]dp=new int[row][col];
        int maxLength=0;
        for(int i=0;i<row;i++){
            if(input[i][0]==0){
                dp[i][0]=1;
            }else{
                dp[i][0]=0;
            }
            maxLength=Math.max(maxLength,dp[i][0]);
        }
		
        for(int j=0;j<col;j++){
            if(input[0][j]==0){
                dp[0][j]=1;
            }else{
                dp[0][j]=0;
            }
            maxLength=Math.max(maxLength,dp[0][j]);
        }
        
        
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(input[i][j]==0){
                    int a=dp[i-1][j];
                    int b=dp[i][j-1];
                    int c=dp[i-1][j-1];
                    
                    int min=Math.min(a,Math.min(b,c));
                    dp[i][j]=min+1;
                }else{
                    dp[i][j]=0;
                }
                 maxLength=Math.max(maxLength,dp[i][j]);
            }
        }
        
        return maxLength;
	
	}
}
