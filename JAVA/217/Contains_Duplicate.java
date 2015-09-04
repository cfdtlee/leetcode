import java.util.*;
public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        //Hashtable<int, int> ht = new Hashtable<int, int>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}