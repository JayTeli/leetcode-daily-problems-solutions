https://leetcode.com/problems/implement-trie-prefix-tree/
class Trie {
    
    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }   
    
    // TC,SC = O(w , w)... w = word length
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0 ; i < word.length() ; i++) {
            char c = word.charAt(i);
            if(!node.containsKey(c)) {
                node.put(c , new TrieNode());
            }
            node = node.get(c);
        }
        node.setEnd();
    }
    
    // TC , SC = O(w) , O(1)
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }
    
    // TC , SC = O(w) , O(1)
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }
    
    // return lastNode if word is found else return null
    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for(int i = 0 ; i < word.length() ; i++) {
            char c = word.charAt(i);
            if(node.containsKey(c)) {
                node = node.get(c);
            } else {
                return null;
            }
        }
        return node;
    } 
}
class TrieNode {
    private TrieNode[] links;
    private final int maxChildren = 26; // lower case letters
    private boolean isEnd;
    public TrieNode() {
        links = new TrieNode[maxChildren];
    }
    public void put(char c , TrieNode node) {
        links[c-'a'] = node;
    }
    public TrieNode get(char c) {
        return links[c-'a'];
    }
    public boolean containsKey(char c) {    // Mistake : public & not private
        return links[c-'a'] != null;
    }
    public void setEnd() {
        isEnd = true;
    }
    public boolean isEnd() {
        return isEnd;
    }
}