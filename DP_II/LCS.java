package DP_II;

public class LCS {
     //This is recursive solution
	 public int longestCommonSubsequence(String text1, String text2) {
	        if(text1.length()==0 || text2.length()==0){
	            return 0;
	        }
	        
	        if(text1.charAt(0)==text2.charAt(0)){
	            
	            return 1+ longestCommonSubsequence(text1.substring(1),text2.substring(1));
	            
	        }else{
	            
	        	 int op1=longestCommonSubsequence(text1.substring(1),text2);
	             
	             int op2=longestCommonSubsequence(text1,text2.substring(1));
	             
	             return Math.max(op1,op2);
	        }
	    }
	 
	 //This is Memorization solution
	 public int longestCommonSubsequenceM(String text1, String text2) {
         int m=text1.length()+1;
         int n=text2.length()+1;
        
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return helper(text1,text2,dp);
    }
    public int helper(String text1, String text2, int [][]dp){
        int m=text1.length();
        int n=text2.length();
        
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        
        if(m==0 || n==0){
            dp[m][n]=0;
            return dp[m][n];
        }
        
        if(text1.charAt(0)==text2.charAt(0)){
            
            dp[m][n]= 1+ helper(text1.substring(1),text2.substring(1),dp);
            
        }else{
            
            int op1=helper(text1.substring(1),text2,dp);
            
            int op2=helper(text1,text2.substring(1),dp);
            
            dp[m][n]=Math.max(op1,op2);
            
        }
        return dp[m][n];
    }
    
    //This is DP solution
    public int longestCommonSubsequenceDP(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
       
       int dp[][]=new int[m+1][n+1];
       
       for(int i=0;i<=m;i++){
           dp[i][0]=0;
       }
       
       for(int j=0;j<=n;j++){
           dp[0][j]=0;
       }
       
       for(int i=1;i<=m;i++){
           for(int j=1;j<=n;j++){
               if(text1.charAt(m-i)==text2.charAt(n-j)){
                   dp[i][j]=1+dp[i-1][j-1];
               }else{
                   dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
               }
           }
       }
       return dp[m][n];
   }
}
