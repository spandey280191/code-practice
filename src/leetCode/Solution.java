package leetCode;
import java.util.HashMap;

class Solution {
    public String countAndSay(int n) {
        
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        String str;
        map.put(1,"1");
//        map.put(2,"11");
        for(int i=2;i<=n;i++){
            str=map.get(i-1);
            int count=1;
            String temp="";
            int j=0;
            for( ;j<str.length();j++){
                
                if( (j==str.length()-1 || str.charAt(j)!=str.charAt(j+1))){
                	   temp = temp + count + String.valueOf(str.charAt(j));
                       count=1;
                }else{
                    count++;
                }

                
            }
            str=temp;
            map.put(i,str);
        }
    return map.get(n);
    
    
    }
    
    public static void main(String args[]){
    	
    	Solution s = new Solution();
    	System.out.println(s.countAndSay(4));
    }
}