package Recursion2;

public class Print_Permutations {
	public static void FindPermutations(String str) {
		
		FindPermutations(str,"");
	}
	public static void FindPermutations(String input, String outputSoFar) {
	if(input.length()==0){
        System.out.println(outputSoFar);
        return;
    }
    for(int i=0;i<input.length();i++){
        char a=input.charAt(i);
        String part1=input.substring(0,i);
        String part2=input.substring(i+1);
        String currInput=part1+part2;
        FindPermutations(currInput,a+outputSoFar);
    	}

	}
}
