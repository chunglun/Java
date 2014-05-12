package lu.sort;

public class InsertionSort {
	public void insertSort(int[] input){
		for(int i = 1; i < input.length; i++){
			int value = input[i];
			int j = i - 1;
			while(j>=0 && input[j]>value){
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = value;
			//Print
			for(int k = 0; k < input.length; k++)
				System.out.print(input[k] + "  ");
			System.out.println("");
		}
	}
}
