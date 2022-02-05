package practice_Question;

public class Does_S_Contain_T {
	public static boolean checkSequence(String s, String t) {
		if(t.length()==0)
            return true;
        if(s.length()==0)
            return false;
        
        if(s.charAt(0)==t.charAt(0)){
            s=s.substring(1);
            t=t.substring(1);
        }else{
            s=s.substring(1);
        }
        return checkSequence(s,t);
	}
}
