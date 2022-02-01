package Recursion2;

public class Staircase {
public static int staircase(int n){
		
		if(n==0){
            return 1;
        }
         if(n<0){
             return 0;
         }
         int ans=0;
         ans+= staircase(n-1);
		 ans+= staircase(n-2);
         ans+=staircase(n-3);
         return ans;
	}
}
