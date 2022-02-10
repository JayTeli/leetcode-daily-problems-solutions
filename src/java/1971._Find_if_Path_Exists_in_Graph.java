https://leetcode.com/problems/find-if-path-exists-in-graph
// Algo 1 : BFS
class Solution {
    private List<List<Integer>> graph;
    public boolean validPath(int n, int[][] matrix, int source, int destination) {
        if(n == 1) return true;
        buildGraph(matrix , n);
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(source);
        visited.add(source);
        while(!q.isEmpty()) {
            int head = q.poll();
            if(head == destination) return true;
            List<Integer> neighbours = graph.get(head);
            for(int n1 : neighbours) {
                if(!visited.contains(n1)) {
                    q.add(n1);
                    visited.add(n1);    
                }    
            }
        }
        return false;
    }
    private void buildGraph(int[][] matrix , int n) {
        int rows = matrix.length , cols = matrix[0].length;
        graph = new ArrayList<>();
        for(int v = 0 ; v < n ; v++) {  // Mistake : vertex times , not matrix.length times.
            graph.add(new ArrayList<>());   
        }
        for(int r = 0 ; r < rows ; r++) {
            graph.get(matrix[r][0]).add(matrix[r][1]); 
            graph.get(matrix[r][1]).add(matrix[r][0]); // Mistake : add opp edge too as bidirectional graph
        }
    }
}