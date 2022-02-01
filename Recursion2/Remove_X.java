package Recursion2;

public class Remove_X {
public static String removeX(String input){
		
		return getString(input,0);
	}
    public static String getString(String input,int index){
		if(index==input.length()-1){
            if(input.charAt(index)!='x'){
                return Character.toString(input.charAt(index));
            }else{
                return "";
            }
        }
        
        String currChar=Character.toString(input.charAt(index));
        String ans="";
        if(!currChar.equals("x")){
            ans+=currChar;
        }
        ans+=getString(input,index+1);
        return ans;
	}
}
