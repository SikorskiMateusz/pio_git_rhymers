package edu.kis.vh.nursery.list;

public class Node {
	/**
	 * private final int value- integer value held in the node
	 * private Node prev- next node on the list
	 * private Node next- previous node on the list
	 * all getX() and setX() methods- methods used to get or upgrade values in the nodes
	 */
	private final int value;
	private Node prev;
	private Node next;

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
