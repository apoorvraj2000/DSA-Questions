package DP_II;

public class Subset_Sum {
	//Recursive Solution
	 static boolean isSubsetPresentR(int[] arr, int n, int sum) {
	      return helperR(arr,0,sum);
	    }
	     static boolean helperR(int[] arr, int ind, int sum){
	    	 if(sum==0)
	             return true;
	         
	         if(ind==arr.length){
	             if(sum==0)
	                 return true;
	             
	             return false;
	         }
	         boolean op1=false,op2=false;
	         if(arr[ind]<=sum){
	             op1=helperR(arr,ind+1,sum-arr[ind]);
	         }
	         
	         op2=helperR(arr,ind+1,sum);
	         
	         if(op1==true)
	             return op1;
	         
	         return op2;
	     }
	     
	   //Memoization
	     static boolean isSubsetPresentM(int[] arr, int n, int sum) {
	 		int memo[][]=new int[n+1][sum+1];
	         for(int i=0;i<n+1;i++){
	             for(int j=0;j<sum+1;j++){
	                 memo[i][j]=-1;
	             }
	         }
	       
	         if(helperM(arr,0,sum,memo)==1)
	             return true;
	         
	         return false;
	     }
	      static int helperM(int[] arr, int ind, int sum, int memo[][]){
	          //0 --> false
	          //1 -->true
	          //-1 -->not visited
	          if(sum==0){
	              memo[ind][sum]=1;
	              return memo[ind][sum];
	          }
	              
	          
	          if(ind==arr.length){
	              if(sum==0){
	              memo[ind][sum]=1;
	              return memo[ind][sum];
	              }
	              
	               memo[ind][sum]=0;
	              return memo[ind][sum];
	          }
	          
	          if(memo[ind][sum]!=-1){
	              return memo[ind][sum];
	          }
	          
	          int op1=0,op2=0;
	          
	          if(arr[ind]<=sum){
	              op1=helperM(arr,ind+1,sum-arr[ind],memo);
	          }
	          
	          op2=helperM(arr,ind+1,sum,memo);
	          
	          if(op1==1 || op2==1){
	              memo[ind][sum]=1;
	              return memo[ind][sum];
	          }
	           
	           memo[ind][sum]=0;
	         return memo[ind][sum];
	      }
	      
	      //DP solution
	      static boolean isSubsetPresent(int[] arr, int n, int sum) {
	  		boolean [][]dp=new boolean[n+1][sum+1];
	  		
	  		for(int i=0;i<=n;i++) {
	  			dp[i][0]=true;
	  		}
	  	
	  		
	  		for(int i=1;i<=n;i++)
	  		{
	  			for(int j=1;j<=sum;j++)
	  			{
	  				dp[i][j]=dp[i-1][j];
	  				if(arr[i-1] <= j)
	  		     		dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
	  		     
	  			}
	  		}
	  		return dp[n][sum];  
	      }
}
