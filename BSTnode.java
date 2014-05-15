package lu.tree;

public class BSTnode<K> {
	private K key;
	private BSTnode<K> left, right;
	
	public BSTnode(){
	}
	
	public BSTnode(K key, BSTnode<K> left, BSTnode<K> right){
		this.key = key;
		this.left = left;
		this.right = right;
	}
	
	public K getKey(){
		return key;
	}
	
	public BSTnode<K> getLeft(){
		return left;
	}
	
	public BSTnode<K> getRight(){
		return right;
	}
	
	public void setKey(K newK){
		this.key = newK;
	}
	
	public void setLeft(BSTnode<K> newL){
		this.left = newL;
	}
	
	public void setRight(BSTnode<K> newR){
		this.right = newR;
	}
}
