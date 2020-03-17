package resorces;

public class AVLTree extends BinaryTree {

	protected Node lastNode;
	private static int count;
	
	public AVLTree() {
		super();
	}
	
	public void insert(int data) {
		Node n = new Node();
		n.setData(data);
		super.insert(n);
		height(getRoot());
		if(!isBalenced(getRoot())) {
			int lh = 0,rh = 0;
			try {
				lh = lastNode.getLeftChild().getHeight();
			}catch(NullPointerException e) {
//				System.out.println("NullPointerException Left ");
				lh = 0;
			}
			
			try {
				rh = lastNode.getRightChild().getHeight();
			}catch(NullPointerException e) {
//				System.out.println("NullPointerException Right ");
				rh = 0;
			}
//			System.out.println("lh : "+lh+" Rh : "+rh);
			if(lh > rh)
				rightRotation(lastNode);
			else 
				leftRotation(lastNode);
		}
	}

	public void display() {
		super.display(getRoot());
	}
	
	private int height(Node temp) {
		if(temp == null)
			return 0;
		int count1 = height(temp.getLeftChild()) + 1;
		int count2 = height(temp.getRightChild()) + 1;
		int count = Math.max(count1,count2);
		temp.setHeight(count);
//		System.out.println(temp.getData() + " height : " + temp.getHeight());
		return count;
	}
	
	private int balenceFactor(Node n) {
		int balencedFactor = 0 , lh = 0 , rh = 0;
//		balencedFactor = n.getLeftChild().getHeight() - n.getRightChild().getHeight();
		try {
			lh = n.getLeftChild().getHeight();
		}catch(NullPointerException e) {
//			System.out.println("NullPointerException Left ");
			lh = 0;
		}
		
		try {
			rh = n.getRightChild().getHeight();
		}catch(NullPointerException e) {
//			System.out.println("NullPointerException Right ");
			rh = 0;
		}
		
//		System.out.println("lh : "+lh+" Rh : "+rh);
		balencedFactor = lh - rh;
		n.setBalencedFactor(balencedFactor);
		return balencedFactor;
	}
	
	public boolean isBalenced() {
		height(getRoot());
		return isBalenced(getRoot());
	}
	
	private boolean isBalenced(Node temp) {
		if(temp == null) {
			return true;
		}
		else {
			int bf = balenceFactor(temp);
//			System.out.println("Temp : " + temp.getData() + " Bf : " + bf);
			lastNode = temp;
			if(bf >= -1  && bf <= 1) {
				return isBalenced(temp.getLeftChild()) && isBalenced(temp.getRightChild());
			}
			else
				return false;
		}
	}
	
	private void leftRotation(Node temp) {
		if(temp == getRoot())
			setRoot(temp.getRightChild());
		else
			temp.getRightChild().setParent(temp.getParent());
		temp.setRightChild(null);
		temp.setParent(null);
		insert(temp);
	}
	
	private void rightRotation(Node temp) {
		if(temp == getRoot())
			setRoot(temp.getLeftChild());
		else
			temp.getLeftChild().setParent(temp.getParent());
		temp.setLeftChild(null);
		temp.setParent(null);
		insert(temp);
	}
	
	public int search(int no) {
		count = 0;
		int searchCount = search(no,getRoot());
		return searchCount;
	}
	
	
	private int search(int no,Node temp) {
		if(temp == null)
			return count;
		else {
			if(no == temp.getData()) {
				System.out.println("Data is found ");
				return count;
			}
			else {
				if(no > temp.getData()) {
					search(no, temp.getRightChild());
				}
				else if(no < temp.getData()) {
					search(no, temp.getLeftChild());
				}
				count = count + 1;
			}
		}
		return count;
	}
	
	
}
