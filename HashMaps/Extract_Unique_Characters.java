package HashMaps;

import java.util.*;

public class Extract_Unique_Characters {
	
	public static String uniqueChar(String str){
		Map<Character,Boolean>store=new HashMap<>();
        String ans="";
        for(int i=0;i<str.length();i++){
            if(store.containsKey(str.charAt(i)))
                continue;
            
            ans+=str.charAt(i);
            store.put(str.charAt(i),true);
        }
        return ans;
	}
}
