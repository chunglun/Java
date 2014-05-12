package lu.sort;

public class LSDRadixSort {
	
	public int[] radixSort(int[] input){
		int numberOfDigit = countMaxNumberOfDigit(input);
		int bound = (int)(Math.pow(10.0, numberOfDigit));
		for(int place = 1; place <= bound; place *= 10){
            input = countingSort(input, place);
        }
        return input;
	}
	
	public int countMaxNumberOfDigit(int[] input){
		int k = 10;
		int numberOfDigit = 0;
		boolean allLess = false;
		
		while(!allLess){
			allLess = true;
			for(int i = 0; i < input.length; i++){
				if((input[i]/k) >= 1){
					allLess = false;
				}
			}
			numberOfDigit++;
			k *= 10;
		}
		return numberOfDigit;
	}
	
	public int[] countingSort(int[] input, int place){
		int[] out = new int[input.length];
		int[] count = new int[10];
		
		for(int i = 0; i < input.length; i++){
			int digit = (input[i]/place)%10;
			count[digit] += 1;
			
			for(int k = 0; k < input.length; k++)
				System.out.print(input[k] + "  ");
			System.out.println("");
			
		}
		for(int i = 1; i < count.length; i++){
			count[i] += count[i-1];
		}
		for(int i = input.length - 1; i >= 0; i--){
			int digit = (input[i]/place)%10;
			out[count[digit]-1] = input[i];
			count[digit]--;
		}
		return out;
	}
}
