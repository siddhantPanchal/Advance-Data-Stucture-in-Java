package resorces;

public class Node {
	
	private int data;
	private Node leftChild;
	private Node rightChild;
	private Node parent;
	private int height;
	private int balencedFactor;

	public Node() {
		data = 0;
		leftChild = null;
		rightChild = null;
		setParent(null);
		height = 0;
		balencedFactor = 0;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBalencedFactor() {
		return balencedFactor;
	}

	public void setBalencedFactor(int balencedFactor) {
		this.balencedFactor = balencedFactor;
	}
	
	

}
