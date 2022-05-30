package DP_II;

import java.util.Arrays;

public class Loot_Houses {
	 //Recursive solution
	 public static int helper(int[] houses,int ind) {
			if(ind>=houses.length){
	            return 0;
	        }
	        
	        int op1=0,op2=0;
	        //Taking current number
	        op1+=houses[ind]+helper(houses,ind+2);
	        
	        //not taking current number
	        op2+=helper(houses,ind+1);
	        
	        return Math.max(op1,op2);
		}
	 
	//Memoization
	 public static int maxMoneyLootedM(int[] houses) {
	        int n=houses.length;
	        int[]memo=new int[n+1];
	        Arrays.fill(memo,-1);
			return helperM(houses,0,memo);
		}
	    public static int helperM(int[] houses,int ind, int memo[]) {
	        
			if(ind>=houses.length){
	            return 0;
	        }
	        
	          if(memo[ind]!=-1){
	              return memo[ind];
	          }
	        
	        int op1=0,op2=0;
	        //Taking current number
	        op1+=houses[ind]+helperM(houses,ind+2,memo);
	        
	        //not taking current number
	        op2+=helperM(houses,ind+1,memo);
	        
	        memo[ind]=Math.max(op1,op2);
	        return memo[ind];
		}
	    
	    //DP
	    public static int maxMoneyLootedDp(int[] houses) {
	        if(houses.length==0)
	            return 0;
	        
	        int n=houses.length;
	        int[]dp=new int[n];
	    	
	        dp[0]=houses[0];
	        dp[1]=Math.max(dp[0],houses[1]);
	        
	        for(int i=2;i<n;i++){
	            dp[i]=Math.max(dp[i-1],houses[i]+dp[i-2]);
	        }
			return dp[n-1];
		}
}
