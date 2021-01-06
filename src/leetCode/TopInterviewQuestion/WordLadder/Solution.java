package leetCode.TopInterviewQuestion.WordLadder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!wordList.contains(endWord)){
            return 0;
        }
        int min = minLength(beginWord,endWord,wordList,1,Integer.MAX_VALUE);
        return  min==Integer.MAX_VALUE?0:min;
    }

    public int minLength(String current, String endWord,List<String> wordList, int length, int min ){

        if(endWord.equals(current)){
            return length;
        }
        int num=0;
        for(int j=0;j<wordList.size();j++){
            String word = wordList.get(j);
            int count=0;
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)!=current.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                wordList.remove(word);
                num = minLength(word,endWord,wordList,++length,min);
                --length;
                wordList.add(j,word);
                if(num!=0 && num<min){
                    min=num;
                }
            }

        }


        return min;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
       /* list.add("pot");
        list.add("dot");*/
        int min = s.ladderLength("a","c",list);
        System.out.println(min);
    }
}
