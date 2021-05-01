package leetCode.TopInterviewQuestion.FindAllAnagramsinaString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        int start=0;
        int match=0;
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0) + 1);
        }

        for(int end=0;end<s.length();end++){
            char c = s.charAt(end);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    match++;
                }
            }
            if(match==map.size()) {
                list.add(start);
            }
            if(end-start+1 >= p.length()) {
                if (map.containsKey(s.charAt(start))) {
                    if (map.get(s.charAt(start)) == 0) {
                        match--;
                    }
                    map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                }
                start++;
            }

        }

        return list;
    }

    //recursive
    /*public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0) + 1);
        }

        anagrams(s,p,map,list,0);

        return list;
    }

    public void anagrams(String s, String p,Map<Character,Integer> map,List<Integer> list, int start){

        Map<Character,Integer> temp = new HashMap<>(map);
        int match=0;
        for(int end=start;end<s.length();end++){
            char c = s.charAt(end);
            if(temp.containsKey(c)){
                temp.put(c,temp.get(c)-1);
                if(temp.get(c)==0){
                    match++;
                }
            }

            if(end-start+1 > p.length()){
                if(temp.containsKey(s.charAt(start))) {
                    if (temp.get(s.charAt(start)) == 0) {
                        match--;
                    }
                    temp.put(s.charAt(start), temp.get(s.charAt(start)) + 1);
                }
                start++;
            }

            if(match==temp.size()){
                list.add(start);
                temp=new HashMap<>(map);
                anagrams(s,p,temp,list,++start);
                return;
            }

        }
    }*/


    public static void main(String args[]){
        Solution s = new Solution();
        List<Integer> list =s.findAnagrams("cbaebabacd","abc");
        list.forEach(i -> System.out.println(i));
    }
}
