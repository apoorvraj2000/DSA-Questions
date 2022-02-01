package recursion1;

public class Replace_pi_Recursive {
public static String replace(String input){
		
		return getString(input,0);
	}
    public static String getString(String input,int startIndex){
	
        if(startIndex==input.length()-1){
            return Character.toString(input.charAt(startIndex));
        }
        if(startIndex>input.length()-1){
            return "";
        }
        String ans="";
        if(input.charAt(startIndex)=='p'){
            if(input.charAt(startIndex+1)=='i'){
                ans+="3.14";
                ans+=getString(input,startIndex+2);
            }else{
                ans+="p";
                ans+=getString(input,startIndex+1);
            }
        }else{
            ans+=Character.toString(input.charAt(startIndex));
            ans+=getString(input,startIndex+1);
        }
        
		return ans;
        
	}
}
