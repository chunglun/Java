package lu.tree;

public class AVLnode {
	private int key, height;
	private AVLnode left, right;
	
	public AVLnode(){
	}
	
	public AVLnode(int key){
		this(key, null, null);
	}
	
	public AVLnode(int key, AVLnode left, AVLnode right){
		this.key = key;
		this.left = left;
		this.right = right;
		this.height = 0;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public AVLnode getLeft() {
		return left;
	}

	public void setLeft(AVLnode left) {
		this.left = left;
	}

	public AVLnode getRight() {
		return right;
	}

	public void setRight(AVLnode right) {
		this.right = right;
	}
}
