package recursion1;

public class StringToInteger {
	public static int convertStringToInt(String input){
		
		return getInt(input,input.length()-1);
	}
    public static int getInt(String input,int index){
		
        if(index==0){
            char ch=input.charAt(index);
            return Integer.parseInt(String.valueOf(ch));
        }
		
        char ch=input.charAt(index);
        int currInt=Integer.parseInt(String.valueOf(ch));
        int ans=getInt(input,index-1);
        ans=(ans*10)+currInt;
        return ans;
	}
}
