https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
// Algo 1 : DFS : O(n),O(n)
public class Codec {
  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    return rserialize(root, "");
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    String[] dataArray = data.split(",");
    List<String> dataList = new LinkedList<>(Arrays.asList(dataArray));
    return rdeserialize(dataList);
  }

  public String rserialize(TreeNode root, String s) {
    // Recursive serialization.
    if (root == null) {
      s += "null,";
    } else { // Preorder-Traversal - DFS
      s += root.val + ",";
      s = rserialize(root.left, s);
      s = rserialize(root.right, s);
    }
    return s;
  }

  public TreeNode rdeserialize(List<String> dataList) {
    // Recursive deserialization.
    String head = dataList.get(0);
    if (head.equals("null")) {
      dataList.remove(0);
      return null;
    }
    TreeNode root = new TreeNode(Integer.valueOf(head));
    dataList.remove(0);
    root.left = rdeserialize(dataList);
    root.right = rdeserialize(dataList);
    return root;
  }  
}