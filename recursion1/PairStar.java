package recursion1;

public class PairStar {
	public static String addStars(String s) {
		return addStars(s,s.length()-1);
	}
    public static String addStars(String s,int index) {
		if(index==0){
            return Character.toString(s.charAt(index));
        }
        String currChar=Character.toString(s.charAt(index));
        String currAns=addStars(s,index-1);
        String ans="";
        if(currAns.charAt(currAns.length()-1)==currChar.charAt(currChar.length()-1)){
            ans+=currAns+"*"+currChar;
        }else{
            ans+=currAns+currChar;
        }
        return ans;
	}
}
