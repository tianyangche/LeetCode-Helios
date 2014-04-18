public class solution{
	public void flatten(TreeNode root){
		if(root == null)
			return ;
		flatten(root.left);
		flatten(root.right);
		TreeNode p = root.left;
		if(p == null)
			return;
		while(p.right != null) p = p.right;
		p.right = root.right;
		root.right =root.left;
		root.left = null;
	}		
}

