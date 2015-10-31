public class Solution {
    List<List<Integer>> lol = new LinkedList<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, new LinkedList<Integer>(), target, 0, 0, 0);
        return lol;
    }
    void dfs(int[] candidates, List<Integer> list, int target, int sum, int max, int index) {
        if(sum > target) {return;}
        if(sum == target) {lol.add(new LinkedList<Integer>(list));}
        for(int i = index; i < candidates.length; i++) {
            if(i > index && candidates[i] == candidates[i-1]) {continue;} // remove duplicate
            if(candidates[i] >= max) {
                list.add(candidates[i]);
                dfs(candidates, list, target, sum+candidates[i], candidates[i], i+1); // take care of max
                list.remove(list.size()-1);
            }
        }
    }
}

// without sort
public class Solution {
    List<List<Integer>> lol = new LinkedList<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Boolean[] isVisited = new Boolean[candidates.length];
        Arrays.fill(isVisited, false);
        dfs(candidates, new LinkedList<Integer>(), target, 0, 0, isVisited);
        return lol;
    }
    void dfs(int[] candidates, List<Integer> list, int target, int sum, int max, Boolean[] isVisited) {
        if(sum > target) {return;}
        if(sum == target) {lol.add(new LinkedList<Integer>(list));}
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < candidates.length; i++) {
            if(candidates[i] >= max && !isVisited[i] && !set.contains(candidates[i])) {
                set.add(candidates[i]);
                isVisited[i] = true;
                list.add(candidates[i]);
                dfs(candidates, list, target, sum+candidates[i], candidates[i], isVisited); // take care of max
                isVisited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}