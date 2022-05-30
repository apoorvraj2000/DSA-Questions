package DP_II;

public class Smallest_Super_Sequence {
	
	//Recursive solution
	public static int smallestSuperSequence(String str1, String str2) {

        if(str1.length()==0){
            return str2.length();
        }
        
         if(str2.length()==0){
            return str1.length();
        }
        
        //if 1st char in both the string is same
        if(str1.charAt(0)==str2.charAt(0)){
            return 1+smallestSuperSequence(str1.substring(1),str2.substring(1));
        }
        else{
            //if 1st char in both the string is not same
            int op1=1+smallestSuperSequence(str1.substring(1),str2);
            
            int op2=1+smallestSuperSequence(str1,str2.substring(1));
            
            return Math.min(op1,op2);
        }   
    }
	//Memoization
	public static int smallestSuperSequenceM(String str1, String str2) {
		int m=str1.length()+1;
        int n=str2.length()+1;
        
        int [][]memo=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                memo[i][j]=-1;
            }
        }
        
        return helperM(str1,str2,memo);
    }
    public static int helperM(String str1, String str2, int [][]memo) {
        if(str1.length()==0){
            memo[str1.length()][str2.length()]=str2.length();
            return memo[str1.length()][str2.length()];
        }
        
         if(str2.length()==0){
              memo[str1.length()][str2.length()]=str1.length();
              return memo[str1.length()][str2.length()];
        }
        
        if( memo[str1.length()][str2.length()]!=-1){
            return memo[str1.length()][str2.length()];
        }
        
        //if 1st char in both the string is same
        if(str1.charAt(0)==str2.charAt(0)){
            
            memo[str1.length()][str2.length()]= 1+helperM(str1.substring(1),str2.substring(1),memo);
            
            return memo[str1.length()][str2.length()];
        }
        else{
            //if 1st char in both the string is not same
            int op1=1+helperM(str1.substring(1),str2,memo);
            
            int op2=1+helperM(str1,str2.substring(1),memo);
            
             memo[str1.length()][str2.length()]= Math.min(op1,op2);
            
            return memo[str1.length()][str2.length()];
        }
    }
    
    //DP Solution
    
    public static int smallestSuperSequenceDp(String str1, String str2) {
		int m=str1.length();
        int n=str2.length();
        int tempM=m;
        int tempN=n;
        int [][]dp=new int[m+1][n+1];
        //fillin the last row
        for(int i=0;i<n+1;i++){
            dp[m][i]=tempN--;
        }
        //fill the last col
        for(int j=0;j<m+1;j++){
            dp[j][n]=tempM--;
        }
        
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(str1.charAt(i)==str2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
               }else{
                    int op1=1+dp[i+1][j];
                    int op2=1+dp[i][j+1];
                    dp[i][j]=Math.min(op1,op2);
                }
            }
        }
        
       return dp[0][0];
    }
	
}
