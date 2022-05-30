package DP_II;

public class Knapsack_0_1 {
	//Recursive 
	public static int helper(int[] weights, int[] values, int ind, int maxWeight) {
        if(ind==weights.length || maxWeight==0){
            return 0;
        }
        
        int op1=0,op2=0,op3=0;
        if(weights[ind]>maxWeight){
            //skip the current weight
            op1+=helper(weights,values,ind+1,maxWeight);
        }else{
            //take the current weight
            op2+=values[ind]+helper(weights,values,ind+1,maxWeight-weights[ind]);
            
            //do not take the current weight
            op3+=helper(weights,values,ind+1,maxWeight);
        }
		return Math.max(op1,Math.max(op2,op3));
	}
	
	//Memoization
	 static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
	        
			int memo[][]=new int[maxWeight+1][n+1];
	        for(int i=0;i<memo.length;i++){
	            for(int j=0;j<memo[i].length;j++){
	                memo[i][j]=-1;
	            }
	        }
	        
	        return helperMemo(weight,value,0,maxWeight,memo);
	    }
	    static int helperMemo(int[] weight, int[] value, int ind, int maxWeight, int[][]memo){
	        if(memo[maxWeight][ind]!=-1){
	            return memo[maxWeight][ind];
	        }
	        //Base case
	        if(ind==weight.length || maxWeight==0){
	            memo[maxWeight][ind]=0;
	             return memo[maxWeight][ind];
	        }
	        int op1=0,op2=0,op3=0;
	        if(weight[ind]>maxWeight){
	            //skip the current weight
	            op1+=helperMemo(weight,value,ind+1,maxWeight,memo);
	        }else{
	            //take the current weight
	            op2+=value[ind]+helperMemo(weight,value,ind+1,maxWeight-weight[ind],memo);
	            
	            //do not take the current weight
	            op3+=helperMemo(weight,value,ind+1,maxWeight,memo);
	        }
	         memo[maxWeight][ind]=Math.max(op1,Math.max(op2,op3));
	         return memo[maxWeight][ind];
	    }
	    
	    // DP solution
	    
	    static int knapsackDp(int[] weight, int[] value, int n, int maxWeight) {
	        
			int dp[][]=new int[n+1][maxWeight+1];
	        for(int i=0;i<dp[n].length;i++){
	           dp[n][i]=0;
	        }
	        int ans=0;
	        //for index
	        for(int r=n-1;r>=0;r--){
	            //for weight
	            for(int c=0;c<dp[r].length;c++){
	                //including
	                if(weight[r]<=c){
	                    //not taking current weight
	                    int op1=dp[r+1][c];
	                    
	                    //taking current weight
	                    int op2=value[r]+dp[r+1][c-weight[r]];
	                    dp[r][c]=Math.max(op1,op2);
	                }
	                //excluding
	                if(weight[r]>c){
	                  dp[r][c]=dp[r+1][c];        
	                }
	                ans=Math.max(ans,dp[r][c]);
	            }
	        }
			
	        return ans;
	    }
}
