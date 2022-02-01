package recursion1;

public class Multiplication_Recursive {
	public static int multiplyTwoIntegers(int m, int n){
		if(m==0||n==0){
            return 0;
        }
        int sum=m+multiplyTwoIntegers(m,n-1);
        return sum;
	}
}
