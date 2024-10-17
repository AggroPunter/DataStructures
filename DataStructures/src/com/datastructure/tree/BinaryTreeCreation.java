package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeCreation {
	
	private TreeNode root;
	
	private class TreeNode {
		   
		
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
		
	}
	
	//Recursion
	public void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void createBinaryTree() {
		
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		/*
		 * 				  1
		 * 
		 * 			2			3
		 * 
		 * 		4		5	null     null
		 *
		 */
		
		root = first;
		first.left = second;
		first.right = third;	
		second.left = fourth;
		second.right = fifth;
	}
	
	private void preOrderTraversal(TreeNode root) {
		if(root == null) return;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
	}

	
	private void inOrder(TreeNode root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}

	private void inOrderTraversal(TreeNode root) {
		if(root == null) return;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(! stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			else {
				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
		}
	}
	

	private void postOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	private void postOrderTraversal() {
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();
		while(current != null || !stack.isEmpty()) {
			if(current != null) {
				stack.push(current);
				current = current.left;
			}
			else {
				TreeNode temp = stack.peek().right;
				if(temp == null) {
					temp = stack.pop();
					System.out.print(temp.data + " ");
					while(!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data + " ");
					}
				}
				else {
					current = temp;
				}
			}
		}
	}
	
	private void levelOrderTraversal(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(! queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
		}
	}
	                                                                                                     
	private int findMax(TreeNode root) {
		if(root == null) return Integer.MIN_VALUE;
		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		if(left > result) result = left;
		if(right > result) result = right;
		return result;
	}
	
	public static void main(String[] args) {
		BinaryTreeCreation bTree = new BinaryTreeCreation();
		bTree.createBinaryTree();
		System.out.println("Pre Order Traversal using Recursion");
		bTree.preOrder(bTree.root);
		System.out.println();
		System.out.println("Pre Order Traversal Using DataStructure");
		bTree.preOrderTraversal(bTree.root);
		System.out.println();
		System.out.println("Inorder Traversal using Recursion");
		bTree.inOrder(bTree.root);
		System.out.println();
		System.out.println("In Order Traversal Using DataStructure");
		bTree.inOrderTraversal(bTree.root);
		System.out.println();
		System.out.println("Post order traversal using Recursion");
		bTree.postOrder(bTree.root);
		System.out.println();
		System.out.println("Post order traversal using Datastructure");
		bTree.postOrderTraversal();
		System.out.println();
		System.out.println("Level order traversal using queue");
		bTree.levelOrderTraversal(bTree.root);
		System.out.println();
		System.out.println("Largest number in Tree "+bTree.findMax(bTree.root));
		
	}


}
