package DP_II;

public class Ways_To_Make_Coin_Change {
	//Recursive Solution
	public static int helper(int arr[], int ind, int value){
        if(ind==arr.length){
              if(value==0){
                   return 1;
              }
            return 0;
        }
        
        int op1=0,op2=0;
        //including current coin
        if(arr[ind]<=value){
             op1+=helper(arr,ind,value-arr[ind]);
        }
        //excluding current coin
         op2+=helper(arr,ind+1,value);

        return op1+op2;
	}
	
	public static int countWaysToMakeChangeM(int denominations[], int value){
        // Write your code here
        int n=denominations.length;
        int memo[][]=new int[n+1][value+1];
            for(int i=0;i<memo.length;i++){
                for(int j=0;j<memo[i].length;j++){
                    memo[i][j]=-1;
                }
            }
        return helperM(denominations,0,value,memo);
        
	}
	public static int helperM(int arr[], int ind, int value, int memo[][]){
        if(ind==arr.length){
              if(value==0){
                  memo[ind][value]=1;
                   return memo[ind][value];
              }
            
             memo[ind][value]=0;
             return memo[ind][value];
        }
        if(memo[ind][value]!=-1)
            return memo[ind][value];
        
        int op1=0,op2=0;
        //including current coin
        if(arr[ind]<=value){
             op1+=helperM(arr,ind,value-arr[ind],memo);
        }
        //excluding current coin
         op2+=helperM(arr,ind+1,value,memo);

         memo[ind][value]=op1+op2;
         return memo[ind][value];
	}
}
