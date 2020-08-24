package other;
class Solution18 {
    public void rotate(int[][] matrix) {
        
    	if(matrix.length==0 || matrix.length!=matrix[0].length){
    		return;
    	}
    	
    	for(int i=0;i<matrix.length/2;i++){
    		int first = i;
    		int last = matrix.length-1-i;
    		for(int j=first;j<last;j++){
    			
    			int offset=j-first;
    			int top = matrix[first][j];
    			matrix[first][j]=matrix[last-offset][first];
    			matrix[last-offset][first]=matrix[last][last-offset];
    			matrix[last][last-offset]=matrix[j][last];
    			matrix[j][last]=top;
    			
    		}
    		
    		
    	}
    	
    }

}
public class RotateMatrix {

	public static void main(String args[]){
		
		Solution18 s = new Solution18();
		
		
		
	}
}
