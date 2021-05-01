package leetCode.TopInterviewQuestion.SubstringwithConcatenationofAllWords;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        int start=0;
        int word_length=words[0].length();
        int match=0;
        Map<String,Integer> frequency = new HashMap<>();
        for(String str: words){
            frequency.put(str,frequency.getOrDefault(str,0)+1);
        }
        Map<String,Integer> seen = new HashMap<>();

        for(int i=0;i<=s.length()-words.length*word_length;i++){
            seen = new HashMap<>();
            for(int j=0;j<words.length;j++){
                int nextWordIndex=i+ j * word_length;
                String nextWord = s.substring(nextWordIndex,nextWordIndex+word_length);

                if(!frequency.containsKey(nextWord)){
                    break;
                }
                seen.put(nextWord, seen.getOrDefault(nextWord,0)+ 1);

                if(seen.get(nextWord)>frequency.get(nextWord)){
                    break;
                }

                if(j+1==words.length){
                    list.add(i);
                }


            }


        }


        return list;

    }


    public static void main(String args[]){

        Solution s = new Solution();
        String[] words={"word","good","best","good"};
        List<Integer> result= s.findSubstring("wordgoodgoodgoodbestword",words);
        result.forEach(i -> System.out.println(i));


    }
}

