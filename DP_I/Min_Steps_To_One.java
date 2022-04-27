package DP_I;

public class Min_Steps_To_One {
	//This is Recursive solution
	public static int countMinStepsToOne(int n) {
        if(n==1)
            return 0;
        
         int op1=countMinStepsToOne(n-1);
         int op2=Integer.MAX_VALUE;
         int op3=Integer.MAX_VALUE;
        
        if(n%2==0){
            op2=countMinStepsToOne(n/2);
        }
		if(n%3==0){
            op3= countMinStepsToOne(n/3);
        }
       return 1+Math.min(op1,Math.min(op2,op3));
    }
	//This is DP solution
	public static int countMinStepsToOneDP(int n) {

     	 int []dp=new int[n+1]; 
       dp[1]=0;
       for(int i=2;i<=n;i++){
           int min=dp[i-1];
           if(i%3==0){
               if(min>dp[i/3]){
                   min=dp[i/3];
               }
           }
            if(i%2==0){
               if(min>dp[i/2]){
                   min=dp[i/2];
               }
           }
           dp[i]=min+1;
       }
      return dp[n];
	}
}
