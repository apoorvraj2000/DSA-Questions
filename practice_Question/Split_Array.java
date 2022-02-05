package practice_Question;

public class Split_Array {
	public static boolean splitArray(int input[]) {
		
		return splitArray(input,0,0,0);
	}
	public static boolean splitArray(int input[],int index,int div3,int div5) {
		if(index==input.length)
            return div3==div5;
        
        if(input[index]%3==0)
            div3+=input[index];
        
        else if(input[index]%5==0)
            div5+=input[index];
        
        else{
            return (splitArray(input,index+1,div3+input[index],div5)||splitArray(input,index+1,div3,div5+input[index]));
        }
		return splitArray(input,index+1,div3,div5);
	}
}
