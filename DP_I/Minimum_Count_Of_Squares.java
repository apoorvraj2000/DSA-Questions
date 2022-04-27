package DP_I;

public class Minimum_Count_Of_Squares {
	//This is recursive solution
	public static int minCountRecursion(int n) {
		if(n==1)
            return 1;
        if(n<=0)
            return 0;
        int ans=Integer.MAX_VALUE;

        for(int i=1;i*i<=n;i++){
            int count=1+minCountRecursion(n-(int)Math.pow(i,2));
            ans=Math.min(count,ans);
        }
        return ans;
	}
	//This is DP Solution
	public static int minCount(int n) {
		int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int rem=i-(j*j);
                min=Math.min(dp[rem],min);
            }
            dp[i]=1+min;
        }
        return dp[n];
	}
}
