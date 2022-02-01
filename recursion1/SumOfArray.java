package recursion1;

public class SumOfArray {
	public static int sum(int input[]) {
		if(input.length==1){
            return input[input.length-1];
        }
			int []temp=new int[input.length-1];
        for(int i=1;i<input.length;i++){
        	temp[i-1]=input[i];     
        }
        int sum=input[0]+sum(temp);
        return sum;
	}
}
