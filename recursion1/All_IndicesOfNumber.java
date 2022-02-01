package recursion1;

public class All_IndicesOfNumber {
	public static int[] allIndexes(int input[], int x) {
        return result(input,x,0);
	}
	public static int[] result(int input[],int x,int startIndex){
        if(startIndex==input.length){
            return new int[0];
        }
        int tempAns[]=result(input,x,startIndex+1);
        if(input[startIndex]==x){
            int ans[]=new int[tempAns.length+1];
            ans[0]=startIndex;
            for(int j=0;j<tempAns.length;j++){
                ans[j+1]=tempAns[j];
            }
            return ans;
        }else{
            return tempAns;
        }     
    }
}
