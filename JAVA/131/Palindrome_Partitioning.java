public class Solution {
    public List<List<String>> partition(String s) {
        List<String> list = new LinkedList<String>();
        List<List<String>> lol = new LinkedList<List<String>>();
        dfs(s, list, lol);
        return lol;
    }
    void dfs(String s, List list, List<List<String>> lol) {
        if(s.length() == 0) {
            lol.add(new LinkedList<String>(list));
            return;
        }
        if(s.length() == 1) {
            list.add(s.substring(0, 1));
            lol.add(new LinkedList<String>(list));
            list.remove(list.size()-1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(isPalindrome(s.substring(0, i+1))) {
                list.add(s.substring(0,i+1));
                dfs(s.substring(0, i+1), list, lol);
                list.remove(list.size()-1);
            }
        }
    }
    Boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}