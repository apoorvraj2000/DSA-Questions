package DP_II;

public class All_Possible_Ways {

	 public static int allWays(int x, int n) {
	        return helper(x,n,1);
	    }
	    
	     public static int helper(int x, int n, int i) {
	    	 //current value if we are taking current power
	         int curr=x-(int)Math.pow(i,n);
	         if(curr<0){
	             return 0;
	         }
	         
	        if(curr==0){
	            return 1;
	        }
	        //in case of taking
	        int op1=helper(curr,n,i+1);
	        //in case of not taking
	        int op2=helper(x,n,i+1);
	         
	        return op1+op2;
	    }
}
