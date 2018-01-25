package com.sort.algo;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSorting {

	public static int[] quickSort(int[] inputArray) {

		quickSortAlgo(inputArray, 0, inputArray.length -1);
		return inputArray;
	}

	private static void quickSortAlgo(int[] inputArray, int start, int end) {

		if (start < end){
			
		int pivotIndex = partition(inputArray, start, end);
		
		quickSortAlgo(inputArray, start, pivotIndex - 1);
		quickSortAlgo(inputArray, pivotIndex + 1, end);
		}
	}

	private static int partition(int[] inputArray, int start, int end) {

		int pivot = inputArray[end];
		int pIndex = start;

		for (int i = start; i < end; i++) {
			if (inputArray[i] < pivot) {
				int temp = inputArray[i];
				inputArray[i] = inputArray[pIndex];
				inputArray[pIndex] = temp;
				pIndex++;
			}
		}

		int temp = inputArray[pIndex];
		inputArray[pIndex] = inputArray[end];
		inputArray[end] = temp;

		return pIndex;
	}

	// improves worst case time complexity
	private static int randomizePartition(int[] inputArray, int start, int end) {

		int pivotIndex = ThreadLocalRandom.current().nextInt(start, end);
		
		int temp = inputArray[pivotIndex];
		inputArray[pivotIndex] = inputArray[end];
		inputArray[end] = temp;
		
		int pivot = inputArray[end];
		int pIndex = start;

		for (int i = start; i < end; i++) {
			if (inputArray[i] < pivot) {
				temp = inputArray[i];
				inputArray[i] = inputArray[pIndex];
				inputArray[pIndex] = temp;
				pIndex++;
			}
		}

		temp = inputArray[pIndex];
		inputArray[pIndex] = inputArray[end];
		inputArray[end] = temp;

		return pIndex;
	}
}
