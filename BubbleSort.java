package lu.sort;

public class BubbleSort {
	public void bubbleSort(int[] input){
		for(int i = input.length - 1; i > 0; i--){
			boolean hasSwap = false;
			for(int j = 0; j < i; j++){
				if(input[j] > input[j+1]){
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
					hasSwap = true;
				}
			}
			if(!hasSwap){
				break;
			}
			for(int k = 0; k < input.length; k++)
				System.out.print(input[k] + "  ");
			System.out.println("");
		}
	}
}
