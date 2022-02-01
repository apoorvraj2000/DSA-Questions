package recursion1;

public class FirstIndexOfNumber {
	public static int firstIndex(int input[], int x) {
		
        return ans(input,x,0);
		
	}
    public static int ans(int input[], int x, int startIndex){
        if(startIndex==input.length-1){
            if(input[startIndex]==x)
                return startIndex;
            else
                return -1;
        }
        if(input[startIndex]==x)
            return startIndex;
        int result=ans(input,x,startIndex +1);
        return result;
    }
}
