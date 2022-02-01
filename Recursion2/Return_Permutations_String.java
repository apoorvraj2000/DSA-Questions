package Recursion2;

public class Return_Permutations_String {
	public static String[] permutationOfString(String input){
		
		if(input.length()==0){
            String[]temp={""};
            return temp;
        }
        
       String ans[]=new String[fact(input.length())];
        int k=0;
        for(int i=0;i<input.length();i++){
            char a=input.charAt(i);
            String part1=input.substring(0,i);
            String part2=input.substring(i+1);
            String currInput=part1+part2;
            String smallAns[]=permutationOfString(currInput);
            
            for(int j=0;j<smallAns.length;j++){
                String temp=a+smallAns[j];
                ans[k]=temp;
                k++;
            }
            
        }	
        return ans;
	}
   
    public static int fact(int i){
        if(i==1){
            return i;
        }
        int ans=i*fact(i-1);
        return ans;
    }
}
