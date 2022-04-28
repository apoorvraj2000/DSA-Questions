package DP_I;

import java.util.HashMap;

public class Byte_Landian {

	public static long bytelandian(long n, HashMap<Long, Long> memo) {
        if(n<=11)
            return n;
        
        if(memo.containsKey(n))
            return memo.get(n);
        
        memo.put(n,Math.max(n, bytelandian(n/2,memo)+bytelandian(n/3,memo)+bytelandian(n/4,memo)));
        
        return memo.get(n);
	}
}
