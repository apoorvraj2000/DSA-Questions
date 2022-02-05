package practice_Question;

import java.util.Arrays;

public class Maximum_Profit_on_App {
	public static int maximumProfit(int arr[]) {
		Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i]*(arr.length-i));
        }
        return ans;
	}
}
