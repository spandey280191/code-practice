package leetCode.TopInterviewQuestion.Medium.ArrayAndSorting.GroupAnagrams;

import java.util.*;

/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<List<String>> finalList = new ArrayList<List<String>>();
        for (String s : strs) {

            char[] c = s.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);

            if (map.get(s1) != null) {

                List<String> list = map.get(s1);
                list.add(s);

            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(s1, list);
            }

        }

        finalList.addAll(map.values());

        return finalList;
    }
}
