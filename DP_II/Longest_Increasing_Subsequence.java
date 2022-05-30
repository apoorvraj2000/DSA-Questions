package DP_II;

public class Longest_Increasing_Subsequence {

	public static int lis(int arr[]) {
        //THis array contain length of LIS ending at each index
       int lis[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            lis[i]=1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    lis[i]=Math.max(lis[j]+1,lis[i]);
                }
            }
        }
        int ans=0;
        for(int i:lis)
            ans=Math.max(i,ans);
        
        return ans;

    }
}
