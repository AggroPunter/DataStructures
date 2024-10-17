package com.datastructure.tree;

public class BinarySearchTreeCreation {
	
	TreeNode root;
	
	private class TreeNode {
		   
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
		
	}

	
	public void insert(int data) {
		root = insert(root,data);
	}
	
	
	public TreeNode insert(TreeNode root, int value) {
		if(root == null) {
			root = new TreeNode(value);
			return root;
		}
		if(value < root.data) {
			root.left = insert(root.left, value);
		}
		else {
			root.right = insert(root.right, value);
		}
		return root;
	}
	
	private void inOrder() {
		inOrder(root);
		
	}

	
	private void inOrder(TreeNode root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
		
	}
	
	private TreeNode search(TreeNode root, int value) {
		if(root == null || root.data == value) {
			return root;
		}
		if(value < root.data) {
			return search(root.left, value);
		}
		else {
			return search(root.right, value);
		}
	}

	private boolean searchValue(int value) {	
		TreeNode result = search(root, value);
		boolean ans = result != null? true : false;
		return ans;
	}
	

	private boolean isValid(TreeNode root, long min, long max) {
		if(root == null) {
			return true;
		}
		if(root.data <= min || root.data >= max) {
			return false;
		}
		boolean left = isValid(root.left, min, root.data);
		if(left) {
			boolean right = isValid(root.right, root.data, max);
			return right;
		}
		return false;	
	}

	public static void main(String[] args) {
		
		BinarySearchTreeCreation bsTree = new BinarySearchTreeCreation();
		bsTree.insert(5);
		bsTree.insert(3);
		bsTree.insert(7);
		bsTree.insert(1);
		
		bsTree.inOrder();
		System.out.println();
		
		System.out.println("Is 7 present in the Tree : " + bsTree.searchValue(7));
		System.out.println("Is 10 present in the Tree : " + bsTree.searchValue(10));
		
		System.out.println("Valid Binary Search Tree : "+bsTree.isValid(bsTree.root, Long.MIN_VALUE, Long.MAX_VALUE));
		
	}
}
