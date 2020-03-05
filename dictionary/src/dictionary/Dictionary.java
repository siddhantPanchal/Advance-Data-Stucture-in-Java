package dictionary;

public class Dictionary extends BinarySearchTree {

	public void insert(Node n) {
		if(n != null) {
			insert(n, getRoot());
		}
	}
	
	public void display() {
		display(getRoot());
	}
}
