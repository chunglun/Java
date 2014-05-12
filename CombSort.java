package lu.sort;

public class CombSort {
	public void combSort(int[] input){
		int gap = input.length;
		double shrink = 1.3;
		boolean swapped = true;
		while((gap > 1) || (swapped)){
			gap = (int)(gap/shrink);
			if(gap < 1){
				gap = 1;
			}
			
			swapped = false;
			int i = 0;
			while((i+gap)<input.length){
				if(input[i] > input[i+gap]){
					int temp = input[i];
					input[i] = input[i+gap];
					input[i+gap] = temp;
					swapped = true;
				}
				i++;
			}
			System.out.println("gap: " + gap);
			for(int k = 0; k < input.length; k++)
				System.out.print(input[k] + "  ");
			System.out.println("");
		}
	}
}
