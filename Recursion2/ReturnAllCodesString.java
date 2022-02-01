package Recursion2;

public class ReturnAllCodesString {
	public static  String[] getCode(String input){
		if(input.length()==0){
            String ans[]={""};
            return ans;
        }
        
        int currIntiChar1=input.charAt(0)-'0';
        char currChar1=helper(currIntiChar1);
        
		String smallAns1[]=getCode(input.substring(1));
         for(int i=0;i<smallAns1.length;i++){
            smallAns1[i]=currChar1+smallAns1[i];
        }
        
        String smallAns2[]=new String[0];
    
        if(input.length()>=2){
            int currIntiChar2=input.charAt(0)-'0';
            int currIntiChar3=input.charAt(1)-'0';
            int currIntiChar4=(currIntiChar2*10)+currIntiChar3;
            
            if(currIntiChar4>=10 && currIntiChar4<=26){
                char currChar2=helper(currIntiChar4);
                
                smallAns2=getCode(input.substring(2));
                
                 for(int i=0;i<smallAns2.length;i++){
            			smallAns2[i]=currChar2+smallAns2[i];
                }
            }
              
        }
        String ans[]=new String[smallAns1.length+smallAns2.length];
        int k=0;
       	for(int i=0;i<smallAns1.length;i++){
            ans[k]=smallAns1[i];
            k++;
        }
        for(int i=0;i<smallAns2.length;i++){
            ans[k]=smallAns2[i];
            k++;
        }
        return ans;
        
	}
    public static char helper(int i){
		return (char)('a'+i-1);
	}
}
