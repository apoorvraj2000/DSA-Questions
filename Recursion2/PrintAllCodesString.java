package Recursion2;

public class PrintAllCodesString {
	public static void printAllPossibleCodes(String input) {
		
        printAllPossibleCodes(input,"");

	}
    public static void printAllPossibleCodes(String input,String outputSoFar) {
		if(input.length()==0){
            System.out.println(outputSoFar);
            return;
        }
        
        int currIntChar1=input.charAt(0)-'0';
        char currChar1=helper(currIntChar1);
       
        printAllPossibleCodes(input.substring(1),outputSoFar+currChar1);
        
        if(input.length()>=2){
            int currIntChar2=input.charAt(0)-'0';
             int currIntChar3=input.charAt(1)-'0';
            int currIntChar4=(currIntChar2*10)+currIntChar3;
            if(currIntChar4>=10 && currIntChar4<=26){
                char currChar2=helper(currIntChar4);
                
                printAllPossibleCodes(input.substring(2),outputSoFar+currChar2);
            }
        }

	}
     public static char helper(int i){
		return (char)('a'+i-1);
	}
}
