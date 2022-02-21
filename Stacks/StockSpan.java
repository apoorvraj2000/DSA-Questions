package Stacks;

import java.util.Stack;

public class StockSpan {

	public static int[] stockSpan(int[] price) {
		
        int ans[]=new int[price.length];
        Stack<Integer>st=new Stack<>();
        st.push(0);
        ans[0]=1;
        for(int i=1;i<price.length;i++){
  
               while(!st.isEmpty() && price[st.peek()]<price[i]){
                  st.pop();
               }
              
            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-st.peek();
            }
            
          st.push(i);
	}
      return ans;
  }
}
