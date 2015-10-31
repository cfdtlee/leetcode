public class Solution {
    List<List<Integer>> lol = new LinkedList<List<Integer>>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] candidates = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        dfs(candidates, new LinkedList<Integer>(), n, 0, 0, 0, k);
        return lol;
    }
    void dfs(int[] candidates, List<Integer> list, int target, int sum, int max, int index, int k) {
        if(list.size() == k) {
            if(sum > target) {return;}
            if(sum == target) {lol.add(new LinkedList<Integer>(list)); return;}
        }
        for(int i = index; i < candidates.length; i++) {
            if(candidates[i] >= max) {
                list.add(candidates[i]);
                dfs(candidates, list, target, sum+candidates[i], candidates[i], i+1, k); // take care of max
                list.remove(list.size()-1);
            }
        }
    }
}