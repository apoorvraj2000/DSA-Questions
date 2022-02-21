package Queues;

import java.util.Queue;

public class ReverseQueue {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        if(input.isEmpty()){
            return;
        }
        int val=input.poll();
        reverseQueue(input);
        input.add(val);
	}
}
