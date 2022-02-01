package Recursion2;

public class Return_Keypad_Code {
	public static String[] keypad(int n){
		
        if(n==0||n==1){
            String[] ans={""};
            return ans;
        }
        int currNum=n%10;
        
        String smallAns[]=keypad(n/10);
        
        String key=helper(currNum);
        
        int k=0;
        
        String []ans=new String[smallAns.length*key.length()];

        for(int i=0;i<key.length();i++){
            for(int j=0;j<smallAns.length;j++){
                ans[k]=smallAns[j]+Character.toString(key.charAt(i));
                k++;
            }
        }
        
        return ans;

	}
	public static String helper(int n){
		String s="";
		if(n==2)
           s= "abc";
  
        if(n==3)
        	s= "def";
      
        if(n==4)
        	s= "ghi";
       
        if(n==5)
        	s= "jkl";
       
        if(n==6)
        	s= "mno";
         
        if(n==7)
            s= "pqrs";
  
        if(n==8)
             s= "tuv";
     
        if(n==9)
             s= "wxyz";
      
        return s;
	}
}
