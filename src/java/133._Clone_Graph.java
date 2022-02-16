https://leetcode.com/problems/clone-graph
// Algo 1 : DFS + Recursion : O(v+e) , O(v)
class Solution {
    private HashMap<Node,Node> visited = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        if(visited.containsKey(node)) return visited.get(node); // returned cloned node of already visited node.
        
        Node cloneNode = new Node(node.val , new ArrayList()); // set value of cloneNode via construtor
        visited.put(node , cloneNode);  // Mistake : Set in map before setting neighbours else infinite loop 
        for(Node n : node.neighbors) {// set neighbours RECURSIVELY of cloneNode via loop
            cloneNode.neighbors.add(cloneGraph(n)); // added cloneGraph(n) and not n
        }
        return cloneNode;
    }
}
// Algo 2 : BFS + Iteration : O(v+e) , O(v)
class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Queue<Node> q = new LinkedList<>();
        HashMap<Node,Node> visited = new HashMap<>(); // Helps avoid cycle
        q.add(node);
        visited.put(node , new Node(node.val , new ArrayList<>()));
        while(!q.isEmpty()) {
            Node head = q.poll();
            for(Node n : head.neighbors) { // neighbors and not neighbours
                if(!visited.containsKey(n)) {
                    visited.put(n , new Node(n.val , new ArrayList<>()));
                    q.add(n);
                }
                visited.get(head).neighbors.add(visited.get(n));
            }
            
        }
        return visited.get(node);
    }
}