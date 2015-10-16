public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] arr = new int[numCourses];
        // if(prerequisites == null || prerequisites.length == 0) return null;
        int[] inDegree = new int[numCourses];
        int num = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < prerequisites.length; i++) {
            inDegree[prerequisites[i][0]]++;
        }
        for(int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0) {
                queue.add(i);
                inDegree[i]--;
            }
        }
        while(!queue.isEmpty()) {
            int nodeNum = queue.poll();
            arr[num] = nodeNum;
            num++;
            for(int i = 0; i < prerequisites.length; i++) {
                if(prerequisites[i][1] == nodeNum)
                    inDegree[prerequisites[i][0]]--;
                if(inDegree[prerequisites[i][0]] == 0) {
                    queue.add(prerequisites[i][0]);
                    inDegree[prerequisites[i][0]]--;
                }
            }
        }
        if(num == numCourses) return arr;
        return new int[0];
    }
}