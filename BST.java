package lu.tree;

public class BST<K extends Comparable<K>> {
	private BSTnode<K> root;
	
	public BST(){
		root = null;
	}
	
	public void insert(K key) throws Exception{
		root = insert(root, key);
	}
	
	public void delete(K key){
		root = delete(root, key);
	}
	
	public boolean lookup(K key){
		return lookup(root, key);
	}
	
	public void printTree(){
		printTree(root);
	}
	
	private void printTree(BSTnode<K> node){
		if(node != null){
			printTree(node.getLeft());
			System.out.println(node.getKey());
			printTree(node.getRight());
		}
	}
	
	private boolean lookup(BSTnode<K> node, K key){
		if(node == null){
			return false;
		}		
		if(node.getKey().equals(key)){
			return true;
		}	
		if(key.compareTo(node.getKey()) < 0){
			return lookup(node.getLeft(), key);
		}
		else{
			return lookup(node.getRight(), key);
		}
	}
	
	private BSTnode<K> insert(BSTnode<K> node, K key) throws Exception{
		if(node == null){
			return new BSTnode<K>(key, null, null);
		}
		if(node.getKey().equals(key)){
			throw new Exception();
		}
		if(key.compareTo(node.getKey()) < 0){
			node.setLeft(insert(node.getLeft(), key));
			return node;
		}
		else{
			node.setRight(insert(node.getRight(), key));
			return node;
		}
	}
	
	private K smallest(BSTnode<K> node){
		if(node.getLeft() == null){
			return node.getKey();
		}
		else {
			return smallest(node.getLeft());
		}
	}
	
	private BSTnode<K> delete(BSTnode<K> node, K key){
		if(node == null){
			return null;
		}
		if(key.equals(node.getKey())){
			if((node.getLeft() == null) && (node.getRight() == null)){
				return null;
			}
			if(node.getLeft() == null){
				return node.getRight();
			}
			if(node.getRight() == null){
				return node.getLeft();
			}
			
			K minInRight = smallest(node.getRight());
			node.setKey(minInRight);
			node.setRight(delete(node.getRight(), minInRight));
			return node;
		}
		else if(key.compareTo(node.getKey()) < 0){
			node.setLeft(delete(node.getLeft(), key));
			return node;
		}
		else{
			node.setRight(delete(node.getRight(), key));
			return node;
		}
	}
}
