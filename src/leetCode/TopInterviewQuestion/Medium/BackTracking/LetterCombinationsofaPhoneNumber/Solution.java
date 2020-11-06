package leetCode.TopInterviewQuestion.Medium.BackTracking.LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {


    public List<String> letterCombinations(String digits) {

        Map<Character, String> map = new HashMap<>();
        setup(map);
        List<String> list = new ArrayList<>();
        char[] arr = digits.toCharArray();
        for (int i = 0; i < digits.length(); i++) {

            if (list.isEmpty()) {
                char[] a = map.get(arr[i]).toCharArray();
                for (int j = 0; j < a.length; j++) {
                    list.add(String.valueOf(a[j]));
                }
            }else{
                List<String> l = new ArrayList<>(list);
                list = new ArrayList<>();
                char[] a = map.get(arr[i]).toCharArray();
                for (int j = 0; j < a.length; j++) {
                    for(String s:l){
                        list.add(s+String.valueOf(a[j]));
                    }

                }

            }


        }

        return list;

    }


    public void setup(Map<Character, String> map) {
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.letterCombinations("23");
    }
}