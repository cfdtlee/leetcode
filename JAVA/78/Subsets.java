public class Solution_bit_manipulation {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lol = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < Math.pow(2, nums.length); i++) {
            List<Integer> list = new LinkedList<Integer>();
            int n = nums.length;
            int bit = i;
            while(n-- > 0) {
                if((bit & 1) == 1) {list.add(nums[nums.length-1-n]);}
                bit >>= 1;
            }
            lol.add(list);
        }
        return lol;
    }
}


public class Solution2_backtracking { // 10:31
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lol = new LinkedList<List<Integer>>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        int n = 0;
        Arrays.sort(nums);
        dfs(nums, n, list, lol);
        return lol;
    }
    void dfs(int[] nums, int n, LinkedList<Integer> list, List<List<Integer>> lol) {
        if(n == nums.length) {
            lol.add(new LinkedList<Integer>(list));
        }
        else {
            dfs(nums, n+1, list, lol);
            list.add(nums[n]);
            dfs(nums, n+1, list, lol);
            list.remove(list.size()-1);
        }
    }
}