package Recursion2;

public class ReplaceCharacterRecursively {
public static String replaceCharacter(String input, char c1, char c2) {
		
		return getString(input,c1,c2,0);
	}
    public static String getString(String input, char c1, char c2, int index) {
		if(index==input.length()-1){
            if(input.charAt(index)==c1){
                return Character.toString(c2);
            }else{
                return Character.toString(input.charAt(index));
            }
        }
        String currChar=Character.toString(input.charAt(index));
        String ans="";
        if(currChar.charAt(0)==c1){
            ans+=Character.toString(c2);
        }else{
            ans+=currChar;
        }
        ans+=getString(input,c1,c2,index+1);
        
		return ans;
	}
}
