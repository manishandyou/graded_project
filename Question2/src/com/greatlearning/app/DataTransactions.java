package com.greatlearning.app;

public class DataTransactions

{

	public static node node;
	static node prevNode = null;
	static node headNode = null;

	static void flattenBTToSkewed(node root, int order)
	
	{

		if (root == null)
		{
			return;
		}

		if (order > 0)
		{
			flattenBTToSkewed(root.right, order);
		}
		else
		{
			flattenBTToSkewed(root.left, order);
		}
		node rightNode = root.right;
		node leftNode = root.left;

		if (headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0)
		{
			flattenBTToSkewed(leftNode, order);
		}
		else
		{
			flattenBTToSkewed(rightNode, order);
		}
	}

	static void traverseRightSkewed(node root)
	{
		if (root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

	
	public static void main(String[] args)
	{

		DataTransactions.node = new node(50);
		DataTransactions.node.left = new node(30);
		DataTransactions.node.right = new node(60);
		DataTransactions.node.left.left = new node(10);
		DataTransactions.node.right.left = new node(55);
		
		int order = 0;
		flattenBTToSkewed(node, order);
		traverseRightSkewed(headNode);
	}

	
}
