package leetCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution9 {
	HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
	
	Solution9(){
		hashMap.put(2, "abc");
		hashMap.put(3, "def");
		hashMap.put(4, "ghi");
		hashMap.put(5, "jkl");
		hashMap.put(6, "mno");
		hashMap.put(7, "pqrs");
		hashMap.put(8, "tuv");
		hashMap.put(9, "wxyz");
	}
	
    public List<String> letterCombinations(String digits) {	
    	
    	return combinations(digits);
    }
    
     public List<String> combinations(String digits){
    	 if(digits.length()==1){
    		 char arr[] = hashMap.get(Integer.valueOf(digits)).toCharArray();
    		 List<String> r = new ArrayList<String>();
    		 for(char a:arr){
    			 r.add(String.valueOf(a));
    		 }
    		 return r;
    	 }
    	 
    	 int mid = digits.length()/2;
    	 String first=digits.substring(0,mid);
    	 String second=digits.substring(mid);
    	 
    	 List<String> result1 = combinations(first);
    	 List<String> result2 = combinations(second);
    	 List<String> comb;
    	 comb=mergeCombination(result1,result2);
    	return comb;
     }
     public List<String> mergeCombination(List<String> result1,List<String> result2){
    	 List<String> comb = new ArrayList<String>();
    	for(String val1 : result1){
    		
    		for(String val2 : result2){
    			comb.add(val1+val2);
    		}
    		
    	}
    	 return comb;
     }
     
}
public class LetterCombinationsPhoneNumber {

	public static void main(String args[]){
		
		Solution9 s = new Solution9();
		s.letterCombinations("234").forEach((i) -> System.out.println(i));
	}
}
