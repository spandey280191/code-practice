package leetCode;

class Solution14 {
public int search(int[] A, int target) {
    int lo = 0;
    int hi = A.length - 1;
    while (lo < hi) {
        int mid = (lo + hi) / 2;
        if (A[mid] == target) return mid;
        
        if (A[lo] <= A[mid]) {
            if (target >= A[lo] && target < A[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        } else {
            if (target > A[mid] && target <= A[hi]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
    }
    return A[lo] == target ? lo : -1;
}
}
public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		
		Solution14 s = new Solution14();
		int arr[] = {4,5,6,7,0,1,2};
		s.search(arr, 2);
	}

}
