package recursion1;

public class SumOfDigits_Recursive {
	public static int sumOfDigits(int input){

        if(input==0){
            return 0;
        }
        int lastDigit=input%10;
        int ans=sumOfDigits(input/10);
        
        return ans+lastDigit;

	}
}
