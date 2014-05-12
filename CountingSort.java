package lu.sort;

public class CountingSort {
	public void countingSort(int[] input){
		int max = input[0], min = input[0];
		for(int i = 0; i < input.length; i++){
			if(input[i] > max){
				max = input[i];
			}
			if(input[i] < min){
				min = input[i];
			}
		}
		
		int[] count = new int[max - min + 1];

		for(int i = 0; i < input.length; i++){
			count[input[i] - min]++;
		}
		int z = 0;
		for(int i = min; i <= max; i++){
			while(count[i-min] > 0){
				input[z] = i;
				z++;
				count[i-min]--;
			}
		}
	}
}
