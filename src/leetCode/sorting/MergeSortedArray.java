package leetCode.sorting;
class Solution22 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		
		while(i>=0 && j>=0){
			
			if(nums1[i]>nums2[j]){
				nums1[k--]=nums1[i--];
			}else{
				nums1[k--]=nums2[j--];
			}
			
		}
		while(j>=0){
			nums1[k--]=nums2[j--];
		}
		
	}
}

public class MergeSortedArray {

	public static void main(String[] args) {

		Solution22 s = new Solution22();
		int m = 3, n = 3;
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		s.merge(nums1, m, nums2, n);

		for(int i=0;i<m+n;i++){
			System.out.println(nums1[i]);
		}
	}

}
