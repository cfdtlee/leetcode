public class Solution {
    List<List<Integer>> lol = new LinkedList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, new LinkedList<Integer>(), target, 0, 0);
        return lol;
    }
    void dfs(int[] candidates, List<Integer> list, int target, int sum, int max) {
        if(sum > target) {return;}
        if(sum == target) {lol.add(new LinkedList<Integer>(list));}
        for(int i = 0; i < candidates.length; i++) {
            if(candidates[i] >= max) {
                list.add(candidates[i]);
                dfs(candidates, list, target, sum+candidates[i], candidates[i]); // take care of max
                list.remove(list.size()-1);
            }
        }
    }
}