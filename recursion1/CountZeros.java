package recursion1;

public class CountZeros {
	public static int countZerosRec(int input){
        if(input<=9){
            if(input==0)
            	return 1;
            else 
                return 0;
        }
        int lastDigit=input%10;
       
         int ans=countZerosRec(input/10);
        if(lastDigit==0){
            ans=ans+1;
        }
       
        return ans;
	}
}
