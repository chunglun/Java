package lu.tree;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args){
		BST<Integer> t = new BST<Integer>();
		List<Integer> elements = Arrays.asList(55, 66, 82, 6, 9, 0, 223, 572, 65, 12, 8, 32);
		for(Integer i : elements){
			try {
				t.insert(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		t.printTree();
	}
}
