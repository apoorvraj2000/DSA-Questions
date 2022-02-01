package Recursion2;

public class Print_Keypad_Combinations_Code {
	public static void printKeypad(int input){
		printKeypad(input,"");
		
	}
    public static void printKeypad(int input,String outputSoFar){
		if(input==0){
            System.out.println(outputSoFar);
            return;
        }
        int currNum=input%10;
        int num=input/10;
        String key=helper(currNum);
        if(key.length()==4){
             printKeypad(num , key.charAt(0)+outputSoFar);
             printKeypad(num , key.charAt(1)+outputSoFar);
             printKeypad(num , key.charAt(2)+outputSoFar);
             printKeypad(num , key.charAt(3)+outputSoFar);
        }else{
             printKeypad(num , key.charAt(0)+outputSoFar);
             printKeypad(num , key.charAt(1)+outputSoFar);
             printKeypad(num , key.charAt(2)+outputSoFar);
        }
		
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
