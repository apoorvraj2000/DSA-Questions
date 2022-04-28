package DP_I;

public class Loot_Houses {
	
	//This is recursive solution
	 public static int helper(int[] houses, int ptr) {
			if(ptr>=houses.length)
	            return 0;
	        
	        if(ptr==houses.length-1)
	        	return houses[ptr];    
	        //loot the current house
	        int option1=houses[ptr]+helper(houses,ptr+2);
	        //do not loot the current house
	        int option2=helper(houses,ptr+1);
	        
	        return Math.max(option1,option2);
	 }
	 
	//This is dp solution
	 public static int maxMoneyLooted(int[] houses) {
	        if(houses.length==0)
	            return 0;
	        int n=houses.length;
			int[]dp=new int[n];
	        dp[0]=houses[0];
	        dp[1]=Math.max(dp[0],houses[1]);
	        for(int i=2;i<n;i++){
	            //loot the current  house also
	            int op1=houses[i]+dp[i-2];
	            //do not loot the current house
	            int op2=dp[i-1];
	            
	            //so the ans at current position is max of op1 and op2
	            dp[i]=Math.max(op1,op2);
	        }
	        return dp[n-1];
		}
	 
}
