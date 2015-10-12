// ask question 
//"abba"
//"dog dog dog dog" is wrong, so the map <Character, String> is not good enough, we should check value too
// "abba"  
// "dog cat cat fish" <String, Character> is not good 
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] parts = str.split(" ");
        if(pattern.length() != parts.length) {return false;}
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < pattern.length(); i++) {
            if(map.get(pattern.charAt(i)) == null) {
                if(!map.containsValue(parts[i])) {
                    map.put(pattern.charAt(i), parts[i]);
                }
                else return false;
            }
            else {
                if(!map.get(pattern.charAt(i)).equals(parts[i])) { // compare string cannot use =
                    System.out.println(map.get(pattern.charAt(i)) + parts[i]);
                    return false;
                }
            }
        }
        return true;
    }
}