https://leetcode.com/problems/word-ladder/
// Algo 1 : Breadth First Search : O((m^2) * N) , O((M^2) * N)
// BFS for startWord till endWord.
// At each step add valid neighbours into queue.
// Valid neigbours are those potential neigbours that are present in wordList
// potential neigbours are those that we get by replaceing each letter of a word by a letter in 'a' to 'z'
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        Set<String> words = new HashSet<>(wordList);  // Converting list to set via constructor (wordList)
        words.remove(beginWord);    // remove beginWord
        queue.add(beginWord);       // add beginWord to queue
        
        int level = 0; // to track ladder length
        while(!queue.isEmpty()) {
            level++; // iterate level by level 
            for(int i = 0 , levelSize = queue.size() ; i < levelSize ; i++) {
                
                String currentWord = queue.poll();              // remove current word in queue
                if(currentWord.equals(endWord)) return level;   // if currentWord is endWord then return level

                List<String> neighbours = getValidNeighbours(currentWord , words);
                for(String n : neighbours) {
                    words.remove(n);
                    queue.add(n);
                }
            }
        }
        return 0; // Not returning level.
    }
    
    private List<String> getValidNeighbours(String word , Set<String> validWords){
        char[] c = word.toCharArray();
        List<String> result = new ArrayList<>();
        for(int i = 0 ; i < c.length ; i++) {
            char temp = c[i];
            for(char x = 'a' ; x <= 'z' ; x++) {
                c[i] = x;
                String neighbour = new String(c);
                if(validWords.contains(neighbour)) {
                    result.add(neighbour);
                }
            }
            c[i] = temp;
        }
        
        return result;
        
    }    
} 
// Algo 2 : Bi-directional BFS with preprocessing : O((m^2) * N) , O((M^2) * N)
// Fails for some new test cases
class Solution {
  private int L;
  private Map<String, List<String>> allComboDict;

  public Solution() {
    this.L = 0;
    this.allComboDict = new HashMap<>(); // Dictionary to hold combination of words that can be formed,from any given word. By changing one letter at a time.
  }

  public int ladderLength(String beginWord, String endWord, List<String> wordList) {

    if (!wordList.contains(endWord)) return 0;
    this.L = beginWord.length();  // Since all words are of same length.

    initDictionary(wordList);

    // Queues for birdirectional BFS
    Queue<Pair<String, Integer>> queueBegin = new LinkedList<>();  // BFS starting from beginWord
    Queue<Pair<String, Integer>> queueEnd = new LinkedList<>(); // BFS starting from endWord
    queueBegin.add(new Pair(beginWord, 1));
    queueEnd.add(new Pair(endWord, 1));

    // Visited to make sure we don't repeat processing same word.
    Map<String, Integer> visitedBegin = new HashMap<>();
    Map<String, Integer> visitedEnd = new HashMap<>();
    visitedBegin.put(beginWord, 1);
    visitedEnd.put(endWord, 1);

    while (!queueBegin.isEmpty() && !queueEnd.isEmpty()) {
      int ans = visitWordNode(queueBegin, visitedBegin, visitedEnd , false);// One hop from begin word
      if (ans > -1) return ans;
      ans = visitWordNode(queueEnd, visitedEnd, visitedBegin , true); // One hop from end word
      if (ans > -1) return ans;
      ans = visitWordNode(queueBegin, visitedBegin, visitedEnd , true);// One hop from begin word
        if (ans > -1) return ans;
    }

    return 0;
  }

  private int visitWordNode(
      Queue<Pair<String, Integer>> Q,
      Map<String, Integer> visited,
      Map<String, Integer> othersVisited) {

    Pair<String, Integer> node = Q.remove();
    String word = node.getKey();
    int level = node.getValue();

    for (int i = 0; i < this.L; i++) {

      // Intermediate words for current word
      String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

      // Next states are all the words which share the same intermediate state.
      for (String adjacentWord : this.allComboDict.getOrDefault(newWord, new ArrayList<>())) {
        // If at any point if we find what we are looking for
        // i.e. the end word - we can return with the answer.
        if (othersVisited.containsKey(adjacentWord)) {
          return level + othersVisited.get(adjacentWord);
        }
        if (!visited.containsKey(adjacentWord)) {
          // Save the level as the value of the dictionary, to save number of hops.
          visited.put(adjacentWord, level + 1);
          Q.add(new Pair(adjacentWord, level + 1));
        }
      }
    }
    return -1;
  }

  private void initDictionary(List<String> wordList) {
    wordList.forEach(
        word -> {
          for (int i = 0; i < L; i++) {
            // Key is the generic word
            // Value is a list of words which have the same intermediate generic word.
            String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
            List<String> transformations =
                this.allComboDict.getOrDefault(newWord, new ArrayList<>());
            transformations.add(word);
            this.allComboDict.put(newWord, transformations);
          }
        });
  }  
}
// Algo 3 : Bidirectional BFS without preprocessing : 
// https://leetcode.com/problems/word-ladder/discuss/281178/java-9ms-bidirection-bfs-solution-which-beats-100-with-detailed-explanation
// 1. Search from entry and exit simultaneously. When entry and exit meets, stop bfs. To do so, we need two queues to save the current search status of entry and exit respectively.
// 2. Each step we pick the queue with less elements to implement bfs. Less elements means less time to traverse.
// 3. Replace queue with set so that we can judge whether entry and exit meets in O(1) time.
// 4. Remove visited word from wordList to decrease the search time
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<String>(wordList);
        if(!wordSet.contains(endWord)) return 0;
        // 3. Use set instead of queue during bfs
        Set<String> forwardSet = new HashSet<String>(); 
        Set<String> backwardSet = new HashSet<String>();
        forwardSet.add(beginWord);
        backwardSet.add(endWord);
        wordSet.remove(endWord);
        wordSet.remove(beginWord);
        // 1. Search from entry and exit simultaneously
        return transform(forwardSet, backwardSet, wordSet);
    }

    public int transform(Set<String> forwardSet, Set<String> backwardSet, Set<String> wordSet) {
        Set<String> newSet = new HashSet<String>();
        for(String fs : forwardSet) {
            char wordArray[] = fs.toCharArray();
            for(int i = 0; i < wordArray.length; i++) {
                for(int c = 'a'; c <= 'z'; c++) {
                    char origin = wordArray[i];
                    wordArray[i] = (char) c;
                    String target = String.valueOf(wordArray);
                    if( backwardSet.contains(target) )
                        return 2; // stop bfs when entry and exits meet
                    else if( wordSet.contains(target) && !forwardSet.contains(target) ) {
                        wordSet.remove(target); // 4. Remove visited word from wordList to decrease the search time
                        newSet.add(target);
                    }
                    wordArray[i] = origin;
                }
            }
        }
        if( newSet.size() == 0 )
            return 0;
        forwardSet = newSet;
        // 2. Pick the queue with less elements to bfs
        int result = forwardSet.size() > backwardSet.size() ? 
            transform(backwardSet, forwardSet, wordSet) : transform(forwardSet, backwardSet, wordSet);
        return result == 0 ? 0 : result + 1;
    }
}