package dictionary;

public class BinarySearchTree {
	
	private Node root;

	public BinarySearchTree() {
		root = null;
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	protected void insert(Node n,Node temp) {
		if(root == null) {
			root = n;
		}
		else {
			if(temp.getword().compareToIgnoreCase(n.getword()) > 0) {
				if(temp.getLeftChild() == null) {
					temp.setLeftChild(n);	
					return;
					}
				else {
					insert(n, temp.getLeftChild());
				}
			}else if(temp.getword().compareToIgnoreCase(n.getword()) < 0) {
				if(temp.getRightChild() == null) {
					temp.setRightChild(n);
					return;
				}else {
					insert(n, temp.getRightChild());
				}
			}
			else {
				return;
			}
		}
	}
	
	
	protected void display(Node temp) {
		if(temp == null) {
			return ;
		}
		else {
			display(temp.getLeftChild());
			temp.display();
			display(temp.getRightChild());
		}
	}

}
