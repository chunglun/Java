package lu.tree;

public class AVL {
	private AVLnode root;
	
	public AVL(){
		root = null;
	}
	
	public void insert(int key){
		root = insert(key, root);
	}
	
	public void remove (int key){
	}
	
	public int findMin(){
		return findMin(root).getKey();
	}
	
	public int findMax(){
		return findMax(root).getKey();
	}
	
	public void printTree(){
		if(isEmpty()){
			System.out.println("Emprt tree");
		}
		else{
			printTree(root);
		}
	}
	
	public int lookup(int key){
		return lookup(key, root).getKey();
	}
	
	public void makeEmpty(){
		root = null;
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	private AVLnode findMin(AVLnode node){
		if(node == null){
			return null;
		}
		
		while(node.getLeft()!= null){
			node = node.getLeft();
		}
		return node;
	}
	
	private AVLnode findMax(AVLnode node){
		if(node == null){
			return null;
		}
		while(node.getRight() != null){
			node = node.getRight();
		}
		return node;
	}
	
	private AVLnode lookup(int key, AVLnode node){
		while(node!=null){
			if(key < node.getKey()){
				node = node.getLeft();
			}
			else if(key > node.getKey()){
				node = node.getRight();
			}
			else{
				return node;
			}
		}
		return null;
	}
	
	private static int height(AVLnode node){
		return (node == null) ? -1 : node.getHeight();
	}
	
	private static int max(int lhs, int rhs){
		return (lhs > rhs) ? lhs : rhs;
	}
	
	private AVLnode insert(int key, AVLnode node){
		if(node == null){
			node = new AVLnode(key);
		}
		else if(key < node.getKey()){
			node.setLeft(insert(key, node.getLeft()));
			if(height(node.getLeft()) - height(node.getRight()) == 2){
				if(key < node.getLeft().getKey()){
					node = rotateLL(node);
				}
				else{
					node = rotateLR(node);
				}
			}			
		}
		else if(key > node.getKey()){
			node.setRight(insert(key, node.getRight()));
			if(height(node.getRight()) - height(node.getLeft()) == 2){
				if(key > node.getRight().getKey()){
					node = rotateRR(node);
				}
				else{
					node = rotateRL(node);
				}
			}	
		}
		
		node.setHeight(max(height(node.getLeft()), height(node.getRight())) + 1);
		return node;
	}
	
	//LL
	private static AVLnode rotateLL(AVLnode node2){
		AVLnode node1 = node2.getLeft();
		node2.setLeft(node2.getRight());
		node1.setRight(node2);
		node2.setHeight(max(height(node2.getLeft()), height(node2.getRight())) + 1);
		node1.setHeight(max(height(node1.getLeft()), height(node1.getRight())) + 1);
		return node1;
	}
	
	//RR
	private static AVLnode rotateRR(AVLnode node1){
		AVLnode node2 = node1.getRight();		
		node1.setRight(node2.getLeft());
		node2.setLeft(node1);
		node2.setHeight(max(height(node2.getLeft()), height(node2.getRight())) + 1);
		node1.setHeight(max(height(node1.getLeft()), height(node1.getRight())) + 1);	
		return node2;
	}
	
	//LR
	private static AVLnode rotateLR(AVLnode node){
		node.setLeft(node.getLeft());
		return rotateRR(node);
	}
	
	//RL
	private static AVLnode rotateRL(AVLnode node){
		node.setRight(node.getRight());
		return rotateLL(node);
	}
	
	private void printTree(AVLnode node){
		if(node != null){
			printTree(node.getLeft());
			System.out.println(node.getKey());
			printTree(node.getRight());
		}
	}
}
