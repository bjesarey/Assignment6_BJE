/**
 * @author Nathan Johnson, Bellarmine University
 * @version 5.0 Assignment 6 CS215 Semester year Fall 2023
 */
public class Node {
	private int data;
	private Node lChild;
	private Node rChild;

	public Node(int data) {
		lChild = null;
		rChild = null;
		this.data = data;
	}// end Node

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}// end getData()

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}// end SetData()

	/**
	 * @return the lChild
	 */
	public Node getlChild() {
		return lChild;
	}// end getlChild()

	/**
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}// end setlChild()

	/**
	 * @return the rChild
	 */
	public Node getrChild() {
		return rChild;
	}// end getrChild()

	/**
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	}// end setrChild()

}// end Node