package lu.sort;

public class QuickSort {
	private int N;
	public void quickSort(int[] input){
		N = input.length;
		sort(0, N-1, input);
	}
	
	public void sort(int low, int high, int[] input){
		for(int i = 0; i < input.length; i++)
			System.out.print(input[i] + "  ");
		System.out.println("");
		
		int i = low;
		int j = high;
		int pivot = input[(low+high)/2];

		while(i <= j){
			while(input[i]<pivot){
				i++;
			}
			while(input[j]>pivot){
				j--;
			}
			if(i <= j){
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		if(low < j){
			sort(low, j, input);
		}
		if(i < high){
			sort(i, high, input);
		}
	}
}
