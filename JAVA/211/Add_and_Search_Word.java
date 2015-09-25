// 总结：边界条件！这里应该用isWord当返回值，不要自己编
// 既然选择用递归来做就不要夹着迭代的方法

// addWord("at"),addWord("and"),
// addWord("an"),addWord("add"),
// search("a"),search(".at"),addWord("bat"),
// search(".at"),search("an."),search("a.d."),
// search("b."),search("a.d"),search(".")
class Add_and_Search_Word {
    static Trie root = new Trie();
    public static void main(String[] args) {
        addWord("a");
        addWord("and");
        addWord("add");
        System.out.println(search("."));
        // System.out.println(search("an."));
        // System.out.println(search("bat"));
        // System.out.println(search("an.")); //
        // System.out.println(search("a.b."));
        // System.out.println(search("."));
        // System.out.println(search("b."));
        // System.out.println(search("a.d")); //
        // search(".a");
        // search("a.");
    }


    // Adds a word into the data structure.
    public static void addWord(String word) {
        Trie node = root;
        for(int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if(node.children[c] == null) {
                node.children[c] = new Trie(c);
            }
            node = node.children[c];
        }
        node.isWord = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public static boolean search(String word) {
        Trie node = root;
        return search(word, node);
    }
    public static boolean search(String word, Trie root) {
        if(word.length() == 0 ) {
            return root.isWord;
        }
        if(word.length() == 0 && root != null) {
            return root.isWord;
        }
        if(root == null) return false;
        Trie node = root;
        for(int i = 0; i < word.length(); i++) { // 这里需要改进，既然选择用递归来做就不要夹着迭代的方法
            if (word.charAt(i) == '.') {
                int j = 0; 
                for(j = 0; j < 26; j++) {
                    if (node.children[j] != null && search(word.substring(i+1), node.children[j])) {
                        return true;
                    }
                }
                if(j == 26) return false;
            }
            else {
                int c = word.charAt(i) - 'a';
                if(node.children[c] == null) {
                    return false;
                }
                node = node.children[c];
            }
        }
        return node.isWord;
    }
}
class Trie {
    int val;
    Boolean isWord;
    Trie[] children = new Trie[26];
    Trie() {}
    Trie(int c) {
        this.val = c;
        this.isWord = false;
    }
}
