package recursion1;

public class CheckNumberInArray {
public static boolean checkNumber(int input[], int x) {
		
		if(input.length==1||input[0]==x){
          if(input[0]==x)
              return true;
            else 
                return false;
        }
        int temp[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            temp[i-1]=input[i];
        }
        boolean ans=checkNumber(temp,x);
        return ans;
	}
}
