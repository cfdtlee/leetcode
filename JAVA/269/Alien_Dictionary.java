public class Solution {
    public String alienOrder(String[] words) {
        List<int[]> edges = new LinkedList<int[]>();
        String str1 = "", str2 = "";
        Queue<Integer> queue = new LinkedList<Integer>();
        String res = "";
        int[] inDegree = new int[26];
        int num = 0;
        Arrays.fill(inDegree, -1);
        for(int i = 0; i < words.length-1; i++) {
            str1 = words[i];
            str2 = words[i+1];
            while(str1.length() > 0 && str2.length() > 0 && str1.charAt(0) == str2.charAt(0)) {
                str1 = str1.substring(1);
                str2 = str2.substring(1); // 2 or 1 !!
            }
            if(str1.length() > 0 && str2.length() > 0) {
                int[] t = new int[]{str1.charAt(0) - 'a', str2.charAt(0) - 'a'}; // 
                edges.add(t);
            }
        }
        for(int i = 0; i < words.length; i++) {
            for(char c : words[i].toCharArray()) {
                if(inDegree[c - 'a'] == -1 ) {
                    inDegree[c - 'a'] = 0; //
                    num++; //
                }
            }
        }
        System.out.println(num);
        for(int i = 0; i < edges.size(); i++) {
            inDegree[edges.get(i)[1]]++;
        }
        for(int i = 0; i < inDegree.length; i++) {
            if(inDegree[i] == 0) { //
                queue.add(i);
                inDegree[i]--;
            }
        }
        while(!queue.isEmpty()) {
            int node = queue.poll();
            res += (char) (node + 'a');
            for(int i = 0; i < edges.size(); i++) {
                if(edges.get(i)[0] == node) {
                    inDegree[edges.get(i)[1]]--;
                }
                if(inDegree[edges.get(i)[1]] == 0) {
                    queue.add(edges.get(i)[1]);
                    inDegree[edges.get(i)[1]]--;
                }
            }
        }
        return res.length() == num ? res : "";
    }
}