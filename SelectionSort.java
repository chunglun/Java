package lu.sort;

public class SelectionSort {
	public void selectionSort(int[] input){
		int min;
		for(int i = 0; i < input.length; i++){
			min = i;
			for(int j = i+1; j < input.length; j++){
				if(input[j] < input[min]){
					min = j;
				}
			}
			//Exchange input[i] and input[max]
			int temp = input[i];
			input[i] = input[min];
			input[min] = temp;
			//Print
			for(int k = 0; k < input.length; k++)
				System.out.print(input[k] + "  ");
			System.out.println("");
		}
	}
}
