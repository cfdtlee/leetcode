public class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> prod = new ArrayList<Integer>();
        List<Integer> left = new ArrayList<Integer>();
        for(int i : nums) {left.add(i);}
        dfs(left, prod, nums.length);
        return result;
    }
    void dfs(List<Integer> left, List<Integer> prod, int n) {
        if(prod.size() < n) {
            for(int i = 0; i < left.size(); i++) {
                int temp = left.get(i);
                left.remove(i);
                prod.add(temp);
                dfs(left, prod, n);
                left.add(i, temp);
                prod.remove(prod.get(prod.size()-1));
            }
        }
        else {
            
            result.add(new ArrayList(prod));
            
        }
        
    }
}