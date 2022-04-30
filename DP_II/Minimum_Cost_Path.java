package DP_II;

public class Minimum_Cost_Path {
	//This is recursive solution
	public static int minCostPath(int[][] input) {
        return helper(input,0,0);
	}
    public static int helper(int[][] input, int i, int j) {
		if(i==input.length-1 && j==input[0].length-1){
            return input[i][j];
        }
        if(i>=input.length || j>=input[0].length)
            return Integer.MAX_VALUE;
        
        //Go down
        int option1=helper(input,i+1,j);
        //Go diagonally
        int option2=helper(input,i+1,j+1);
        //Go right
        int option3=helper(input,i,j+1);
        
        //Add current and minimum of all three option
        int ans=input[i][j]+Math.min(option1,Math.min(option2,option3));
        
        return ans;
	}
    
    //This is memorization solution
    public static int minCostPathM(int[][] input) {
		int m=input.length;
        int n=input[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return helper(input,0,0,dp);
	}
    public static int helper(int[][] input, int i, int j, int[][]dp) {
		if(i==input.length-1 && j==input[0].length-1){
            dp[i][j]=input[i][j];
            return dp[i][j];
        }
        if(i>=input.length || j>=input[0].length)
            return Integer.MAX_VALUE;
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        //Go down
        int option1=helper(input,i+1,j,dp);
        //Go diagonally
        int option2=helper(input,i+1,j+1,dp);
        //Go right
        int option3=helper(input,i,j+1,dp);
        
        //Add current and minimum of all three option
        int ans=input[i][j]+Math.min(option1,Math.min(option2,option3));
        dp[i][j]=ans;
        return dp[i][j];
	}
    
    //This is DP solution
    public static int minCostPathDP(int[][] input) {
        //row 
		int m=input.length;
        //col
        int n=input[0].length;
        int[][] dp=new int[m][n];
        
        dp[m-1][n-1]=input[m-1][n-1];
        
        //fill last row
        for(int j=n-2;j>=0;j--){
            dp[m-1][j]=dp[m-1][j+1]+input[m-1][j];
        }
        
        //fill last col
        for(int i=m-2;i>=0;i--){
            dp[i][n-1]=dp[i+1][n-1]+input[i][n-1];
        }
        
        //now fill all the row which are empty from left to right
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=input[i][j]+Math.min(dp[i+1][j],
                                              Math.min(dp[i+1][j+1],dp[i][j+1]));
            }
        }
        return dp[0][0];
       
	}
    
}
