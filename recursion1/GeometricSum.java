package recursion1;

public class GeometricSum {
	public static double findGeometricSum(int k){
		if(k==0){
            return 1;
        }
        
        double sum=findGeometricSum(k-1);
        
        double tempAdd=1/Math.pow(2,k);
        
        return sum+tempAdd;

	}
}
