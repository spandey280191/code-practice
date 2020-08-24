package other;
class Solution12 {
    public int strStr(String haystack, String needle) {
        
        int length1 = haystack.length();
        int length2 = needle.length();
                
    	if(length1==0 && length2==0){
    		return 0;
    	}
    	if(length1==0){
    		return -1;
    	}
        if(length2==0){
    		return 0;
    	}
        char arr1[] = haystack.toCharArray();
        char arr2[] = needle.toCharArray();

        int i=0,r=0,start=0;
        for(i=0;i<length1;i++){
        	
        	if(arr1[i]==arr2[r]){
        		if(r==0){
        			start=i;
        		}
        		r++;
                if(r>=length2){
                    break;
                }
        	}else if(r>0){
        		r=0;
        		i=start;
        	}
        }
       if(r!=length2){
    	   return -1;
       }
        return i+1-length2;
    
        
    }
}
public class ImplementstrStr {

	public static void main(String[] args) {
		Solution12 s = new Solution12();
		System.out.println(s.strStr("hello", "ll"));

	}

}
