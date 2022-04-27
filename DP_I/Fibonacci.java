package DP_I;

public class Fibonacci {

	public static void main(String[] args) {
		int n=4;
		System.out.println(fib(n));

	}

	public static int fib(int n) {
		int[]dpStorage=new int[n+1];
		for(int i=0;i<dpStorage.length;i++) {
			dpStorage[i]=-1;
		}
		return helper(n,dpStorage);
	}

     static int helper(int n, int[] dpStorage) {
		if(n==0 || n==1) {
			dpStorage[n]=n;
			return dpStorage[n];
		}
		if(dpStorage[n]!=-1) {
			return dpStorage[n];
		}
		dpStorage[n]=helper(n-1, dpStorage)+helper(n-2, dpStorage);
		
		return dpStorage[n];
	}

}
