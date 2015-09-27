public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(!stack.empty() && map.get(stack.peek()) == s.charAt(i)) {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}