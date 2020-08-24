package leetCode.sorting;
public class MergeSorted {

	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	        int p = m;
	        int i=0,j=0;
	        
	        while(i<p && j<n){
	            
	            if(nums1[i]<=nums2[j]){
	                i++;
	            }else{
	                int k=p-1;
	                while(k>=i){
	                    nums1[k+1]=nums1[k];
	                    k--;
	                }
	                nums1[i]=nums2[j];
	                j++;
	                p++;
	                i++;
	            }
	            
	        }
	        
	         while(j<n && i<m+n){
	            
	            nums1[i]=nums2[j];
	             i++;
	             j++;
	            
	        }
	        
	        
	        
	    }
	 
	 public static void main(String args[]){
		 
		 MergeSorted m = new MergeSorted();
		 
		 int [] a = {4,5,6,0,0,0};
		 int [] b = {1,2,3};
		 m.merge(a, 3, b, 3);
		 
	 }
	
}
