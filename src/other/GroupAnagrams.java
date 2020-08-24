package other;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution16 {
	public List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> hasMap = new HashMap<String, List<String>>();
		
		for (String s : strs) {

			char arr[] = s.toCharArray();
			Arrays.sort(arr);
			if (hasMap.get(String.valueOf(arr)) == null) {
				List<String> list = new ArrayList<String>();
				list.add(s);
				hasMap.put(String.valueOf(arr), list);
			} else {
				List<String> list = hasMap.get(String.valueOf(arr));
				list.add(s);
			}

		}
		List<List<String>> listOfList = new ArrayList<List<String>>(hasMap.values());
		

		return listOfList;
		
	}
}

public class GroupAnagrams {

	public static void main(String args[]) {

		Solution16 s = new Solution16();
		String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		s.groupAnagrams(strs).forEach((list) -> {
		list.forEach((ele)->
		System.out.print(ele + " "));
		System.out.println();
		});
	}

}
