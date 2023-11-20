/**
 * Creates methods to traverse a binary tree depth-first.
 */

/**
 * @author brandonesarey
 * @version 5.0 Assignment 6 CS215 Semester year Fall 2023
 */

public class DepthFirstSearch {
	Node root;

	/**
	 * Signals a depth-first tree traversal.
	 */
	public DepthFirstSearch() {
		System.out.println("\nCall DFS with root node to do a Depth First Search.");
	}// end DepthFirstSearch()

	/**
	 * @param node Traverses a binary tree depth-first based on the levels given.
	 */
	public void DFS(Node node) {
		System.out.println("Node: " + node.getData());
		if (node.getlChild() != null) {
			DFS(node.getlChild());
			DFS(node.getrChild());
		} // end if

		// ADD CODE TO TRAVERSE THE TREE HERE
		// THIS IS APPROXIMATELY THREE LINES OF CODE
		// INCLUDING AN IF STATEMENT TO
		// SEE IF THE NODE IS A LEAF
		// AND TWO RECURSIVE CALLS TO THE CHILDREN

		// MODIFY OTHER CODE AS NECESSARY

	}// end DFS()

	/**
	 * @param node
	 * @return the height of the tree.
	 */
	public int treeHeight(Node node) {
		if (node == null)
			return 0;
		else {
			int leftChildHeight = treeHeight(node.getlChild());
			int rightChildHeight = treeHeight(node.getrChild());
			return (1 + Math.max(leftChildHeight, rightChildHeight));
		} // end else

	}// end treeHeight()
}// end DepthFirstSearch