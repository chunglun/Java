package lu.sort;

public class ShellSort {
	public void shellSort(int[] input){
		int N = input.length;
		int gap = N/2;
		while(gap > 0){
			for(int i = 0; i < gap; i++){
				for(int j = i + gap; j < N; j += gap){
					for(int k = j - gap; k  >= i; k -= gap){
						if(input[k] > input[k + gap]){
							int temp = input[k];
							input[k] = input[k + gap];
							input[k + gap] = temp;
						}
						else break;
					}
				}
			}
			System.out.println("gap: " + gap);
			for(int k = 0; k < input.length; k++)
				System.out.print(input[k] + "  ");
			System.out.println("");
			gap /= 2;
		}
	}
}
