// https://leetcode.com/problems/design-add-and-search-words-data-structure
class TrieNode {
    public Map<Character , TrieNode> children;
    public boolean isWord;
    public TrieNode() {
        isWord = false;   
        children = new HashMap<>();
    }
}
class WordDictionary {
    private TrieNode trie;
    /** Constructor */
    public WordDictionary() {
        trie = new TrieNode();
    }
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = trie;
        for(char c : word.toCharArray()) {
            node.children.putIfAbsent(c , new TrieNode());
            node = node.children.get(c);
        }
        node.isWord = true;
    }
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchInNode(word , trie);
    }
    private boolean searchInNode(String word , TrieNode node) {
        for(int i = 0 ; i < word.length() ; i++ ) {
            char c = word.charAt(i);
            if(!node.children.containsKey(c)) {
                if(c == '.') {
                    for(char c2 : node.children.keySet()) {
                        TrieNode child = node.children.get(c2);
                        if(searchInNode(word.substring(i + 1) , child)) {
                            return true;
                        }
                    }
                }
                return false; // if no nodes lead to answer or the current character != '.'
            } else {
                node = node.children.get(c);// if the character is found go down to the next level in trie
            }
        }
        return node.isWord;
    }
}