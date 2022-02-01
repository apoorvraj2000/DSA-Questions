package recursion1;

public class Remove_X {
	public static String removeX(String input){
        return getString(input,0);
	}
    public static String getString(String input,int index){
		
		if(index==input.length()-1){
            if(input.charAt(index)!='x')
            return Character.toString(input.charAt(index));
            else
                return "";
        }
        
        String c=Character.toString(input.charAt(index));
        String ans="";
        if(!c.equals("x")){
            ans+=c;
            ans+=getString(input,index+1);
        }else{
            ans+=getString(input,index+1);
        }
                                    
        return ans;                    
        
	}
}
