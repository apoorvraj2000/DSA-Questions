package Queues;

import java.util.Queue;
import java.util.Stack;

public class Reverse_First_K_Elements_In_Queue {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
      	Stack<Integer>st=new Stack<>();
        
       for(int i=0;i<k;i++)
            st.push(input.poll());
        
        while(!st.isEmpty()){
            input.add(st.pop());
        }
    	for(int i=0;i<input.size()-k;i++){
            int val=input.poll();
            input.add(val);
        }
        return input;
	}
}
