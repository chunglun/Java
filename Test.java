package lu.sort;

import java.util.Arrays;
import java.util.List;


public class Test {
	
	public static void main(String[] args){
		int[] input = {3, 7, 4, 9, 5, 2, 6, 1};
		
		InsertionSort is = new InsertionSort();
		is.insertSort(input);	
		for(int i = 0; i < input.length; i++)
			System.out.print(input[i] + "  ");
		System.out.println("\n\n");
		
		int[] input2 = {64, 25, 12, 22, 11};
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(input2);
		for(int i = 0; i < input2.length; i++)
			System.out.print(input2[i] + "  ");
		System.out.println("\n\n");
		
		List<Integer> input3 = Arrays.asList(38, 27, 43, 3, 9, 82, 10);
		MergeSort ms = new MergeSort();
		ms.mergeSort(input3);
		
		int[] input4 = {6, 5, 3, 1, 8, 7, 2, 4};
		HeapSort hs = new HeapSort();
		hs.heapSort(input4);
		
		System.out.println("\n");
		
		int[] input5 = {3, 7, 8, 5, 2, 1, 9, 5, 4};
		QuickSort qs = new QuickSort();
		qs.quickSort(input5);
		
		System.out.println("\n");
		
		int[] input6 = {3, 7, 8, 5, 2, 1, 9, 5, 4};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(input6);
		
		System.out.println("\n");
		
		int[] input7 = {3, 7, 8, 5, 2, 1, 9, 5, 4};
		ShellSort shs = new ShellSort();
		shs.shellSort(input7);
		
		System.out.println("\n");
		
		int[] input8 = {3, 7, 8, 5, 2, 1, 9, 5, 4};
		CombSort cs = new CombSort();
		cs.combSort(input8);
		
		System.out.println("\n");
		
		int[] input9 = {3766666, 7, 8, 5, 2, 1, 67679, 5, 4};
		LSDRadixSort rs = new LSDRadixSort();
		int[]result_rs = rs.radixSort(input9);
		for(int i = 0; i < result_rs.length; i++)
			System.out.print(result_rs[i] + "  ");
		System.out.println("\n\n");
		
		int[] input10 = {3766666, 7, 8, 5, 2, 1, 67679, 5, 4};
		CountingSort cos = new CountingSort();
		cos.countingSort(input10);
		for(int i = 0; i < input10.length; i++)
			System.out.print(input10[i] + "  ");
		System.out.println("\n\n");
	}
}
