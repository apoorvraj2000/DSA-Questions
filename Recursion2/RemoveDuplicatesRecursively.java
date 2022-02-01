package Recursion2;

public class RemoveDuplicatesRecursively {
	public static String removeConsecutiveDuplicates(String s) {
		
		return getString(s,0);
	}
    public static String getString(String s,int index) {
        if(index==s.length()-1){
            if(index!=0&&s.charAt(index)==s.charAt(index-1)){
                return "";
            }else{
                return Character.toString(s.charAt(index));
            }
        }
        String ans="";
        String currChar=Character.toString(s.charAt(index));
         if(index!=0&&s.charAt(index)==s.charAt(index-1)){
                ans+="";
            }else{
                ans+=Character.toString(s.charAt(index));
            }
        	ans+=getString(s,index+1);
			
			return ans;
	}
}
