package DP_I;

public class Coin_Tower {
	public static String findWinner(int n, int x, int y) {
		if(n==1 || n==x || n==y)
         return "Beerus";
        
        int dp[]=new int[n+1];
        //1 stand for win and 0 stands for loose
        dp[1]=1;
       
        int op1=0, op2=0, op3=0;
        for(int i=2;i<=n;i++){
            if(i==x || i==y){
                dp[i]=1;
                continue;
            }
        	op1=dp[i-1]^1;
            
            if(i-x>=1){
               op2=dp[i-x]^1; 
            }
            
            if(i-y>=1){
                op3=dp[i-y]^1;
            }
            dp[i]=Math.max(op1,Math.max(op2,op3));
        }
        
        if(dp[n]!=0)
            return "Beerus";
            
        return "Whis";
	}

}
