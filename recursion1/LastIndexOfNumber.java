package recursion1;

public class LastIndexOfNumber {
	public static int lastIndex(int input[], int x) {
		
        return result(input,x,0);
	}
    private static int result(int input[], int x,int startIndex){
        if(startIndex==input.length-1){
            if(input[startIndex]==x){
                return startIndex;
            }else{
                return -1;
            }
        }
        int temp=-1;
        if(input[startIndex]==x){
            temp=startIndex;
        }
        int ans=result(input,x,startIndex+1);
        if(ans>temp){
            return ans;
        }else{
            return temp;
        }
    }
}
