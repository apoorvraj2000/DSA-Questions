package DP_I;

public class Number_Of_Balanced_BTs {
	//This is Recursive solution
	static int mod=(int) (Math.pow(10,9)+7);
	public static long balancedBTs(long n){

		if(n==1) return 1L;
        
        if(n==2) return 3L;
        long x=balancedBTs(n-1);
        long y=balancedBTs(n - 2);
        
        long value1=(long)(x*x) % mod;
        long value2=(long) (2*x*y) % mod;
        return (value1+value2) % mod;
	}
	
	//This is DP solution
	public static int balancedBTs(int height){

		int dp[]=new int[height+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=3;
        
        for(int i=3;i<=height;i++){
            long a=(long)dp[i-1];
            long b=(long)dp[i-2];
            
            int value1=(int)(a * a % mod);
            int value2=(int)(2 * a * b % mod);
            dp[i]=(value1+value2)%mod;
        }
		
       return dp[height];
	}
}
