/**
 * Tests the methods of the Node, Tree, and DepthFirstSearch classes.
 */

/**
 * @author Nathan Johnson, Bellarmine University
 * @version 5.0 Assignment 6 CS215 Semester year Fall 2023
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args) {
		// System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree = new Tree();// Creates a tree with root
		Node root = aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch = new DepthFirstSearch();
		aSearch.DFS(root);
		System.out.println("\nTree height: " + aSearch.treeHeight(root));
	}// end main()

}// end Application