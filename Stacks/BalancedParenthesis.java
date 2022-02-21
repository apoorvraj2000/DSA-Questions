package Stacks;

import java.util.Stack;

public class BalancedParenthesis {

	 public static boolean isBalanced(String str) {
	        Stack<Character>stack=new Stack<>();
	        boolean ans=true;
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
	                stack.push(str.charAt(i));
	            }
	            if(str.charAt(i)==')'){
	                if(stack.size()>0){
	                    if(stack.peek()=='('){
	                    stack.pop();
	                  }else{
	                    ans=false;
	                    break;
	                   }
	              }else{
	                    ans=false;
	                    break;
	                }
	                
	            }
	            if(str.charAt(i)==']'){
	                if(stack.size()>0){
	                    if(stack.peek()=='['){
	                    stack.pop();
	                  }else{
	                    ans=false;
	                    break;
	                   }
	              }else{
	                    ans=false;
	                    break;
	                }
	                
	            }
	            if(str.charAt(i)=='}'){
	                if(stack.size()>0){
	                    if(stack.peek()=='{'){
	                    stack.pop();
	                  }else{
	                    ans=false;
	                    break;
	                   }
	              }else{
	                    ans=false;
	                    break;
	                }
	                
	            }
	        }
	        if(stack.size()==0)
	        return ans;
	        
	        return false;
	    }
}
