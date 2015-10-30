public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new LinkedList<Integer>();
        if(input.length() == 0) {
            return res;
        }
        // if(input.length() == 1) {
        //     res.add(Integer.parseInt(input)); 
        //     return res;
        // }
        for(int i = 0; i < input.length(); i++) {
            // mabye longer than one digit
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                String str1 = input.substring(0, i);
                String str2 = input.substring(i+1, input.length());
                System.out.println(str1);
                System.out.println(str2);
                List<Integer> list1 = diffWaysToCompute(str1);
                List<Integer> list2 = diffWaysToCompute(str2);
                for(int i1 : list1) {
                    for(int i2 : list2) {
                        switch(input.charAt(i)) {
                            case '+': res.add(i1+i2); break;
                            case '-': res.add(i1-i2); break;
                            case '*': res.add(i1*i2); break;
                        }
                    }
                }
            }
        }
        if(res.size() == 0) {
            res.add(Integer.parseInt(input)); 
        }
        return res;
    }
}