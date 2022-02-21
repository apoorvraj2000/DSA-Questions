package Stacks;

import java.util.Stack;

public class MinimumBracketReversal {

	public static int countBracketReversals(String input) {
        Stack<Character>st=new Stack<>();
        int count=0;
        if(input.length()%2!=0)
            return -1;
        
		for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='{'){
                st.push('{');
            }
            else{
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }else{
                    st.push('}');
                }
            }
        }
        
        while(!st.isEmpty()){
            char c1=st.pop();
            char c2=st.pop();
            
            if(c1==c2){
                count+=1;
            }
            if(c1!=c2){
                count+=2;
            }
        }
       return count;
	}
}
