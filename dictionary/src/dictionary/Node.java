package dictionary;

public class Node {

	private String word;
	private String mean;
	private Node leftChild;
	private Node rightChild;
	
	public Node() {
		word = "";
		mean = "";
		leftChild = null;
		rightChild = null;
	}
	
	public Node(String word,String mean) {
		this.word = word;
		this.mean = mean;
	}

	public String getword() {
		return word;
	}

	public void setword(String word) {
		this.word = word;
	}

	public String getmean() {
		return mean;
	}

	public void setmean(String mean) {
		this.mean = mean;
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
	
	public void display() {
		System.out.println("Word : " + word + "\tmeaning : " + mean);
	}
	

}
