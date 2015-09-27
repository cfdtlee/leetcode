public class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length-1, temp;//pay attention to edge
        for(int k = 0; k < j+1; k++) {
            if(i == j) break;
            if(nums[k] == 0) {
                temp = nums[k];
                nums[k] = nums[i];
                nums[i++] = temp;
                if(nums[i] == 2) {
                    temp = nums[k];
                    nums[k] = nums[j];
                    nums[j--] = temp;
                }
            }
            if(nums[k] == 2) {
                temp = nums[k];
                nums[k] = nums[j];
                nums[j--] = temp;
                if(nums[k] == 0) {
                    temp = nums[k];
                    nums[k] = nums[i];
                    nums[i++] = temp;
                }
            }
            // int tt = nums.length;
        }
    }
}

public class Solution2 {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length-1, temp;//pay attention to edge
        for(int k = 0; k < j+1; ) {
            if(nums[k] == 0) {
                temp = nums[k];
                nums[k++] = nums[i]; // ??
                nums[i++] = temp;
            }
            else if(nums[k] == 2) {
                temp = nums[k];
                nums[k] = nums[j];
                nums[j--] = temp;
            }
            else {k++;}
        }
    }
}



class Solution3 {
    public:
        void sortColors(int A[], int n) {
            int second=n-1, zero=0;
            for (int i=0; i<=second; i++) {
                while (A[i]==2 && i<second) swap(A[i], A[second--]);
                while (A[i]==0 && i>zero) swap(A[i], A[zero++]);
            }
        }
    };