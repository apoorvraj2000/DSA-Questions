package practice_Question;

public class Check_Array_Rotation {
	public static int arrayRotateCheck(int[] arr){
        int ans=0;
		if(arr.length==1){
		ans=0;
		}else{
            int j=1;
            for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[j]){
                ans=i+1;
                break;
              }
               j++; 
        	}
        }
        
        return ans;
    }
}
