package DP_II;

public class Matrix_Chain_Multiplication {
	//Recursive Solution
	public static int mcmR(int[] p){
		if(p.length==1)
            return 0;
        
        return helperR(p,1,p.length-1);
	}
    public static int helperR(int[]p, int i, int j){
        if(i==j)
            return 0;
        
        int min=Integer.MAX_VALUE;
        
        //to check all the pattern
        for(int k=i;k<j;k++){
            int steps=p[i-1]*p[k]*p[j] + helperR(p,i,k) + helperR(p,k+1,j);
            min=Math.min(min,steps);
        }
        
        return min;
    }
    
    //Memoization Solution
    public static int mcmM(int[] p){
		if(p.length==1)
            return 0;
        int memo[][]=new int[p.length][p.length];
        for(int i=0;i<p.length;i++){
           for(int j=0;j<p.length;j++){
               memo[i][j]=-1;
           }
        }
        return helperM(p,1,p.length-1,memo);
	}
    public static int helperM(int[]p, int i, int j, int memo[][]){
        if(i==j){
            memo[i][j]=0;
            return memo[i][j];
        }
      
        if(memo[i][j]!=-1)
            return memo[i][j];
        
        int min=Integer.MAX_VALUE;
        
        //to check all the pattern
        for(int k=i;k<j;k++){
            int steps=p[i-1]*p[k]*p[j] + helperM(p,i,k,memo) + helperM(p,k+1,j,memo);
            min=Math.min(min,steps);
        }
        
        	memo[i][j]=min;
            return memo[i][j];
    }
}
