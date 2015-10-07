public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int index = 0;
        int[] PRIMES = new int[]{2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};
        List<List<String>> lol = new ArrayList<List<String>>();
        if(strs.length == 0) {
            List t = new LinkedList<String>();
            t.add("");
            lol.add(t);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < strs.length; i++) {
            int key = 1;
            for(int j = 0; j < strs[i].length(); j++) {
                key *= PRIMES[strs[i].charAt(j) - 'a'];
            }
            if(map.containsKey(key)) {
                lol.get(map.get(key)).add(strs[i]);
            }
            else {
                List t = new LinkedList<String>();
                t.add(strs[i]);
                lol.add(t);
                map.put(key, index++);
            }
        }
        return lol;
    }
}