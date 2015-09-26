public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m+n-1;
        m--; n--;
        while(n >= 0) {
            if(m >= 0 && nums1[m] > nums2[n]) {
                nums1[end--] = nums1[m--];
            }
            else {
                nums1[end--] = nums2[n--];
            }
        }
    }
}

public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, end = m+n-1;
        while(j >= 0 && j >= 0) {
            nums1[end--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        while(j >= 0) {
            nums1[end--] = nums2[j--];
        }
    }
}

public class Solution3 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(n >= 0) nums1[m+n-1] = (m == 0 || nums2[n-1] > nums1[m-1]) ? nums2[--n] : nums[--m];
    }
}