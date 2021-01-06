package leetCode.TopInterviewQuestion.WordLadder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SolutionBFS {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!wordList.contains(endWord)){
            return 0;
        }
        int level=0;
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int length = beginWord.length();
        while(!queue.isEmpty()){
            level++;
            String word = queue.poll();
            char arr[] = word.toCharArray();
            for(int i=0;i<arr.length;i++){

                for(char c='a'; c<='z';c++){

                    if(arr[i]!=c){
                        arr[i]=c;
                    }

                    String newWord = new String(arr);
                    if(newWord.equals(endWord)){
                        return level+1;
                    }
                    if(wordList.contains(newWord)){
                        queue.add(newWord);
                        wordList.remove(newWord);
                    }

                }

            }

        }


        return level;
    }

    public static void main(String[] args) {
        SolutionBFS s = new SolutionBFS();
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
