package leetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public int[] intersect(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0;
		for (; i < nums1.length; i++) {
			for (; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					list.add(nums2[j]);
					j++;
					break;

				}
				else if(nums1[i] < nums2[j])
                    break;

			}
		}

		int[] result = list.stream().mapToInt(l -> l).toArray();
		return result;

	}

	public static void main(String args[]) {
		
		Main m = new Main();
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		m.intersect(nums1, nums2);

	}
}
