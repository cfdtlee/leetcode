class TrieNode {
    // Initialize your data structure here.
    public TrieNode() {
        
    }
    int val;
    boolean isWord;
    TrieNode[] children = new TrieNode[26];
    TrieNode(int c) {
        // this.val = c;
        TrieNode node = new TrieNode();
        node.val = c;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        int c;
        TrieNode tn = root;
        for(int i = 0; i < word.length(); i++) {
            c = word.charAt(i) - 'a';
            if(tn.children[c] == null) {
                tn.children[c] = new TrieNode(c);
            }
            tn = tn.children[c];
            
        }
        tn.isWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        int c;
        TrieNode tn = root;
        for(int i = 0; i < word.length(); i++) {
            c = word.charAt(i) - 'a';
            if(tn.children[c] == null) {
                return false;
            }
            tn = tn.children[c];
        }
        return tn.isWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        int c;
        TrieNode tn = root;
        for(int i = 0; i < prefix.length(); i++) {
            c = prefix.charAt(i) - 'a';
            if(tn.children[c] == null) {
                return false;
            }
            else {
                tn = tn.children[c];
            }
        }
        return true; 
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");