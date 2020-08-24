package other;

public class Perfect2 {
    public static int isPerfectPower(int n) {
    	
    	int isLargest=0;
        for (int i = 2; i < Math.log(n) / Math.log(2) + 1; i++) {
//        	for (int i = 2; i < n; i++) {
            for (int j = 2; Math.pow(j, i) <= n; j++) {
                if (Math.pow(j, i) == n) {
                	isLargest=i;
                }
            }
        }
        return isLargest;
    }
    
public static void main(String arg[]){	
		
		System.out.println(Perfect2.isPerfectPower(1073741824));
		
		System.out.println(Perfect2.isPerfectPower(625));
		System.out.println(Math.getExponent(1073741824));
	}
}
