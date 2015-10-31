public class Solution {
    public boolean isStrobogrammatic(String num) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 1); map.put(6, 9); map.put(8, 8); map.put(9, 6); map.put(0, 0);
        int i = 0, j = num.length() - 1; // jjj!
        while(i <= j) {
            if(!map.containsKey(num.charAt(i) - '0')) {
                return false;
            }
            if(map.get(num.charAt(i++) - '0') != num.charAt(j--) - '0') {
                return false;
            }
            
        }
        return true;
    }
}



public boolean isStrobogrammatic(String num) {
    for (int i=0, j=num.length()-1; i <= j; i++, j--)
        if (!"00 11 88 696".contains(num.charAt(i) + "" + num.charAt(j)))
            return false;
    return true;
}