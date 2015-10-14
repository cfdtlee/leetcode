// pay attention to spaca
// deal with 11-19
// deal with zero!
// 1000000 is "One Million" not "One Million Thousand" 
public class Solution {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        String[] name = {"", "Thousand", "Million", "Billion", "Trillion"};
        String res = "";
        for(int i = 0; i < name.length; i++) {
            if(num <= 0) break;
            int group = num % 1000;
            System.out.println(group);
            num /= 1000;
            res = helper(group) == "" ? res : helper(group) + " " + name[i] + " " + res;
        }
        res = String.join(" ", (res.split("\\s+")));
        return res;
    }
    String helper(int num) {
        String[] twen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[][] name = {
            {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"},
            {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"},
            {"", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"}
        };
        String res = "";
        if(num % 100 < 20 && num % 100 > 0) { //num % 100 > 0
            res = twen[num % 20] + " " + res;
            num -= (num % 20);
        }
        for(int i = 0; i < name.length; i++) {
            if(num <= 0) break;
            int d = num % 10;
            num /= 10;
            res = name[i][d] + " " + res;
        }
        // System.out.println(res);
        return res;
    }
}