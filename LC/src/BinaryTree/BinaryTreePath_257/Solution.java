package BinaryTree.BinaryTreePath_257;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
    List<String> ans = new LinkedList<>();
    public List<String> recur(TreeNode root, String path){
        if(root.left==null && root.right==null){
            ans.add(path);
            return ans;
        }
        if(root.left != null){
            recur(root.left,path + "->" + root.left.val);

        }
        if(root.right != null){
            recur(root.right,path+ "->" + root.right.val);

        }
        return ans;
    }
	public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return ans;
        else
        return recur(root,root.val+"");
	}
}
