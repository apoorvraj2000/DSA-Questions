package Stacks;

import java.util.Stack;

public class CheckRedundantBrackets {

	public static boolean checkRedundantBrackets(String str) {
		Stack<Character>st=new Stack<>();
        boolean ans=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=')'){
                st.push(str.charAt(i));
            }else{
                int countBet=0;
                while(st.peek()!='('){
                    st.pop();
                    countBet++;
                }
                st.pop();
                if(countBet<=1){
                    ans=true;
                    break;
                }
            }
        }
        return ans;
	}
}
