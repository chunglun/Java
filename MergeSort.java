package lu.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeSort {
	public List<Integer> mergeSort(List<Integer> input){
		if(input.size() <= 1){
			return input;
		}
		int middle = input.size()/2;
		List<Integer> left = input.subList(0, middle);
		List<Integer> right = input.subList(middle, input.size());
		
		right = mergeSort(right);
		left = mergeSort(left);
		List<Integer> result = merge(left, right);
		
		for(int i = 0; i < result.size(); i++){
			System.out.print(result.get(i) + "  ");
		}
		System.out.println("");
		return result;
	}
	
	public List<Integer> merge(List<Integer> left, List<Integer> right){
		List<Integer> result = new ArrayList<Integer>();
		Iterator<Integer> it1 = left.iterator();
		Iterator<Integer> it2 = right.iterator();
		
		int x = it1.next();
		int y = it2.next();
		while(true){
			if(x <= y){
				result.add(x);
				if(it1.hasNext()){
					x = it1.next();
				}
				else{
					result.add(y);
					while(it2.hasNext()){
						result.add(it2.next());
					}
					break;
				}
			}
			else{
				result.add(y);
				if(it2.hasNext()){
					y = it2.next();
				}
				else{
					result.add(x);
					while(it1.hasNext()){
						result.add(it1.next());
					}
					break;
				}
			}
		}
		return result;
	}
}
