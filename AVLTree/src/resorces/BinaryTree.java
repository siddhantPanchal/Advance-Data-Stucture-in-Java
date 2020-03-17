package resorces;

public class BinaryTree {

	private Node root;
	public BinaryTree() {
		setRoot(null);
	}
	public Node getRoot() {
		return root;
	}
	protected void setRoot(Node root) {
		this.root = root;
	}
	
	private void insert(Node n,Node temp) {
		if(temp.getData() > n.getData()) {
			if(temp.getLeftChild() == null) {
				n.setParent(temp);
				temp.setLeftChild(n);
			}
			else
				insert(n,temp.getLeftChild());
		}
		else if(temp.getData() < n.getData()) {
			if(temp.getRightChild() == null) {
				n.setParent(temp);
				temp.setRightChild(n);
			}
			else 
				insert(n, temp.getRightChild());
		}
		else if(temp.getData() == n.getData()) {
			return;
		}
	}
	
	protected void insert(Node n) {
		if(root == null) {
			root = n;
		}
		else
			insert(n, root);
	}
	
	
	protected void display(Node temp) {
		if(temp == null)
			return;
		else {
			display(temp.getLeftChild());
			System.out.print(temp.getData() + " ");
			display(temp.getRightChild());
		}
	}

}
