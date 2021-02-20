package leetCode.MonthlyChallenge.RomantoInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {

   static Map<Character,Integer> map = new HashMap<>();

    static {
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }

    public int romanToInt(String s) {

        int result=0;
        int lastValue=0;

        for (Character c: s.toCharArray()){
                int current = map.get(c);
                if(current>lastValue && lastValue!=0){
                    result = result - lastValue;
                    result = result + (current-lastValue);
                }else{
                    result = result + current;
                }
                lastValue=current;
        }


        return result;
    }
    public static void main(String args[]){
        Solution s = new Solution();

        int r = s.romanToInt("LVIII");
        System.out.println(r);
    }
}
