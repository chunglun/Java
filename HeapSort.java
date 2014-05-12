package lu.sort;

public class HeapSort {
	
	private int N;
	public void heapSort(int[] input){
		heapify(input);
		
		for(int k = 0; k < input.length; k++)
			System.out.print(input[k] + "  ");
		System.out.println("");
		
		for(int i = N; i > 0; i--){
			swap(input, 0, i);
			N--;
			maxheap(input, 0);
			
			for(int k = 0; k < input.length; k++)
				System.out.print(input[k] + "  ");
			System.out.println("");
			
		}
	}
	
	public void heapify(int[] input){
		N = input.length - 1;
		for(int i = N/2; i>=0; i--){
			maxheap(input, i);
		}
	}
	
	public void maxheap(int[] input, int i){
		int left = 2*i+1;
		int right = 2*i+2;
		int max = i;
		if(left<=N && input[left] > input[max]){
			max = left;
		}
		if(right<=N && input[right] > input[max]){
			max = right;
		}
		if(max!=i){
			swap(input, i, max);
			maxheap(input, max);
		}
	}
	
	public void swap(int[] input, int i, int j){
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
