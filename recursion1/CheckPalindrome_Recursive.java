package recursion1;

public class CheckPalindrome_Recursive {
	public static boolean isStringPalindrome(String input) {
		String s=input;
        String temp=getReverseString(input,0);
        if(s.equals(temp))
            return true;
        else
            return false;
	}
    public static String getReverseString(String input,int startIndex) {
		if(input.length()==1){ 
            return input;
        }
        if(startIndex==input.length()-1){
            return Character.toString(input.charAt(0));
        }
		String currChar=Character.toString(input.charAt(startIndex));
        
        String tempAns=getReverseString(input,startIndex+1);
        
        String ans=tempAns+currChar;
        return ans;
	}
}
