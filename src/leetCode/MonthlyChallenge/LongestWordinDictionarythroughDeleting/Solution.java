package leetCode.MonthlyChallenge.LongestWordinDictionarythroughDeleting;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String findLongestWord(String s, List<String> d) {

        char[] arr = s.toCharArray();
        String lastWord="";
        int max=-1;
        for(String str: d){

            char[] b = str.toCharArray();
            int j=0;
            for(int i=0;i<b.length;i++){

                while(j<arr.length && b[i]!=arr[j]){
                    j++;
                }
                j++;
            }
            if(j<=arr.length){

                if(str.length()>max){
                    max=str.length();
                    lastWord=str;
                }
                if(str.length()==max){
                    lastWord=str.compareTo(lastWord)<0?str:lastWord;
                }

            }


        }
    return lastWord;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> list = new ArrayList<>();
       // list.add("jpthiudqzzeugzwwsngebdeai");
       list.add("aaa");
      list.add("aa");
        list.add("a");

        System.out.println("jpthiudqzzeugzwwsngebd".length() + "   " + "nbmxgkduynigvzuyblwjepn".length());

        String result = s.findLongestWord("aaa",list);
        System.out.println(result);
    }
}
