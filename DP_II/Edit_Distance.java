package DP_II;

public class Edit_Distance {
	//This is recursive solution
	public static int editDistance(String s1, String s2){

		if(s1.length()==0)
            return s2.length();
        
        if(s2.length()==0)
            return s1.length();
        
        if(s1.charAt(0)==s2.charAt(0)){
            return editDistance(s1.substring(1),s2.substring(1));
        }else{
            //Delete a character
            int op1=1+editDistance(s1.substring(1),s2);
            //Replace a character with another one
            int op2=1+editDistance(s1.substring(1),s2.substring(1));
            //Insert a character
            int op3=1+editDistance(s1,s2.substring((1)));
            
            return Math.min(op1,Math.min(op2,op3));
        }

	}
	
	//This is Memoization solution
	public static int editDistanceM(String s, String t) {
        int m=s.length();
        int n=t.length();
		int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        return helper(s,t,dp);
    }
	public static int helper(String s, String t, int dp[][]) {
        int m=s.length();
        int n=t.length();
        if(m==0){
            dp[m][n]=n;
            return dp[m][n];
        }
        if(n==0){
            dp[m][n]=m;
            return dp[m][n];
        }
        
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        
        if(s.charAt(0)==t.charAt(0)){
            return helper(s.substring(1),t.substring(1),dp);
        }else{
            //Delete a character
            int op1=1+helper(s.substring(1),t,dp);
            //Replace a character with another one
            int op2=1+helper(s.substring(1),t.substring(1),dp);
            //Insert a character
            int op3=1+helper(s,t.substring(1),dp);
            
            dp[m][n]=Math.min(op1,Math.min(op2,op3));
            return dp[m][n];
        }
    }
}
